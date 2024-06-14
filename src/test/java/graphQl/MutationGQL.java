package graphQl;

import io.restassured.RestAssured;

public class MutationGQL {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://www.rahulshettyacademy.com/";
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"query\": \"mutation {\\n  createEpisode(episode: {name: \\\"season1\\\", air_date: \\\"mar 20\\\", episode: \\\"01\\\"}) {\\n    id\\n  }\\n}\\n\\n\",\n" +
                        "    \"variables\": null\n" +
                        "}")
                .when()
                .post("gq/graphql")
                .then()
                .log().all();

        System.out.println("-----------------------------------");
        String name="india";
        String type="southzone";
        String dimension="30";
        RestAssured.given()
                .header("Content-Type", "application/json")
                .body("{\n" +
                        "    \"query\": \"mutation($name:String!, $type:String!,$dimension:String!) {\\n  createLocation(location: {name: $name, type: $type, dimension: $dimension}) {\\n    id\\n  }\\n}\\n\\n\",\n" +
                        "    \"variables\": {\n" +
                        "        \"name\": \""+name+"\",\n" +
                        "        \"type\": \""+type+"\",\n" +
                        "        \"dimension\": \""+dimension+"\"\n" +
                        "    }\n" +
                        "}")
                .when()
                .post("gq/graphql")
                .then()
                .log().all();
    }
}
