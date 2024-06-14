package GooglePlace.files;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
    public static JsonPath rawToJson(String getPlaceResponse){
        JsonPath jsonPath1=new JsonPath(getPlaceResponse);
        return jsonPath1;
    }
}
