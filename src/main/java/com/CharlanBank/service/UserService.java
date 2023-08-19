package com.CharlanBank.service;

import com.CharlanBank.dtos.request.UserRequest;
import com.CharlanBank.dtos.response.BankResponse;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
}
