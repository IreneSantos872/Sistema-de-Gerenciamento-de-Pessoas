package com.one.digitalinnovation.personapi.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    HOME("Home"),
    MOBILE("Mobile"),
    COMERCIAL("Comercial");

    private final String description;
}
