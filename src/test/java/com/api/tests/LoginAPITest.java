package com.api.tests;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.api.listners.MyTestListner.class)
public class LoginAPITest {

    @Test(description = "Validating the basic login functionality")
    public void loginAPITest1(){

        Response resp = given().baseUri("http://64.227.160.186:8080").header("Content-Type", "application/json").body("{\n" +
                "  \"username\": \"BoxelAr\",\n" +
                "  \"password\": \"Abc@12345\"\n" +
                "}").post("/api/auth/login");
        System.out.println(resp.prettyPrint());



    }
}
