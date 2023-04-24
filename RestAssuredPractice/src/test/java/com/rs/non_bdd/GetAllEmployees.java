package com.rs.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {
@Test
	public void getAllEmployees() {
		RestAssured.baseURI="http://localhost:3000/employees";
		RequestSpecification rs = RestAssured.given();
		Response response = rs.request(Method.GET);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
}
