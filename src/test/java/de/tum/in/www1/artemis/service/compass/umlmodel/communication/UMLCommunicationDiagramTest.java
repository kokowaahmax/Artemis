package de.tum.in.www1.artemis.service.compass.umlmodel.communication;

import static com.google.gson.JsonParser.parseString;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import de.tum.in.www1.artemis.service.compass.controller.UMLModelParser;
import de.tum.in.www1.artemis.service.compass.umlmodel.AbstractUMLDiagramTest;
import de.tum.in.www1.artemis.service.compass.umlmodel.UMLDiagram;
import de.tum.in.www1.artemis.service.compass.umlmodel.object.UMLObject;

public class UMLCommunicationDiagramTest extends AbstractUMLDiagramTest {

    private static final String communicationModel1 = "{\"version\":\"2.0.0\",\"size\":{\"width\":830,\"height\":640},\"type\":\"CommunicationDiagram\",\"interactive\":{\"elements\":[],\"relationships\":[]},\"elements\":[{\"id\":\"88a80235-cb86-4b28-9f75-9f471038cd2c\",\"name\":\"Jonas: Student\",\"owner\":null,\"type\":\"ObjectName\",\"bounds\":{\"x\":0,\"y\":180,\"width\":200,\"height\":70},\"attributes\":[],\"methods\":[\"54c429da-6896-4437-8636-81fb5ea5f1be\"]},{\"id\":\"54c429da-6896-4437-8636-81fb5ea5f1be\",\"name\":\"receiveCertificate()\",\"owner\":\"88a80235-cb86-4b28-9f75-9f471038cd2c\",\"type\":\"ObjectMethod\",\"bounds\":{\"x\":0,\"y\":220,\"width\":200,\"height\":30}},{\"id\":\"02e688ce-f8f0-459d-9ea1-8bb1c1375882\",\"name\":\"EIST: Course\",\"owner\":null,\"type\":\"ObjectName\",\"bounds\":{\"x\":370,\"y\":0,\"width\":200,\"height\":100},\"attributes\":[],\"methods\":[\"e2428d92-8338-443f-acc8-2c98a1feb7a4\",\"3874a3d7-7202-49ce-9e6f-cdb52a97b4a3\"]},{\"id\":\"e2428d92-8338-443f-acc8-2c98a1feb7a4\",\"name\":\"enroll(Student)\",\"owner\":\"02e688ce-f8f0-459d-9ea1-8bb1c1375882\",\"type\":\"ObjectMethod\",\"bounds\":{\"x\":370,\"y\":40,\"width\":200,\"height\":30}},{\"id\":\"3874a3d7-7202-49ce-9e6f-cdb52a97b4a3\",\"name\":\"start()\",\"owner\":\"02e688ce-f8f0-459d-9ea1-8bb1c1375882\",\"type\":\"ObjectMethod\",\"bounds\":{\"x\":370,\"y\":70,\"width\":200,\"height\":30}},{\"id\":\"a5ccd828-ac7e-471e-9c30-80bc7e95a682\",\"name\":\"Stephan: Lecturer\",\"owner\":null,\"type\":\"ObjectName\",\"bounds\":{\"x\":20,\"y\":490,\"width\":200,\"height\":70},\"attributes\":[],\"methods\":[\"8d262dd9-cdf1-4ac9-9daa-b0699b40f0c4\"]},{\"id\":\"8d262dd9-cdf1-4ac9-9daa-b0699b40f0c4\",\"name\":\"evaluate()\",\"owner\":\"a5ccd828-ac7e-471e-9c30-80bc7e95a682\",\"type\":\"ObjectMethod\",\"bounds\":{\"x\":20,\"y\":530,\"width\":200,\"height\":30}},{\"id\":\"4f2ba2df-ca34-4bd0-b58e-2a45248b48a3\",\"name\":\"Final: Exam\",\"owner\":null,\"type\":\"ObjectName\",\"bounds\":{\"x\":630,\"y\":510,\"width\":200,\"height\":130},\"attributes\":[],\"methods\":[\"dd1661a5-4994-4c24-8669-8c65d4127b46\",\"0695a2d8-763c-4b39-8637-bfe445cd36f5\",\"96adc0f4-6d96-4bd8-8c02-085156ebcf70\"]},{\"id\":\"dd1661a5-4994-4c24-8669-8c65d4127b46\",\"name\":\"prepare()\",\"owner\":\"4f2ba2df-ca34-4bd0-b58e-2a45248b48a3\",\"type\":\"ObjectMethod\",\"bounds\":{\"x\":630,\"y\":550,\"width\":200,\"height\":30}},{\"id\":\"0695a2d8-763c-4b39-8637-bfe445cd36f5\",\"name\":\"take(Student)\",\"owner\":\"4f2ba2df-ca34-4bd0-b58e-2a45248b48a3\",\"type\":\"ObjectMethod\",\"bounds\":{\"x\":630,\"y\":580,\"width\":200,\"height\":30}},{\"id\":\"96adc0f4-6d96-4bd8-8c02-085156ebcf70\",\"name\":\"correct()\",\"owner\":\"4f2ba2df-ca34-4bd0-b58e-2a45248b48a3\",\"type\":\"ObjectMethod\",\"bounds\":{\"x\":630,\"y\":610,\"width\":200,\"height\":30}}],\"relationships\":[{\"id\":\"31bb8f7f-1c34-4f2b-8ae1-68d06ed998e2\",\"name\":\"\",\"type\":\"CommunicationLink\",\"source\":{\"element\":\"88a80235-cb86-4b28-9f75-9f471038cd2c\",\"direction\":\"Up\"},\"target\":{\"element\":\"02e688ce-f8f0-459d-9ea1-8bb1c1375882\",\"direction\":\"Left\"},\"path\":[{\"x\":0,\"y\":189.640625},{\"x\":0,\"y\":59.640625},{\"x\":270,\"y\":59.640625}],\"bounds\":{\"x\":100,\"y\":-9.640625,\"width\":270,\"height\":189.640625},\"messages\":[{\"name\":\"1a: enroll(Jonas)\",\"direction\":\"target\"},{\"name\":\"1b: start()\",\"direction\":\"target\"}]},{\"id\":\"38732c12-ba10-4d23-aa77-3e52745342df\",\"name\":\"\",\"type\":\"CommunicationLink\",\"source\":{\"element\":\"88a80235-cb86-4b28-9f75-9f471038cd2c\",\"direction\":\"Down\"},\"target\":{\"element\":\"a5ccd828-ac7e-471e-9c30-80bc7e95a682\",\"direction\":\"Up\"},\"path\":[{\"x\":295.796875,\"y\":0},{\"x\":295.796875,\"y\":240}],\"bounds\":{\"x\":-185.796875,\"y\":250,\"width\":401.734375,\"height\":240},\"messages\":[{\"name\":\"2.4: [passed==true] receiveCertificate()\",\"direction\":\"source\"},{\"name\":\"4: evaluate()\",\"direction\":\"target\"}]},{\"id\":\"58941a9f-0f6e-4460-95a7-b459bd930182\",\"name\":\"\",\"type\":\"CommunicationLink\",\"source\":{\"element\":\"a5ccd828-ac7e-471e-9c30-80bc7e95a682\",\"direction\":\"Right\"},\"target\":{\"element\":\"4f2ba2df-ca34-4bd0-b58e-2a45248b48a3\",\"direction\":\"Left\"},\"path\":[{\"x\":0,\"y\":59.640625},{\"x\":410,\"y\":59.640625}],\"bounds\":{\"x\":220,\"y\":475.359375,\"width\":410,\"height\":59.640625},\"messages\":[{\"name\":\"2.1: prepare()\",\"direction\":\"target\"},{\"name\":\"2.3: correct()\",\"direction\":\"target\"}]},{\"id\":\"b0189b08-c0db-4e0b-a542-fe6b30f20ace\",\"name\":\"\",\"type\":\"CommunicationLink\",\"source\":{\"element\":\"4f2ba2df-ca34-4bd0-b58e-2a45248b48a3\",\"direction\":\"Up\"},\"target\":{\"element\":\"88a80235-cb86-4b28-9f75-9f471038cd2c\",\"direction\":\"Right\"},\"path\":[{\"x\":530,\"y\":295},{\"x\":530,\"y\":0},{\"x\":0,\"y\":0}],\"bounds\":{\"x\":200,\"y\":215,\"width\":530,\"height\":295},\"messages\":[]},{\"id\":\"b315c647-2631-401e-b3d1-ea05440f20fc\",\"name\":\"\",\"type\":\"CommunicationLink\",\"source\":{\"element\":\"4f2ba2df-ca34-4bd0-b58e-2a45248b48a3\",\"direction\":\"Up\"},\"target\":{\"element\":\"88a80235-cb86-4b28-9f75-9f471038cd2c\",\"direction\":\"Right\"},\"path\":[{\"x\":530,\"y\":335.4375},{\"x\":530,\"y\":40.4375},{\"x\":0,\"y\":40.4375}],\"bounds\":{\"x\":200,\"y\":174.5625,\"width\":530,\"height\":335.4375},\"messages\":[{\"name\":\"2.2: take(Jonas)\",\"direction\":\"target\"}]}],\"assessments\":[]}";

    private static final String communicationModel2 = "{\"version\":\"2.0.0\",\"type\":\"CommunicationDiagram\",\"size\":{\"width\":807.4290008544922,\"height\":645.2414169311523},\"interactive\":{\"elements\":[],\"relationships\":[]},\"elements\":[{\"id\":\"619ddf50-f2a6-4004-9fb3-db64ee10cd6e\",\"name\":\":Account\",\"type\":\"ObjectName\",\"owner\":null,\"bounds\":{\"x\":404.54542541503906,\"y\":6.363616943359375,\"width\":200,\"height\":70},\"attributes\":[\"38af1eea-2c19-48d2-8b60-dd74a897f1ee\"],\"methods\":[]},{\"id\":\"38af1eea-2c19-48d2-8b60-dd74a897f1ee\",\"name\":\"+ attribute: Type\",\"type\":\"ObjectAttribute\",\"owner\":\"619ddf50-f2a6-4004-9fb3-db64ee10cd6e\",\"bounds\":{\"x\":404.54542541503906,\"y\":46.363616943359375,\"width\":200,\"height\":30}},{\"id\":\"50f51829-2f04-4454-ae29-03f7935b2074\",\"name\":\"Bob:Rider\",\"type\":\"ObjectName\",\"owner\":null,\"bounds\":{\"x\":0,\"y\":0,\"width\":200,\"height\":70},\"attributes\":[\"20f29131-bd9a-4a69-9190-53c29432953f\"],\"methods\":[]},{\"id\":\"20f29131-bd9a-4a69-9190-53c29432953f\",\"name\":\"+ attribute: Type\",\"type\":\"ObjectAttribute\",\"owner\":\"50f51829-2f04-4454-ae29-03f7935b2074\",\"bounds\":{\"x\":0,\"y\":40,\"width\":200,\"height\":30}},{\"id\":\"bb0de015-373b-4860-b6ab-8273e0cefca1\",\"name\":\":PEVManager\",\"type\":\"ObjectName\",\"owner\":null,\"bounds\":{\"x\":261.8181915283203,\"y\":277.27272033691406,\"width\":200,\"height\":70},\"attributes\":[\"dab2246c-f090-447c-bfbb-e3e8c1272381\"],\"methods\":[]},{\"id\":\"dab2246c-f090-447c-bfbb-e3e8c1272381\",\"name\":\"+ attribute: Type\",\"type\":\"ObjectAttribute\",\"owner\":\"bb0de015-373b-4860-b6ab-8273e0cefca1\",\"bounds\":{\"x\":261.8181915283203,\"y\":317.27272033691406,\"width\":200,\"height\":30}},{\"id\":\"8a7a657c-f4c3-483d-a1d0-8974152c9b05\",\"name\":\"Lemon:E-Kickscooter\",\"type\":\"ObjectName\",\"owner\":null,\"bounds\":{\"x\":121.81816101074219,\"y\":557.2727241516113,\"width\":200,\"height\":70},\"attributes\":[\"741e7d4c-e2d2-4f28-956f-494d9261763c\"],\"methods\":[]},{\"id\":\"741e7d4c-e2d2-4f28-956f-494d9261763c\",\"name\":\"+ attribute: Type\",\"type\":\"ObjectAttribute\",\"owner\":\"8a7a657c-f4c3-483d-a1d0-8974152c9b05\",\"bounds\":{\"x\":121.81816101074219,\"y\":597.2727241516113,\"width\":200,\"height\":30}},{\"id\":\"7ba2a402-6948-43cb-9b2f-2341b2bf940f\",\"name\":\"Argentina:E-Moped\",\"type\":\"ObjectName\",\"owner\":null,\"bounds\":{\"x\":333.63636779785156,\"y\":558.1817588806152,\"width\":200,\"height\":70},\"attributes\":[\"bc1cb9a8-dfc4-463b-a9ac-3ce9e253f8f6\"],\"methods\":[]},{\"id\":\"bc1cb9a8-dfc4-463b-a9ac-3ce9e253f8f6\",\"name\":\"+ attribute: Type\",\"type\":\"ObjectAttribute\",\"owner\":\"7ba2a402-6948-43cb-9b2f-2341b2bf940f\",\"bounds\":{\"x\":333.63636779785156,\"y\":598.1817588806152,\"width\":200,\"height\":30}}],\"relationships\":[{\"id\":\"64040203-6e35-4b42-8ab5-71b544a70fa6\",\"name\":\"\",\"type\":\"CommunicationLink\",\"owner\":null,\"bounds\":{\"x\":200,\"y\":38.18180847167969,\"width\":204.54542541503906,\"height\":1},\"path\":[{\"x\":0,\"y\":0},{\"x\":204.54542541503906,\"y\":0}],\"source\":{\"direction\":\"Right\",\"element\":\"50f51829-2f04-4454-ae29-03f7935b2074\"},\"target\":{\"direction\":\"Left\",\"element\":\"619ddf50-f2a6-4004-9fb3-db64ee10cd6e\"},\"messages\":[{\"name\":\"1.1 : setupAccount()\",\"direction\":\"source\"},{\"name\":\"1.2 : addPayment()\",\"direction\":\"source\"},{\"name\":\"1.3: verifyPayment()\",\"direction\":\"source\"},{\"name\":\"5. pay()\",\"direction\":\"source\"}]},{\"id\":\"15491060-17d4-4b4e-9a89-689de95e80d8\",\"name\":\"\",\"type\":\"CommunicationLink\",\"owner\":null,\"bounds\":{\"x\":100,\"y\":70,\"width\":261.8181915283203,\"height\":207.27272033691406},\"path\":[{\"x\":0,\"y\":0},{\"x\":0,\"y\":103.63636016845703},{\"x\":261.8181915283203,\"y\":103.63636016845703},{\"x\":261.8181915283203,\"y\":207.27272033691406}],\"source\":{\"direction\":\"Down\",\"element\":\"50f51829-2f04-4454-ae29-03f7935b2074\"},\"target\":{\"direction\":\"Up\",\"element\":\"bb0de015-373b-4860-b6ab-8273e0cefca1\"},\"messages\":[{\"name\":\"2.1:locate(2)\",\"direction\":\"source\"}]},{\"id\":\"ad1c9352-b10c-4c6e-8e2b-b52621b7f0fc\",\"name\":\"\",\"type\":\"CommunicationLink\",\"owner\":null,\"bounds\":{\"x\":291.81817626953125,\"y\":347.27272033691406,\"width\":1,\"height\":210.00000381469727},\"path\":[{\"x\":0,\"y\":0},{\"x\":0,\"y\":210.00000381469727}],\"source\":{\"direction\":\"Down\",\"element\":\"bb0de015-373b-4860-b6ab-8273e0cefca1\"},\"target\":{\"direction\":\"Up\",\"element\":\"8a7a657c-f4c3-483d-a1d0-8974152c9b05\"},\"messages\":[{\"name\":\"2.2 : find()\",\"direction\":\"source\"}]},{\"id\":\"28a56de2-e3e9-4519-b38e-a9720ce4764d\",\"name\":\"\",\"type\":\"CommunicationLink\",\"owner\":null,\"bounds\":{\"x\":397.72727966308594,\"y\":347.27272033691406,\"width\":1,\"height\":210.90903854370117},\"path\":[{\"x\":0,\"y\":0},{\"x\":0,\"y\":210.90903854370117}],\"source\":{\"direction\":\"Down\",\"element\":\"bb0de015-373b-4860-b6ab-8273e0cefca1\"},\"target\":{\"direction\":\"Up\",\"element\":\"7ba2a402-6948-43cb-9b2f-2341b2bf940f\"},\"messages\":[{\"name\":\"2.3 :find()\",\"direction\":\"source\"}]},{\"id\":\"487b42cb-1403-43b1-a763-15790e61e174\",\"name\":\"\",\"type\":\"CommunicationLink\",\"owner\":null,\"bounds\":{\"x\":160.9090805053711,\"y\":70,\"width\":1,\"height\":487.2727241516113},\"path\":[{\"x\":0,\"y\":0},{\"x\":0,\"y\":487.2727241516113}],\"source\":{\"direction\":\"Down\",\"element\":\"50f51829-2f04-4454-ae29-03f7935b2074\"},\"target\":{\"direction\":\"Up\",\"element\":\"8a7a657c-f4c3-483d-a1d0-8974152c9b05\"},\"messages\":[{\"name\":\"3.: unlock()\",\"direction\":\"source\"},{\"name\":\"4. : return()\",\"direction\":\"source\"}]}],\"assessments\":[]}";

    @Test
    void similarityCommunicationDiagram_EqualModels() {
        compareSubmissions(modelingSubmission(communicationModel1), modelingSubmission(communicationModel1), 0.8, 1.0);
        compareSubmissions(modelingSubmission(communicationModel2), modelingSubmission(communicationModel2), 0.8, 1.0);
    }

    @Test
    void similarityCommunicationDiagram_DifferentModels() {
        compareSubmissions(modelingSubmission(communicationModel1), modelingSubmission(communicationModel2), 0.0, 0.2241);
    }

    @Test
    void parseCommunicationDiagramModelCorrectly() throws IOException {
        UMLDiagram diagram = UMLModelParser.buildModelFromJSON(parseString(communicationModel2).getAsJsonObject(), 1L);
        assertThat(diagram).isInstanceOf(UMLCommunicationDiagram.class);
        UMLCommunicationDiagram communicationDiagram = (UMLCommunicationDiagram) diagram;
        assertThat(communicationDiagram.getObjectList()).hasSize(5);
        assertThat(communicationDiagram.getCommunicationLinkList()).hasSize(5);

        assertThat(communicationDiagram.getElementByJSONID("619ddf50-f2a6-4004-9fb3-db64ee10cd6e")).isInstanceOf(UMLObject.class);
        assertThat(communicationDiagram.getElementByJSONID("64040203-6e35-4b42-8ab5-71b544a70fa6")).isInstanceOf(UMLCommunicationLink.class);
    }
}