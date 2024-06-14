package authentication;

import in.at.POJOForOauth.API;
import in.at.POJOForOauth.GetCourse;
import in.at.POJOForOauth.WebAutomation;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Oauth {
    public static void main(String[] args) {
        String[] courseTitles={"SoapUI Webservices testing","Cypress","Protractor"};

        RestAssured.baseURI = "https://rahulshettyacademy.com/";
        String response = given()
                .formParam("client_id", "692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com")
                .formParam("client_secret", "erZOWM9g3UtwNRj340YYaK_W")
                .formParam("grant_type", "client_credentials")
                .formParam("scope", "trust")
                .when()
                .log().all()
                .post("oauthapi/oauth2/resourceOwner/token").asString();
        JsonPath jsonPath = new JsonPath(response);
        String accessToken = jsonPath.getString("access_token");
        System.out.println("Access token is: " + accessToken);

        RestAssured.baseURI = "https://rahulshettyacademy.com/";
        //way 1
//        RequestSpecification requestSpecification=RestAssured.given();
//        requestSpecification.queryParam("access_t oken",accessToken);
//        Response response1=requestSpecification.get("oauthapi/getCourseDetails");
//        System.out.println(response1.getBody().asPrettyString());
        //way2
        GetCourse gc =
                given()
                        .queryParam("access_token", accessToken)
                        .when()
                        .log().all()
                        .get("oauthapi/getCourseDetails").as(GetCourse.class);
        System.out.println(gc.getLinkedIn());
        System.out.println(gc.getInstructor());
        System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());
        //Print price of SoapUI Webservices testing course
        List<API> apiCourses = gc.getCourses().getApi();
        for (API a: apiCourses) {
            if(a.getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")) {
                System.out.println("Price of SoapUI Webservices testing course is: "+a.getPrice());
            }
        }
        System.out.println("-------------------------------------");
        //create a arraylist to store all the courses
        ArrayList<String> a=new ArrayList<String>();
        //print all the courses of webAutomation
        List<WebAutomation> allCourses= gc.getCourses().getWebAutomation();
        for (WebAutomation course: allCourses) {
            //print all the courses of which prices equals to 40
//            if((course.getPrice()).equalsIgnoreCase("40")) {
//                System.out.println(course.getCourseTitle());
//            }
            //add the courses in arraylist
            a.add(course.getCourseTitle());
        }
        //converting array to arrayList
        List<String> expectedList = Arrays.asList(courseTitles);
        Assert.assertTrue(a.equals(expectedList));
    }
}