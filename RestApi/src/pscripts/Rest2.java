package pscripts;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import io.restassured.response.Response;
import pgeneric.Json_Extract;
import pgeneric.Spec_Builder_Api;

public class Rest2 
{

	public static void main(String[] args) throws IOException, ParseException 
	{
		JSONArray a1 = Json_Extract.Nest_Json();
		for (int i = 0; i < a1.size(); i++) 
		{
			Response res = given().spec(Spec_Builder_Api.request_spec_builder()).body(a1.get(i)).when().post("/api/users")
					.then().spec(Spec_Builder_Api.response_spec_builder(201)).extract().response();
					System.out.println(res.asString());
			
		}
	}
}
