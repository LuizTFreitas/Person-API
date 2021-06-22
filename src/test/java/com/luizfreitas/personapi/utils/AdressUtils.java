package com.luizfreitas.personapi.utils;

import com.luizfreitas.personapi.dto.request.AdressDTO;
import com.luizfreitas.personapi.enums.AdressType;

public class AdressUtils {

    private static final String STREET_NAME = "Estanislau ROmano";
    private static final String STREET_NUMBER = "25";
    private static final AdressType ADRESS_TYPE = AdressType.HOME;
    private static final String ADRESS_STATE = "SP";
    private static final String ADRESS_CEP = "13880000";
    private static final long ADRESS_ID = 1L;

    public static AdressDTO createFakeDTO() {
        return AdressDTO.builder()
                .street(STREET_NAME)
                .number(STREET_NUMBER)
                .type(ADRESS_TYPE)
                .state(ADRESS_STATE)
                .cep(ADRESS_CEP)
                .build();
    }

    public static AdressDTO createFakeEntity() {
        return AdressDTO.builder()
                .id(ADRESS_ID)
                .street(STREET_NAME)
                .number(STREET_NUMBER)
                .type(ADRESS_TYPE)
                .state(ADRESS_STATE)
                .cep(ADRESS_CEP)
                .build();
    }
}
