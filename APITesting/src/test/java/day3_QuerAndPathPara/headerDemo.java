package day3_QuerAndPathPara;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
public class headerDemo
{
	@Test
	public void verifyHeaders()
	{
		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		  .header("content_type", "")
		  .and()
		  .header("","")
		  .and()
		  .header("","");
		
	}
	@Test(priority=2)
	
	void getHeaders() 
	{
	Response res=given()
			
	.when ()
	.get("https://www.google.com/");
	
	//get single header info
	//String headervalue=res.getHeader ("Content-Type");
	//System.out.printIn("The value of Content-type header is: "+headervalue);
	
	
	//get all headers info
	Headers myheaders=res .getHeaders () ;
	for (Header hd:myheaders)
	{
	System.out.println(hd.getName ()+"    "+hd.getValue());
	
	}
	}
}
