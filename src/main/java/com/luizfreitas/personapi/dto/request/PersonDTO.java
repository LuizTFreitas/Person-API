package com.luizfreitas.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String fname;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lname;

    @NotEmpty
    @CPF
    private String cpf;

    private LocalDate birthDate;

    @NotEmpty
    @Valid
    private List<PhoneDTO> phones;

    @NotEmpty
    @Valid
    private List<AdressDTO> adresses;
}
