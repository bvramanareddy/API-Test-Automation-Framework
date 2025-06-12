package com.api.tests;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class LoginAPITest {

    @Test(description = "Validating the basic login functionality")
    public void loginAPITest(){

        Response resp = given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json").body("{\n" +
                "  \"username\": \"BoxelAr\",\n" +
                "  \"password\": \"Abc@12345\"\n" +
                "}").post("/api/auth/login");
        System.out.println(resp.prettyPrint());



    }
}
