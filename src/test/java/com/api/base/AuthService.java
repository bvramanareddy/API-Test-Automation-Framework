package com.api.base;

import com.api.models.requests.LoginRequest;
import com.api.models.requests.SignUpRequest;
import com.api.models.requests.SignUpRequestLombok;
import io.restassured.response.Response;

public class AuthService extends BaseService{

    private static final String BASE_PATH= "/api/auth/";

    public Response login(LoginRequest payLoad){
         return postRequest(payLoad, BASE_PATH+"login");
    }

    public Response signUp(SignUpRequest payload){
        return postRequest(payload, BASE_PATH+"signup");
    }

    public Response signUp(SignUpRequestLombok payload){
        return postRequest(payload, BASE_PATH+"signup");
    }

}
