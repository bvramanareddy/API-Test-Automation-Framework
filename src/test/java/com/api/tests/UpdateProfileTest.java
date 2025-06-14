package com.api.tests;

import com.api.base.AuthService;
import com.api.base.UserProfileManagementService;
import com.api.models.requests.LoginRequest;
import com.api.models.requests.ProfileUpdateRequest;
import com.api.models.response.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class UpdateProfileTest {

    @Test(description = "Verify update profile is updating the details")
    public void updateProfileTest(){

        AuthService authService=  new AuthService();
        Response response= authService.login(new LoginRequest("BoxelAr", "Abc@12345"));
        LoginResponse loginResponse= response.as(LoginResponse.class);

        UserProfileManagementService userProfileManagementService=  new UserProfileManagementService();
        response= userProfileManagementService.getProfile(loginResponse.getToken());
        System.out.println("<----------------Before Put Request------------------->");
        System.out.println(response.prettyPrint());
        ProfileUpdateRequest profileUpdateRequest= ProfileUpdateRequest.builder().firstName("Sanjeeva Reddy").lastName("Boda").mobileNumber("6478641888").email("boxelar540@gotemv.com").build();
        response= userProfileManagementService.updateProfile(loginResponse.getToken(),profileUpdateRequest);
        System.out.println("<-----------------After Put Request------------------>");
        System.out.println(response.prettyPrint());
    }
}
