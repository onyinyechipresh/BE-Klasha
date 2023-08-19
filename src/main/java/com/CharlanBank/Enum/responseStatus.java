package com.CharlanBank.Enum;

import lombok.Getter;

@Getter
public enum responseStatus {
    SUCCESSFUL_CODE("200"),
    SUCCESSFUL_MESSAGE("success");
//    ERROR("06", "error"),
//    REQUEST_IN_PROGRESS("09", "request in progress"),
//    INSUFFICIENT_FUNDS("51", "insufficient fund"),
//    SYSTEM_ERROR("96", "system error"),
//    NOT_FOUND("56", "not found"),
//    FORMAT_ERROR("30", "format error");

    private final String code;
//    private final String message;

    responseStatus(String code) {
        this.code = code;
//        this.message = message;
    }
}
