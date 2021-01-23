package pgeneric;

import java.io.IOException;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Spec_Builder_Api 
{
	public static RequestSpecification request_spec_builder() throws IOException
	{
		RequestSpecBuilder req_bui = new RequestSpecBuilder();
		RequestSpecification req = req_bui.setContentType(ContentType.JSON).setBaseUri(Fetch_Properties.getProperties_Value()).build();
		return req;
	}
	
	public static ResponseSpecification response_spec_builder(int statuscode)
	{
		ResponseSpecBuilder res_bui = new ResponseSpecBuilder();
		ResponseSpecification res = res_bui.expectContentType(ContentType.JSON).expectStatusCode(statuscode).build();
		return res;
	}

}
