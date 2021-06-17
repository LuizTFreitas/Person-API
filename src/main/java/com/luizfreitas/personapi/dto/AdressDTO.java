package com.luizfreitas.personapi.dto;

import com.luizfreitas.personapi.enums.AdressType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdressDTO {

    private long id;

    @NotEmpty
    private String street;

    @NotEmpty
    @Size(min = 1, max = 4)
    private String number;

    @Enumerated(EnumType.STRING)
    private AdressType type;

    @NotEmpty
    @Size(min = 2, max = 2)
    private String state;

    @NotEmpty
    @Size(min = 8, max = 8)
    private String cep;
}
