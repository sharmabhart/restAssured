package day3_QuerAndPathPara;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class LoggInfo {

	@Test
	public void getAllLog() {
		given()

				.when().get("https://reqres.in/api/page=2")

				.then()
				//.log().body();
				//.log().cookies();
				.log().headers();
				//.log().all();
	}

}
