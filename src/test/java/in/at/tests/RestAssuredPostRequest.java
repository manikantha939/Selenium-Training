package in.at.tests;

import in.at.testData.POJOpost;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class RestAssuredPostRequest {
    @Test
    public void addProductUsingJSONASString(){
        //way1
        String jsonRequestBodyAsString="{\n" +
                "    \"title\": \"test product\",\n" +
                "    \"price\": 13.5,\n" +
                "    \"description\": \"lorem ipsum set\",\n" +
                "    \"image\": \"https: //i.pravatar.cc\",\n" +
                "    \"category\": \"electronic\"\n" +
                "}";
        RestAssured.baseURI="https://fakestoreapi.com/products";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonRequestBodyAsString);

        Response response=requestSpecification.post();
        System.out.println(response.getBody().asPrettyString());

        System.out.println("--------------------------------------------");

        //way2
        RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(jsonRequestBodyAsString)
                .when()
                    .post("https://fakestoreapi.com/products")
                .then()
                    .log().body();
    }

    @Test
    public void addProductUsingMap(){
        //way 1
        Map<String,String> jsonRequestBodyAsMap=new HashMap<>();
        jsonRequestBodyAsMap.put("title", "test product");
        jsonRequestBodyAsMap.put("price", "13.5");
        jsonRequestBodyAsMap.put("description", "lorem ipsum set");
        jsonRequestBodyAsMap.put("image", "https: //i.pravatar.cc");
        jsonRequestBodyAsMap.put("category", "electronic");

        RestAssured.baseURI="https://fakestoreapi.com/products";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(jsonRequestBodyAsMap);

        Response response=requestSpecification.post();
        System.out.println(response.getBody().asPrettyString());

        System.out.println("------------------------------------------------");

        //way2
        RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(jsonRequestBodyAsMap)
                .when()
                    .post("https://fakestoreapi.com/products")
                .then()
                    .log().body();
    }

    @Test
    public void addProductUsingJSONObject(){
        JSONObject jsonRequestBody=new JSONObject();//add dependancy from org.Json
        jsonRequestBody.put("title", "test product");
        jsonRequestBody.put("price", "13.5");
        jsonRequestBody.put("description", "lorem ipsum set");
        jsonRequestBody.put("image", "https: //i.pravatar.cc");
        jsonRequestBody.put("category", "electronic");

        RestAssured.baseURI="https://fakestoreapi.com/products";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        // need to convert to to String
        requestSpecification.body(jsonRequestBody.toString());

        Response response=requestSpecification.post();
        System.out.println(response.getBody().asPrettyString());

        System.out.println("------------------------------------------------");

        //way2
        RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(jsonRequestBody.toString())
                .when()
                    .post("https://fakestoreapi.com/products")
                .then()
                    .log().body();
    }

    @Test
    public void addProductUsingPOJOClass(){
        POJOpost pojoRequest=new POJOpost();
        pojoRequest.setTitle("test product");
        pojoRequest.setPrice(13.5);
        pojoRequest.setDescription("lorem ipsum set");
        pojoRequest.setImage("https: //i.pravatar.cc");
        pojoRequest.setCategory("electronic");
        RestAssured.baseURI="https://fakestoreapi.com/products";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(pojoRequest);
        Response response=requestSpecification.post();
        System.out.println(response.getBody().asPrettyString());

        System.out.println("---------------------------------------------");

        //way 2
        RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(pojoRequest)
                .when()
                    .post("https://fakestoreapi.com/products")
                .then()
                    .statusCode(200)
                    .log().body();
    }

    @Test
    public void addProductUsingExternalJSONOFile(){
        File requestJSONFile=new File("src/test/java/in/at/testData/PostJSON.json");
        RestAssured.baseURI="https://fakestoreapi.com/products";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.body(requestJSONFile);

        Response response=requestSpecification.post();
        System.out.println(response.getBody().asPrettyString());

        System.out.println("--------------------------------------------------");

        //way 2
        RestAssured.given()
                    .contentType(ContentType.JSON)
                    .body(requestJSONFile)
                .when()
                    .post("https://fakestoreapi.com/products")
                .then()
                    .log().body();
    }
}