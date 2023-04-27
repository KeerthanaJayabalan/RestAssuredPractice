package com.rs.bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BddRequestTypes {
@Test (enabled = false)
	public void getAllEmployees() {
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.when()
		.get("/employees").prettyPrint();
	}
@Test(enabled = false)
public void createAnEmployee() {
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.header("Content-Type", "application/json")
	.body("{\r\n"
			+ "    \"id\": 1005,\r\n"
			+ "    \"first_name\": \"Taylor\",\r\n"
			+ "    \"last_name\": \"Swift\",\r\n"
			+ "    \"place\": \"New York\",\r\n"
			+ "    \"email\": \"taylor@rock.com\"\r\n"
			+ "  }")
	.when()
	.post("/employees")
	.prettyPrint();
}
@Test (enabled = false)
public void updateAnEmployee() {
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.header("Content-Type", "application/json")
	.body("{\r\n"
			+ "    \"id\": 1005,\r\n"
			+ "    \"first_name\": \"Keerthana\",\r\n"
			+ "    \"last_name\": \"Jayabalan\",\r\n"
			+ "    \"place\": \"Coimbatore\",\r\n"
			+ "    \"email\": \"keerthana@scilife.com\"\r\n"
			+ "  }")
	.when()
	.put("/employees/1005")
	.prettyPrint();
}
@Test
public void deleteAnEmployee() {
	RestAssured
	.given()
	.baseUri("http://localhost:3000")
	.when()
	.delete("/employees/1002")
	.prettyPrint();
	
}
}
