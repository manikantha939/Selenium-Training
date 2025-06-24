package in.at.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class VariableTest {
	@Test
	public void getAllVriables(){
//        RestAssured.baseURI="https://staging.fireflink.com";
//        RequestSpecification requestSpecification=RestAssured.given();
//        requestSpecification.header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJHeFV3TGI1RFhSeFRqUEZPazBCeTFUTmRPYjNua0hUNnZreFhIT3A3WGprIn0.eyJleHAiOjE3NDEwODg0MTEsImlhdCI6MTc0MTA4NjYxMSwianRpIjoiZmRhYzM3MDAtZDUyZi00MTEzLWJkOTAtOWYxY2E4NmUyNjlkIiwiaXNzIjoiaHR0cHM6Ly9zdGFnaW5nLmZpcmVmbGluay5jb206MzAyMjUvcmVhbG1zL0ZpcmVGbGluay1zdGFnaW5nIiwic3ViIjoiZjozNjIxZjUxNS1jNmI2LTQxNTUtYTI5My0wNGZhOWQ3ZjNjMDg6YW1idWxnaTM2ODNAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIxOGJhMWE4NS00ZWNlLTRkNzQtOGE5Ny1hYjJiYmEyN2NmN2IiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsInNpZCI6IjE4YmExYTg1LTRlY2UtNGQ3NC04YTk3LWFiMmJiYTI3Y2Y3YiIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6ImFiaGlzaGVrIDEiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDMzA0NCIsInByZWZlcnJlZF91c2VybmFtZSI6ImFiaGlzaGVrIDEiLCJ1c2VyTmFtZSI6ImFtYnVsZ2kzNjgzQGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTIzMzMiLCJsaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWwiOiJhbWJ1bGdpMzY4M0BnbWFpbC5jb20ifQ.mvrSAHqN8PMPMqMer48NFLWWNKgSZc1h8ph1GOiXqf8HSW0va1HXGcU55_3v4CeGAiJGn3oBj0pN2tN_2hjyvGAPzsleOVmmroGa7ico4CPcI-fR25PSpHOOZdY2Aj6UJ-GblMJlqRA8qa1-L5AiiYmElWzRKD9gOr2qrwWDC7uWe4zVwnJ2bXLT2ojZ8-LSiqqclXHFCHdJE6N_lzmzGzHAOQY4iMg-lu45JHGnpUnCWfrJWaZCfZQK4Vi2B-M3r6O8XR_2rRevrRIDhexEzUy-l5qNZyJtVb1IpKtA1R4pwsuvOlMBz6vdx26ATRVfKiH3CSnWPNcKDhGzGeRw9g");
//        requestSpecification.header("Content-Type","application/json");
//        requestSpecification.header("licensetype", "C-Professional");
//        requestSpecification.header("projectid","PJT1016");
//        requestSpecification.header("projecttype","Web & Mobile");
//        requestSpecification.header("timezone","Pacific/Honolulu");
//        Response response=requestSpecification.get("/project/optimize/v1/variable/type/PROJECT_ENVIRONMENT");
//        System.out.println(response.asPrettyString());


		System.out.println("------------------------------------------------------------------------------");
		//wsl
//		Response response=RestAssured.given().
//                header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJHeFV3TGI1RFhSeFRqUEZPazBCeTFUTmRPYjNua0hUNnZreFhIT3A3WGprIn0.eyJleHAiOjE3NDEwOTEwMTcsImlhdCI6MTc0MTA4OTIxNywianRpIjoiYTVhNzNlYTMtYjQzMS00YTUzLTgxZjgtYjY2ODBjNGJhM2UwIiwiaXNzIjoiaHR0cHM6Ly9zdGFnaW5nLmZpcmVmbGluay5jb206MzAyMjUvcmVhbG1zL0ZpcmVGbGluay1zdGFnaW5nIiwic3ViIjoiZjozNjIxZjUxNS1jNmI2LTQxNTUtYTI5My0wNGZhOWQ3ZjNjMDg6YW1idWxnaTM2ODNAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIxOGJhMWE4NS00ZWNlLTRkNzQtOGE5Ny1hYjJiYmEyN2NmN2IiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsInNpZCI6IjE4YmExYTg1LTRlY2UtNGQ3NC04YTk3LWFiMmJiYTI3Y2Y3YiIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6ImFiaGlzaGVrIDEiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDMzA0NCIsInByZWZlcnJlZF91c2VybmFtZSI6ImFiaGlzaGVrIDEiLCJ1c2VyTmFtZSI6ImFtYnVsZ2kzNjgzQGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTIzMzMiLCJsaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWwiOiJhbWJ1bGdpMzY4M0BnbWFpbC5jb20ifQ.AMkU8NbfvZP-3v10xSxd3N5mbTH-6T_M9gSsOkA3E8_BY1kcF2WbU6VdBV_MaEKjAPmJ6wmVO4VeTm9LyUG2MxqY5kw-qhcFJ9Nd2dbvsL7YrO0_o7-MKSA3G_b5RetQvD0O-51JhWOg-407wLScti-P1HRyJlAFZ78jVIa49AxysYfAKwjJyoZTVVjl0nOTOHkDf9pwBqhGKyUiArGaQ263lVDDp8i_-4S3Kg5P6yg3Je4NCu4BfYXpD11yHKOI3tk1XM2eOaynXftgcqkEalVVk-0Psuz2cvhQ0LCD5fByF4jUq8ze9YmyG1EmB1n5vET1fOdC0nOKIZvhqbLEtA")
//                .header("licensetype", "C-Professional").
//				header("projectid","PJT1016").
//				header("projecttype","Web & Mobile").
//				header("timezone","Pacific/Honolulu")
//				.when()
//				.get("https://staging.fireflink.com/project/optimize/v1/variable/type/PROJECT_ENVIRONMENT");
//        System.out.println(response.prettyPrint());
	}

	public String reqPayload="{\n" +
			"    \"name\": \"test 8\",\n" +
			"    \"type\": \"PROJECT_ENVIRONMENT\",\n" +
			"    \"value\": \"test 2\",\n" +
			"    \"masked\": false\n" +
			"}";

	@Test
	public void createVariable(){
//		RestAssured.baseURI="https://staging.fireflink.com";
//		RequestSpecification requestSpecification= given();
//		requestSpecification.header("Authorization","Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJHeFV3TGI1RFhSeFRqUEZPazBCeTFUTmRPYjNua0hUNnZreFhIT3A3WGprIn0.eyJleHAiOjE3NDExMDUwMzcsImlhdCI6MTc0MTEwMzIzNywianRpIjoiNjMwNDE5MjAtOWY2Ny00NmY4LWFmM2EtODI4OTIwNmVhMjMxIiwiaXNzIjoiaHR0cHM6Ly9zdGFnaW5nLmZpcmVmbGluay5jb206MzAyMjUvcmVhbG1zL0ZpcmVGbGluay1zdGFnaW5nIiwic3ViIjoiZjozNjIxZjUxNS1jNmI2LTQxNTUtYTI5My0wNGZhOWQ3ZjNjMDg6YW1idWxnaTM2ODNAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIxOGJhMWE4NS00ZWNlLTRkNzQtOGE5Ny1hYjJiYmEyN2NmN2IiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsInNpZCI6IjE4YmExYTg1LTRlY2UtNGQ3NC04YTk3LWFiMmJiYTI3Y2Y3YiIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6ImFiaGlzaGVrIDEiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDMzA0NCIsInByZWZlcnJlZF91c2VybmFtZSI6ImFiaGlzaGVrIDEiLCJ1c2VyTmFtZSI6ImFtYnVsZ2kzNjgzQGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTIzMzMiLCJsaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWwiOiJhbWJ1bGdpMzY4M0BnbWFpbC5jb20ifQ.oMzmz1lTKmzoXNRzl8AX2Q3Grr98F9UmjdqqYzpSdHlIdc_zpsGLn0Bwj_UyPwr4HtHFiBok4k3sMqIhrdMToZqjt99ufhd9sW3GZ-kIDrkMEJf0AGbPOeGBHZcpnUcTYC1gGeIgEmElFlVxMPmW4mbY1uXfFfi5zAPJJLwxatR-NjLzoh3OuAnqn_VMBfu9UZr3gNWHfIcyllIMpTFKKY6Qk32ADjJ2Njsu0jkfrhDmVsJ6P-DzPMr3DATycV6kD5ju9ox4YoB3cPvgUDTk6tOJDDJSBwi_CwTlQDtzSgpJWAu0zc7FWSKgNZebp3dl4kCBz-IPc_7lX2A_YiXRhg");
//		requestSpecification.header("Content-Type","application/json");
//		requestSpecification.header("licensetype", "C-Professional");
//		requestSpecification.header("projectid","PJT1016");
//		requestSpecification.header("projecttype","Web & Mobile");
//		requestSpecification.header("timezone","Pacific/Honolulu");
//		requestSpecification.body(reqPayload);
//		Response response=requestSpecification.post("/project/optimize/v1/variable/");
//		response.then().log().all();
//		String responseCode = response.jsonPath().getString("responseCode");
//		System.out.println(responseCode);
//		System.out.println(response.jsonPath().getString("responseObject.name"));


		given().header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICJHeFV3TGI1RFhSeFRqUEZPazBCeTFUTmRPYjNua0hUNnZreFhIT3A3WGprIn0.eyJleHAiOjE3NDExMDUwMzcsImlhdCI6MTc0MTEwMzIzNywianRpIjoiNjMwNDE5MjAtOWY2Ny00NmY4LWFmM2EtODI4OTIwNmVhMjMxIiwiaXNzIjoiaHR0cHM6Ly9zdGFnaW5nLmZpcmVmbGluay5jb206MzAyMjUvcmVhbG1zL0ZpcmVGbGluay1zdGFnaW5nIiwic3ViIjoiZjozNjIxZjUxNS1jNmI2LTQxNTUtYTI5My0wNGZhOWQ3ZjNjMDg6YW1idWxnaTM2ODNAZ21haWwuY29tIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoiZmxpbmstc2VydmljZSIsInNlc3Npb25fc3RhdGUiOiIxOGJhMWE4NS00ZWNlLTRkNzQtOGE5Ny1hYjJiYmEyN2NmN2IiLCJhY3IiOiIxIiwiYWxsb3dlZC1vcmlnaW5zIjpbIioiXSwicmVhbG1fYWNjZXNzIjp7InJvbGVzIjpbIm9mZmxpbmVfYWNjZXNzIiwidW1hX2F1dGhvcml6YXRpb24iXX0sInNjb3BlIjoicHJvZmlsZSBlbWFpbCIsInNpZCI6IjE4YmExYTg1LTRlY2UtNGQ3NC04YTk3LWFiMmJiYTI3Y2Y3YiIsImN1cnJlbnRMaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWxfdmVyaWZpZWQiOmZhbHNlLCJjdXJyZW50UHJpdmlsZWdlIjoiQWRtaW4iLCJmdWxsTmFtZSI6ImFiaGlzaGVrIDEiLCJhY3RpdmF0aW9uU3RhdHVzIjoiQUNUSVZFIiwicHJpdmlsZWdlIjoiQWRtaW4iLCJsaWNlbnNlTmFtZSI6ImZpcmUtZmxpbmstTElDMzA0NCIsInByZWZlcnJlZF91c2VybmFtZSI6ImFiaGlzaGVrIDEiLCJ1c2VyTmFtZSI6ImFtYnVsZ2kzNjgzQGdtYWlsLmNvbSIsImJpbGxpbmdDeWNsZSI6IlllYXJseSIsImlkIjoiVVNSMTIzMzMiLCJsaWNlbnNlSWQiOiJMSUMzMDQ0IiwiZW1haWwiOiJhbWJ1bGdpMzY4M0BnbWFpbC5jb20ifQ.oMzmz1lTKmzoXNRzl8AX2Q3Grr98F9UmjdqqYzpSdHlIdc_zpsGLn0Bwj_UyPwr4HtHFiBok4k3sMqIhrdMToZqjt99ufhd9sW3GZ-kIDrkMEJf0AGbPOeGBHZcpnUcTYC1gGeIgEmElFlVxMPmW4mbY1uXfFfi5zAPJJLwxatR-NjLzoh3OuAnqn_VMBfu9UZr3gNWHfIcyllIMpTFKKY6Qk32ADjJ2Njsu0jkfrhDmVsJ6P-DzPMr3DATycV6kD5ju9ox4YoB3cPvgUDTk6tOJDDJSBwi_CwTlQDtzSgpJWAu0zc7FWSKgNZebp3dl4kCBz-IPc_7lX2A_YiXRhg")
				.header("Content-Type", "application/json")
				.header("licensetype", "C-Professional")
				.header("projectid", "PJT1016")
				.header("projecttype", "Web & Mobile")
				.header("timezone", "Pacific/Honolulu")
				.body(reqPayload)
				.when()
				.post("https://staging.fireflink.com/project/optimize/v1/variable/")
		.then().log().all();
//		int responseCode1 = Integer.parseInt(resp.jsonPath().getString("responseCode"));
//		System.out.println(responseCode1);
//		Assert.assertEquals(200, Integer.parseInt(resp.jsonPath().getString("responseCode")));


	}
}
