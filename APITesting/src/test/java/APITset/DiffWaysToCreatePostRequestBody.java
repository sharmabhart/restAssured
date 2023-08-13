package APITset;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;

public class DiffWaysToCreatePostRequestBody

{
	 @Test()
	 void testPstUsingHasMap()
	 {
		 HashMap data=new HashMap() ;
		 data.put ("name", "Scott");
		 data.put ("location", "France");
		 data.put ("phone", "123456");
		 
		 String courseArr[]= {"C", "C++"};
		 data.put ("courses", courseArr);
		 
		 
		 
		 given ()
		 .contentType("application/json")
		 .body (data)
		 
		 .when()
		 .post ("http://localhost:3000/students")
		 
		 .then()
		 .statusCode (201)
		 . body ( "name",equalTo("Scott") )
		 .body("location",equalTo("France"))
		 .body ("phoneation",equalTo("France"))
		 . body ("location", equalTo("France"));
		 
		 }
	 
	 void testPostUsingORG_Json()
	 {
		 JSONObject data=new JSONObject();
		 data.put ("name", "Scott");
		 data.put ("location", "France");
		 data.put ("phone", "123456");
		 
		 String courseArr[]= {"C", "C++"};
		 data.put ("courses", courseArr);
		 
		 
		 
		 given ()
		 .contentType("application/json")
		 .body (data)
		 
		 .when()
		 .post ("http://localhost:3000/students")
		 
		 .then()
		 .statusCode (201)
		 . body ( "name",equalTo("Scott") )
		 .body("location",equalTo("France"))
		 .body ("phoneation",equalTo("France"))
		 . body ("location", equalTo("France"));
		 
		 }
	 
	 void testPostUsingPOJOClass()
	 {
		POJOClass  data=new POJOClass();
	
		data.setName("Scott");
		data.setLocation("France");
		data.setPhone("1234567");
//		String courseArr[]= {"C", "C++"};
//		
//		data.setCourses(courseArr);
		 
		 given ()
		 .contentType("application/json")
		 .body (data)
		 
		 .when()
		 .post ("http://localhost:3000/students")
		 
		 .then()
		 .statusCode (201)
		 . body ( "name",equalTo("Scott") )
		 .body("location",equalTo("France"))
		 .body ("phoneation",equalTo("France"))
		 . body ("location", equalTo("23456"));
		 
		 }

	 void testPostUsingExternalFile() throws FileNotFoundException
	 {
		
		 File fl=new File(".\\BODY.JSON");
		 
		 FileReader fr=new FileReader(fl);
		 
		 JSONTokener jt=new JSONTokener(fr);
		 
		 JSONObject data=new JSONObject(jt);
		  
	
		 given ()
		 .contentType("application/json")
		 .body (data.toString())
		 
		 .when()
		 .post ("http://localhost:3000/students")
		 
		 .then()
		 .statusCode (201)
		 . body ( "name",equalTo("Scott") )
		 .body("location",equalTo("France"))
		 .body ("phoneation",equalTo("France"))
		 . body ("location", equalTo("23456"));
		 
		 }
}
