package qsp1;
import static io.restassured.RestAssured.given;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pgeneric.Spec_Builder_Api;

public class Rest1 
{

	public static void main(String[] args) 
	{
		RequestSpecBuilder req_bui = new RequestSpecBuilder();
		RequestSpecification req = req_bui.setBaseUri("https://reqres.in/").build();
		ResponseSpecBuilder res_bui = new ResponseSpecBuilder();
		ResponseSpecification res = res_bui.expectContentType(ContentType.JSON).expectStatusCode(200).build();
		Response res1 = given().spec(req).when().get("/api/users?page=2").then().spec(res).extract().response();
		System.out.println(res1.asString());
	}
}
