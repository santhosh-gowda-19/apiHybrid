package pscripts;
import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.ResponseSpecification;
import pgeneric.Spec_Builder_Api;

public class Rest1 {

	public static void main(String[] args) throws IOException 
	{
		Response res1 = given().spec(Spec_Builder_Api.request_spec_builder()).when().get("/api/users?page=2").then().spec(Spec_Builder_Api.response_spec_builder(200)).extract().response();
		System.out.println(res1.asString());
	}
	
}
