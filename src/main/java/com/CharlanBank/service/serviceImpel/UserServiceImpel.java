package com.CharlanBank.service.serviceImpel;

import com.CharlanBank.Enum.Gender;
import com.CharlanBank.dtos.request.UserRequest;
import com.CharlanBank.dtos.response.AccountInfo;
import com.CharlanBank.dtos.response.BankResponse;
import com.CharlanBank.entity.Users;
import com.CharlanBank.repository.UserRepository;
import com.CharlanBank.service.UserService;
import com.CharlanBank.utils.AccountNumberUtil;
import com.CharlanBank.utils.MessageResponseUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class UserServiceImpel implements UserService {
    private final UserRepository userRepository;

    @Override
    public BankResponse createAccount(UserRequest userRequest) {
        // todo: check if user already have account
        if(userRepository.existsByEmail(userRequest.getEmail())){
            return BankResponse.builder()
                    .statusCode(MessageResponseUtil.ACCOUNT_EXIST_CODE)
                    .statusMessage(MessageResponseUtil.ACCOUNT_EXIST_MESSAGE)
                    .accountInfo(null)
                    .build();
        }
        Users newUser = Users.builder()
                .firstName(userRequest.getFirstName())
                .lastName(userRequest.getLastName())
                .otherName(userRequest.getOtherName())
                .gender(Gender.valueOf(userRequest.getGender()))
                .address(userRequest.getAddress())
                .stateOfOrigin(userRequest.getStateOfOrigin())
                .accountNumber(AccountNumberUtil.generateAccountNumber())
                .accountBalance(BigDecimal.ZERO)
                .email(userRequest.getEmail())
                .phoneNumber(userRequest.getPhoneNumber())
                .status("ACTIVE")
                .build();
        Users savedUser = userRepository.save(newUser);

        return BankResponse.builder()
                .statusCode(MessageResponseUtil.ACCOUNT_CREATION_SUCCESS_CODE)
                .statusMessage(MessageResponseUtil.ACCOUNT_CREATION_MESSAGE)
                .accountInfo(AccountInfo.builder()
                        .accountName(savedUser.getFirstName() + " " + savedUser.getLastName() + " " + savedUser.getOtherName())
                        .accountNumber(savedUser.getAccountNumber())
                        .accountBalance(savedUser.getAccountNumber())
                        .build())
                .build();

    }
}
