package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.SignUpRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateAccountTest {

@Test(description = "This test will handles user account creation")
    public void createUserAccountTest(){

    SignUpRequest signUpRequest= new SignUpRequest.Builder().userName("Ramana6544").firstName("Rams3").email("bodads@aol.com").lastName("redy").mobileNumber("1234567890").password("Abc@12345").build();
    AuthService authService=  new AuthService();
    Response response= authService.signUp(signUpRequest);
    System.out.println(response.prettyPrint());
}
}
