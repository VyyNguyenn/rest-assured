package vynguyen.jira.api;

import utilities.RequestCapabilities;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class GetJiraProject extends RequestCapabilities {
    public Response getProjectInfo(){
        RequestSpecification request = given();
        request.baseUri("https://vynguyen-restassured.atlassian.net");
        request.basePath("/rest/api/3/project/REST");

        Response response = request
                                .header(acceptHeader)
                                .header(authorizationHeader)
                            .when()
                                .get();
        //response.prettyPrint();
        return response;
    }
}
