package com.luizfreitas.personapi.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum AdressType {

    COMMERCIAL("Commercial"),
    HOME("Home");

    private final String description;

}
