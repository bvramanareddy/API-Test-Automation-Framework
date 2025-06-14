package com.api.tests;

import com.api.base.AuthService;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class ForgotPasswordTest {

@Test(description = "Verify the Forgot Password Functionality")
    public void forgotPasswordTest(){

    AuthService authService = new AuthService();
    Response response= authService.forgotPassword("boda.v7@aol.com");
    System.out.println(response.prettyPrint());
}
}
