package com.luizfreitas.personapi.utils;


import com.luizfreitas.personapi.dto.request.PhoneDTO;
import com.luizfreitas.personapi.entities.Phone;
import com.luizfreitas.personapi.enums.PhoneType;

public class PhoneUtils {

    private static final String PHONE_NUMBER = "(19)999999998";
    private static final PhoneType PHONE_TYPE = PhoneType.MOBILE;
    private static final long PHONE_ID = 1L;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
                .id(PHONE_ID)
                .number(PHONE_NUMBER)
                .type(PHONE_TYPE)
                .build();
    }
}
