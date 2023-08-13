package APITset;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class HTTPrequest 
{
	@Test()
   void getUser()
   {
	   
	   given()
	   
	   .when()
	   .get("https://reqres.in/api/users?page=2")
	   
	   .then()
	     .statusCode(200)
	     .body("page",equalTo(2))
	     .log().all();
	   
	 
   }
}
