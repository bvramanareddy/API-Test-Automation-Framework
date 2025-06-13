package com.api.tests;

import com.api.base.AuthService;
import com.api.models.requests.SignUpRequest;
import com.api.models.requests.SignUpRequestLombok;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class CreateAccountTestUsingLombok {

@Test(description = "This test will handles user account creation with Lombok")
    public void createUserAccountTestbyLombok(){

SignUpRequestLombok signUpRequestlombok= SignUpRequestLombok.builder().email("redy123@aol.com").firstName("Ramana").mobileNumber("5656565656").lastName("Reddy").username("123@qwewe").password("Abc!@!21").build();
    AuthService authService=  new AuthService();
    Response response= authService.signUp(signUpRequestlombok);
    System.out.println(response.prettyPrint());
}
}
