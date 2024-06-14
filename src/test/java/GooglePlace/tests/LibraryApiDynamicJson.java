package GooglePlace.tests;

import GooglePlace.files.ReqPayload;
import GooglePlace.files.ReusableMethods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.annotation.meta.When;

import java.lang.reflect.Array;

import static io.restassured.RestAssured.given;

public class LibraryApiDynamicJson {
    String bookId;

    @Test(dataProvider = "BooksData")
    public void addBook(String isbn, String aisle) {
//        RestAssured.baseURI="https://rahulshettyacademy.com";
//        RequestSpecification requestSpecification= given();
//        requestSpecification.header("Content-Type", "application/json");
//        requestSpecification.body("{\n" +
//                "\"name\":\"1. Learn Appium Automation with Java\",\n" +
//                "\"isbn\":\"bczdd\",\n" +
//                "\"aisle\":\"2270128\",\n" +
//                "\"author\":\"John foe\"\n" +
//                "}\n");
//        Response response=requestSpecification.post("Library/Addbook.php");
//        System.out.println(response.getBody().asPrettyString());
//        System.out.println("--------------------------");

        //way 2
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given()
                .header("Content-Type", "application/json")
                .body(ReqPayload.addBook(isbn,aisle))
                .when()
                .post("Library/Addbook.php")
                .then()
                .assertThat()
                .statusCode(200)
                .body("Msg", Matchers.equalTo("successfully added"))
                .extract().response().asString();
        JsonPath js= ReusableMethods.rawToJson(response);
        System.out.println(js.getString("ID"));
        bookId=js.getString("ID");
        deleteBook();
    }

    @Test
    public void deleteBook(){
        RestAssured.baseURI="https://rahulshettyacademy.com";
        String deleteBook=given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"ID\": \""+bookId+"\"\n" +
                        "}")
                .when()
                .delete("Library/DeleteBook.php")
                .then()
                .assertThat().statusCode(200)
                .log().all()
                .extract().response().asString();
        JsonPath js1=new JsonPath(deleteBook);
        Assert.assertEquals(js1.getString("msg"),"book is successfully deleted");
        System.out.println(js1.getString("msg"));;
    }


    @DataProvider(name="BooksData")
    public Object[][] getData(){
        return new Object[][] {{"bczdde","2270141"},{"bczddf","2270142"},{"bczddg","2270143"}};
    }

}
