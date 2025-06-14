package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.LoginRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginAPITest2 {

    @Test(description = "Validating the basic login functionality")
    public void loginAPITest(){

        LoginRequest loginRequest= new LoginRequest("BoxelAr", "Abc@12345");
        AuthService authService = new AuthService();
        Response resp =authService.login(loginRequest);
        //System.out.println(resp.prettyPrint());
        LoginResponse loginResponse= resp.as(LoginResponse.class);
        System.out.println(resp.prettyPrint());
        System.out.println("Token is "+ loginResponse.getToken());
        




    }
}
