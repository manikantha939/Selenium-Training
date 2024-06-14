package authentication;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BearerToken {
    @Test
    public void bearer(){
        RestAssured.baseURI="https://app.fireflink.com/";
        RestAssured.basePath="project/optimize/v1/projects/user/USR14079";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNODJhX1U2VHRFSnFvWV9jdzNfWi1KaWVoZ2hQcjJ4QjVMbnlNZ3RtRGs0In0.eyJleHAiOjE3MTA3NDc5NzQsImlhdCI6MTcxMDU3NTE3NCwianRpIjoiMjc0OGEyMzAtNWU3Mi00ZmJiLWE2YTAtMTY0OTQ1ZWY2ZGU2IiwiaXNzIjoiaHR0cHM6Ly9hcHAuZmlyZWZsaW5rLmNvbTozMTAwMS9yZWFsbXMvRmlyZUZsaW5rIiwic3ViIjoiZjphZjhmZmUyYS1jMTIyLTQ3ZjAtOTIxYS01ODgyODcwMjVjZmM6a2F2eWEyM3RAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIzNjJkOWVhMi02NzQ5LTQ0MWUtYmY3NS0yY2Y5YTY0YjBiOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjM2MmQ5ZWEyLTY3NDktNDQxZS1iZjc1LTJjZjlhNjRiMGI5MyIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6IlN5ZWQiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDOTgzMiIsInByZWZlcnJlZF91c2VybmFtZSI6IlN5ZWQiLCJ1c2VyTmFtZSI6ImthdnlhMjN0QGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTQwNzkiLCJsaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWwiOiJrYXZ5YTIzdEBnbWFpbC5jb20ifQ.ssWDdkdK53RlxYpSFDV7-BP2rcD3PibH5-kdUO1t8HCyNKC9GMVOa7e2YWKuUQ3Vb5RrjJESBqFBzo_wUKpSGxhONf0fKwkfCP52hdzFugX-YAsc_9iJ-mkhA9kmURGBGCwTv88GdJvadMFioHMDNDZHoDz7tQYmhuQhcwpCfZjL00-Dhrp50u8PiOoHQ5p9ZxaFEChgD8I0vg3fP0Vh_K-iIpiacSRybcHSaz4zDw1AvJl9d4dDsdIpqoV8PcgeFhOIfwQApW9zVwOJDmcmSlwSNhKHTVGnaSr-nxG_EvV_cVuzvyjFVgokntW86CdP0lpg6GDoCXKw1Q23D9targ");
        Response response=requestSpecification.get();
        JsonPath jsonPath=response.jsonPath();
        String name=jsonPath.getString("responseObject.project.name[0]");
        System.out.println(name);
        Assert.assertEquals(name,"Web Tesing");
//        System.out.println(response.getBody().asPrettyString());
        Assert.assertEquals(response.statusCode(),200);

        System.out.println("---------------------------------------------------");

        //way2
        RestAssured.given()
                    .header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNODJhX1U2VHRFSnFvWV9jdzNfWi1KaWVoZ2hQcjJ4QjVMbnlNZ3RtRGs0In0.eyJleHAiOjE3MTA3NDc5NzQsImlhdCI6MTcxMDU3NTE3NCwianRpIjoiMjc0OGEyMzAtNWU3Mi00ZmJiLWE2YTAtMTY0OTQ1ZWY2ZGU2IiwiaXNzIjoiaHR0cHM6Ly9hcHAuZmlyZWZsaW5rLmNvbTozMTAwMS9yZWFsbXMvRmlyZUZsaW5rIiwic3ViIjoiZjphZjhmZmUyYS1jMTIyLTQ3ZjAtOTIxYS01ODgyODcwMjVjZmM6a2F2eWEyM3RAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIzNjJkOWVhMi02NzQ5LTQ0MWUtYmY3NS0yY2Y5YTY0YjBiOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjM2MmQ5ZWEyLTY3NDktNDQxZS1iZjc1LTJjZjlhNjRiMGI5MyIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6IlN5ZWQiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDOTgzMiIsInByZWZlcnJlZF91c2VybmFtZSI6IlN5ZWQiLCJ1c2VyTmFtZSI6ImthdnlhMjN0QGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTQwNzkiLCJsaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWwiOiJrYXZ5YTIzdEBnbWFpbC5jb20ifQ.ssWDdkdK53RlxYpSFDV7-BP2rcD3PibH5-kdUO1t8HCyNKC9GMVOa7e2YWKuUQ3Vb5RrjJESBqFBzo_wUKpSGxhONf0fKwkfCP52hdzFugX-YAsc_9iJ-mkhA9kmURGBGCwTv88GdJvadMFioHMDNDZHoDz7tQYmhuQhcwpCfZjL00-Dhrp50u8PiOoHQ5p9ZxaFEChgD8I0vg3fP0Vh_K-iIpiacSRybcHSaz4zDw1AvJl9d4dDsdIpqoV8PcgeFhOIfwQApW9zVwOJDmcmSlwSNhKHTVGnaSr-nxG_EvV_cVuzvyjFVgokntW86CdP0lpg6GDoCXKw1Q23D9targ")
                .when()
                    .baseUri("https://app.fireflink.com/")
                    .basePath("project/optimize/v1/projects/user/USR14079")
                    .get()
                .then()
                    .statusCode(200)
                    .body("responseObject.project.name[0]", Matchers.equalTo("Web Tesing"));
    }

    @Test
    public void bearer2(){
        RestAssured.baseURI="https://app.fireflink.com/";
        RestAssured.basePath="project/optimize/v1/projects/";
        String requestBody="{\"name\":\"testing 1011\",\"type\":\"Web\",\"url\":\"\"}";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNODJhX1U2VHRFSnFvWV9jdzNfWi1KaWVoZ2hQcjJ4QjVMbnlNZ3RtRGs0In0.eyJleHAiOjE3MTA3NDc5NzQsImlhdCI6MTcxMDU3NTE3NCwianRpIjoiMjc0OGEyMzAtNWU3Mi00ZmJiLWE2YTAtMTY0OTQ1ZWY2ZGU2IiwiaXNzIjoiaHR0cHM6Ly9hcHAuZmlyZWZsaW5rLmNvbTozMTAwMS9yZWFsbXMvRmlyZUZsaW5rIiwic3ViIjoiZjphZjhmZmUyYS1jMTIyLTQ3ZjAtOTIxYS01ODgyODcwMjVjZmM6a2F2eWEyM3RAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIzNjJkOWVhMi02NzQ5LTQ0MWUtYmY3NS0yY2Y5YTY0YjBiOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjM2MmQ5ZWEyLTY3NDktNDQxZS1iZjc1LTJjZjlhNjRiMGI5MyIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6IlN5ZWQiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDOTgzMiIsInByZWZlcnJlZF91c2VybmFtZSI6IlN5ZWQiLCJ1c2VyTmFtZSI6ImthdnlhMjN0QGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTQwNzkiLCJsaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWwiOiJrYXZ5YTIzdEBnbWFpbC5jb20ifQ.ssWDdkdK53RlxYpSFDV7-BP2rcD3PibH5-kdUO1t8HCyNKC9GMVOa7e2YWKuUQ3Vb5RrjJESBqFBzo_wUKpSGxhONf0fKwkfCP52hdzFugX-YAsc_9iJ-mkhA9kmURGBGCwTv88GdJvadMFioHMDNDZHoDz7tQYmhuQhcwpCfZjL00-Dhrp50u8PiOoHQ5p9ZxaFEChgD8I0vg3fP0Vh_K-iIpiacSRybcHSaz4zDw1AvJl9d4dDsdIpqoV8PcgeFhOIfwQApW9zVwOJDmcmSlwSNhKHTVGnaSr-nxG_EvV_cVuzvyjFVgokntW86CdP0lpg6GDoCXKw1Q23D9targ");
        requestSpecification.contentType(ContentType.MULTIPART);
        requestSpecification.multiPart("data", requestBody);
        Response response=requestSpecification.post();
        JsonPath jsonPath=response.jsonPath();
        String name=jsonPath.getString("responseObject.name");
        System.out.println(name);
        Assert.assertEquals(name,"testing 1011");
        System.out.println(response.getBody().asPrettyString());
        Assert.assertEquals(response.statusCode(),200);

        System.out.println("---------------------------------------------------");

        //way2
        JSONObject jsonObjectRequestBody=new JSONObject();
        jsonObjectRequestBody.put("name","testing 1012");
        jsonObjectRequestBody.put("type","Web");
        jsonObjectRequestBody.put("url","");
        RestAssured.given()
                    .header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJNODJhX1U2VHRFSnFvWV9jdzNfWi1KaWVoZ2hQcjJ4QjVMbnlNZ3RtRGs0In0.eyJleHAiOjE3MTA3NDc5NzQsImlhdCI6MTcxMDU3NTE3NCwianRpIjoiMjc0OGEyMzAtNWU3Mi00ZmJiLWE2YTAtMTY0OTQ1ZWY2ZGU2IiwiaXNzIjoiaHR0cHM6Ly9hcHAuZmlyZWZsaW5rLmNvbTozMTAwMS9yZWFsbXMvRmlyZUZsaW5rIiwic3ViIjoiZjphZjhmZmUyYS1jMTIyLTQ3ZjAtOTIxYS01ODgyODcwMjVjZmM6a2F2eWEyM3RAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIzNjJkOWVhMi02NzQ5LTQ0MWUtYmY3NS0yY2Y5YTY0YjBiOTMiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoiZW1haWwgcHJvZmlsZSIsInNpZCI6IjM2MmQ5ZWEyLTY3NDktNDQxZS1iZjc1LTJjZjlhNjRiMGI5MyIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6IlN5ZWQiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDOTgzMiIsInByZWZlcnJlZF91c2VybmFtZSI6IlN5ZWQiLCJ1c2VyTmFtZSI6ImthdnlhMjN0QGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTQwNzkiLCJsaWNlbnNlSWQiOiJMSUM5ODMyIiwiZW1haWwiOiJrYXZ5YTIzdEBnbWFpbC5jb20ifQ.ssWDdkdK53RlxYpSFDV7-BP2rcD3PibH5-kdUO1t8HCyNKC9GMVOa7e2YWKuUQ3Vb5RrjJESBqFBzo_wUKpSGxhONf0fKwkfCP52hdzFugX-YAsc_9iJ-mkhA9kmURGBGCwTv88GdJvadMFioHMDNDZHoDz7tQYmhuQhcwpCfZjL00-Dhrp50u8PiOoHQ5p9ZxaFEChgD8I0vg3fP0Vh_K-iIpiacSRybcHSaz4zDw1AvJl9d4dDsdIpqoV8PcgeFhOIfwQApW9zVwOJDmcmSlwSNhKHTVGnaSr-nxG_EvV_cVuzvyjFVgokntW86CdP0lpg6GDoCXKw1Q23D9targ")
                    .multiPart("data", jsonObjectRequestBody.toString())
                    .contentType(ContentType.MULTIPART)
                .when()
                    .baseUri("https://app.fireflink.com/")
                    .basePath("project/optimize/v1/projects/")
                    .post()
                .then()
                    .statusCode(200)
                    .body("responseObject.name", Matchers.equalTo("testing 1012"));
    }
}
