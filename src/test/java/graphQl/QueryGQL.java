package graphQl;

import io.restassured.RestAssured;

public class QueryGQL {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://www.rahulshettyacademy.com/";
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"query\": \"query ($characterId: Int!, $locationsByIds: [Int!]!) {\\n  character(characterId: $characterId) {\\n    type\\n    status\\n  }\\n  locationsByIds(ids: $locationsByIds) {\\n    id\\n    name\\n  }\\n}\\n\",\n" +
                        "    \"variables\": {\n" +
                        "        \"characterId\": 7011,\n" +
                        "        \"locationsByIds\": [\n" +
                        "            8045,\n" +
                        "            8060\n" +
                        "        ]\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("gq/graphql")
                .then()
                .log().all();

        System.out.println("-----------------------------------");
        String name="india";
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"query\": \"query($name:String)\\n{\\n    locations(filters: {name: $name, type: \\\"southzone\\\", dimension: \\\"30\\\"},pagination:{limit:2,page:1}) {\\n    info{\\n            Count\\n            pages\\n            next\\n            prev\\n        }\\n    }\\n}\",\n" +
                        "    \"variables\": {\n" +
                        "        \"name\": \""+name+"\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("gq/graphql")
                .then()
                .log().all();
    }
}
