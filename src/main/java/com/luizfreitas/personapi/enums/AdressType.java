package com.luizfreitas.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AdressType {

    COMERCIAL("Comercial"),
    RESIDENCIAL("Residencial");

    private String description;

}
