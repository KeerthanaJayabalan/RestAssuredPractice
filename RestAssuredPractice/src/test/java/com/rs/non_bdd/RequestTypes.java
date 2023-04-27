package com.rs.non_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestTypes {
@Test
	public void getAllEmployees() {
		RestAssured.baseURI="http://localhost:3000/employees";
		RequestSpecification rs = RestAssured.given();
		Response response = rs.request(Method.GET);
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
@Test(enabled = false)
public void createAnEmployee() {
	RestAssured.baseURI="http://localhost:3000/";
	RequestSpecification requestSpecification=RestAssured.given()
			.header("Content-Type", "application/json").body("{\r\n"
					+ "    \"id\": 1006,\r\n"
					+ "    \"first_name\": \"Taylor\",\r\n"
					+ "    \"last_name\": \"Swift\",\r\n"
					+ "    \"place\": \"New York\",\r\n"
					+ "    \"email\": \"taylor@rock.com\"\r\n"
					+ "  }");	
	Response r = requestSpecification.request(Method.POST, "employees");
	System.out.println(r.asPrettyString());
	System.out.println(r.getStatusLine());
}
@Test(enabled = false)
public void updateAnEmployee() {
	RestAssured.baseURI="http://localhost:3000/";
	RequestSpecification specification=RestAssured.given().header("Content-Type", "application/json")
			.body("{\r\n"
					+ "    \"id\": 1001,\r\n"
					+ "    \"first_name\": \"Maary\",\r\n"
					+ "    \"last_name\": \"Joe\",\r\n"
					+ "    \"place\": \"Washigton DC\",\r\n"
					+ "    \"email\": \"maary@rock.com\"\r\n"
					+ "  }");
	Response r = specification.request(Method.PUT, "employees/1001");
	System.out.println(r.asPrettyString());
	System.out.println(r.getStatusLine());
	}
@Test
public void deleteAnEmployee() {
	RestAssured.baseURI="http://localhost:3000/";
	RequestSpecification specification = RestAssured.given();
	Response r = specification.request(Method.DELETE, "employees/1005");
	System.out.println(r.asPrettyString());
	System.out.println(r.getStatusLine());
}
@Test
public void getAnEMployee() {
	RestAssured.baseURI="http://localhost:3000/";
	RequestSpecification rs = RestAssured.given();
	Response response = rs.request(Method.GET, "employees/1004");
	System.out.println(response.asPrettyString());
}
}
