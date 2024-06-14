package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RestAssuredDeleteRequest {
    @Test
    public void getAllProjects(){
        String baseURI="https://app.fireflink.com/";
        String userId="USR14079";
        String endpoint="project/optimize/v1/projects/user/"+userId;

        RestAssured.given()
                .header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNODJhX1U2VHRFSnFvWV9jdzNfWi1KaWVoZ2hQcjJ4QjVMbnlNZ3RtRGs0In0.eyJleHAiOjE3MTA3NDc5NzQsImlhdCI6MTcxMDU3NTE3NCwianRpIjoiMjc0OGEyMzAtNWU3Mi00ZmJiLWE2YTAtMTY0OTQ1ZWY2ZGU2IiwiaXNzIjoiaHR0cHM6Ly9hcHAuZmlyZWZsaW5rLmNvbTozMTAwMS9yZWFsbXMvRmlyZUZsaW5rIiwic3ViIjoiZjphZjhmZmUyYS1jMTIyLTQ3ZjAtOTIxYS01ODgyODcwMjVjZmM6a2F2eWEyM3RAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIzNjJkOWVhMi02NzQ5LTQ0MWUtYmY3NS0yY2Y5YTY0YjBiOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjM2MmQ5ZWEyLTY3NDktNDQxZS1iZjc1LTJjZjlhNjRiMGI5MyIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6IlN5ZWQiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDOTgzMiIsInByZWZlcnJlZF91c2VybmFtZSI6IlN5ZWQiLCJ1c2VyTmFtZSI6ImthdnlhMjN0QGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTQwNzkiLCJsaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWwiOiJrYXZ5YTIzdEBnbWFpbC5jb20ifQ.ssWDdkdK53RlxYpSFDV7-BP2rcD3PibH5-kdUO1t8HCyNKC9GMVOa7e2YWKuUQ3Vb5RrjJESBqFBzo_wUKpSGxhONf0fKwkfCP52hdzFugX-YAsc_9iJ-mkhA9kmURGBGCwTv88GdJvadMFioHMDNDZHoDz7tQYmhuQhcwpCfZjL00-Dhrp50u8PiOoHQ5p9ZxaFEChgD8I0vg3fP0Vh_K-iIpiacSRybcHSaz4zDw1AvJl9d4dDsdIpqoV8PcgeFhOIfwQApW9zVwOJDmcmSlwSNhKHTVGnaSr-nxG_EvV_cVuzvyjFVgokntW86CdP0lpg6GDoCXKw1Q23D9targ")
                .when()
                    .baseUri(baseURI)
                    .get(endpoint)
                .then()
                    .statusCode(200)
                    .log().body();
    }

    @Test
    public void deleteProject(){
        //way 1
        String projectId="PJT1166";
        String baseURI="https://app.fireflink.com/";
        String endPoint="project/optimize/v1/projects/"+projectId;

        RestAssured.baseURI=baseURI;
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNODJhX1U2VHRFSnFvWV9jdzNfWi1KaWVoZ2hQcjJ4QjVMbnlNZ3RtRGs0In0.eyJleHAiOjE3MTA3NDc5NzQsImlhdCI6MTcxMDU3NTE3NCwianRpIjoiMjc0OGEyMzAtNWU3Mi00ZmJiLWE2YTAtMTY0OTQ1ZWY2ZGU2IiwiaXNzIjoiaHR0cHM6Ly9hcHAuZmlyZWZsaW5rLmNvbTozMTAwMS9yZWFsbXMvRmlyZUZsaW5rIiwic3ViIjoiZjphZjhmZmUyYS1jMTIyLTQ3ZjAtOTIxYS01ODgyODcwMjVjZmM6a2F2eWEyM3RAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIzNjJkOWVhMi02NzQ5LTQ0MWUtYmY3NS0yY2Y5YTY0YjBiOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjM2MmQ5ZWEyLTY3NDktNDQxZS1iZjc1LTJjZjlhNjRiMGI5MyIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6IlN5ZWQiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDOTgzMiIsInByZWZlcnJlZF91c2VybmFtZSI6IlN5ZWQiLCJ1c2VyTmFtZSI6ImthdnlhMjN0QGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTQwNzkiLCJsaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWwiOiJrYXZ5YTIzdEBnbWFpbC5jb20ifQ.ssWDdkdK53RlxYpSFDV7-BP2rcD3PibH5-kdUO1t8HCyNKC9GMVOa7e2YWKuUQ3Vb5RrjJESBqFBzo_wUKpSGxhONf0fKwkfCP52hdzFugX-YAsc_9iJ-mkhA9kmURGBGCwTv88GdJvadMFioHMDNDZHoDz7tQYmhuQhcwpCfZjL00-Dhrp50u8PiOoHQ5p9ZxaFEChgD8I0vg3fP0Vh_K-iIpiacSRybcHSaz4zDw1AvJl9d4dDsdIpqoV8PcgeFhOIfwQApW9zVwOJDmcmSlwSNhKHTVGnaSr-nxG_EvV_cVuzvyjFVgokntW86CdP0lpg6GDoCXKw1Q23D9targ");

        Response response=requestSpecification.delete(endPoint);
        System.out.println(response.getBody().asPrettyString());

        Assert.assertEquals(response.statusCode(),200);

        System.out.println("------------------------------------------------");

        //way2
        RestAssured.given()
                    .header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNODJhX1U2VHRFSnFvWV9jdzNfWi1KaWVoZ2hQcjJ4QjVMbnlNZ3RtRGs0In0.eyJleHAiOjE3MTA3NDc5NzQsImlhdCI6MTcxMDU3NTE3NCwianRpIjoiMjc0OGEyMzAtNWU3Mi00ZmJiLWE2YTAtMTY0OTQ1ZWY2ZGU2IiwiaXNzIjoiaHR0cHM6Ly9hcHAuZmlyZWZsaW5rLmNvbTozMTAwMS9yZWFsbXMvRmlyZUZsaW5rIiwic3ViIjoiZjphZjhmZmUyYS1jMTIyLTQ3ZjAtOTIxYS01ODgyODcwMjVjZmM6a2F2eWEyM3RAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIzNjJkOWVhMi02NzQ5LTQ0MWUtYmY3NS0yY2Y5YTY0YjBiOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjM2MmQ5ZWEyLTY3NDktNDQxZS1iZjc1LTJjZjlhNjRiMGI5MyIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6IlN5ZWQiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDOTgzMiIsInByZWZlcnJlZF91c2VybmFtZSI6IlN5ZWQiLCJ1c2VyTmFtZSI6ImthdnlhMjN0QGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTQwNzkiLCJsaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWwiOiJrYXZ5YTIzdEBnbWFpbC5jb20ifQ.ssWDdkdK53RlxYpSFDV7-BP2rcD3PibH5-kdUO1t8HCyNKC9GMVOa7e2YWKuUQ3Vb5RrjJESBqFBzo_wUKpSGxhONf0fKwkfCP52hdzFugX-YAsc_9iJ-mkhA9kmURGBGCwTv88GdJvadMFioHMDNDZHoDz7tQYmhuQhcwpCfZjL00-Dhrp50u8PiOoHQ5p9ZxaFEChgD8I0vg3fP0Vh_K-iIpiacSRybcHSaz4zDw1AvJl9d4dDsdIpqoV8PcgeFhOIfwQApW9zVwOJDmcmSlwSNhKHTVGnaSr-nxG_EvV_cVuzvyjFVgokntW86CdP0lpg6GDoCXKw1Q23D9targ")
                .when()
                    .baseUri(baseURI)
                    .delete(endPoint)
                .then()
                    .log().body();
    }
}