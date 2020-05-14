import { Component, OnInit } from '@angular/core';
import { ActivatedRouteSnapshot, NavigationEnd, NavigationError, Router } from '@angular/router';
import { JhiLanguageHelper } from 'app/core/language/language.helper';
import { ProfileInfo } from 'app/shared/layouts/profiles/profile-info.model';
import { ProfileService } from 'app/shared/layouts/profiles/profile.service';
import { SentryErrorHandler } from 'app/core/sentry/sentry.error-handler';

@Component({
    selector: 'jhi-main',
    templateUrl: './main.component.html',
})
export class JhiMainComponent implements OnInit {
    constructor(private jhiLanguageHelper: JhiLanguageHelper, private router: Router, private profileService: ProfileService, private sentryErrorHandler: SentryErrorHandler) {
        this.setupErrorHandling().then(null);
    }

    private async setupErrorHandling() {
        this.profileService.getProfileInfo().subscribe((profileInfo: ProfileInfo) => {
            // sentry is only activated if it was specified in the application.yml file
            this.sentryErrorHandler.initSentry(profileInfo);
        });
    }

    private getPageTitle(routeSnapshot: ActivatedRouteSnapshot) {
        let title: string = routeSnapshot.data && routeSnapshot.data['pageTitle'] ? routeSnapshot.data['pageTitle'] : 'artemisApp';
        if (routeSnapshot.firstChild) {
            title = this.getPageTitle(routeSnapshot.firstChild) || title;
        }
        return title;
    }

    /** Lifecycle hook which is called on initialisation. Subscribes to {@link router} events and handles {@link NavigationEnd}, {@link NavigationError} 404.
     * When a {@link NavigationEnd} event is received it updates the window by calling {@link jhiLanguageHelper~updateTitle} with {@link getPageTitle}.
     * In case of a {@link NavigationError} it navigates to '/404'.
     * See {@link router~navigate}.
     */
    ngOnInit() {
        this.router.events.subscribe((event) => {
            if (event instanceof NavigationEnd) {
                this.jhiLanguageHelper.updateTitle(this.getPageTitle(this.router.routerState.snapshot.root));
            }
            if (event instanceof NavigationError && event.error.status === 404) {
                // noinspection JSIgnoredPromiseFromCall
                this.router.navigate(['/404']);
            }
        });
    }
}
