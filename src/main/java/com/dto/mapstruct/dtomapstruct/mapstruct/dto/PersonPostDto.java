package com.dto.mapstruct.dtomapstruct.mapstruct.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonPostDto {
    private long id;
    private String name;
    private String lastName;

}
