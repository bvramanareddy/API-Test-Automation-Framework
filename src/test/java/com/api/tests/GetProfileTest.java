package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.requests.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetProfileTest {

    @Test (description = "Verify get profile of user")
    public void getProfileInfoTest(){
        AuthService authService=  new AuthService();
        Response response = authService.login(new LoginRequest("BoxelAr", "Abc@12345"));
        LoginResponse loginResponse= response.as(LoginResponse.class);
        String token= loginResponse.getToken();
        UserProfileManagementService userProfileManagementService=  new UserProfileManagementService();
         response = userProfileManagementService.getProfile(token);
        UserProfileResponse userProfileResponse= response.as(UserProfileResponse.class);
        System.out.println(userProfileResponse.getEmail());
        Assert.assertEquals(userProfileResponse.getEmail(), "boxelar540@gotemv.com", "Email id doesnt match");

    }
}
