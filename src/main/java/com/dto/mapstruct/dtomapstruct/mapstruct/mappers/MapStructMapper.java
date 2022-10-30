package com.dto.mapstruct.dtomapstruct.mapstruct.mappers;

import com.dto.mapstruct.dtomapstruct.domain.Person;
import com.dto.mapstruct.dtomapstruct.mapstruct.dto.PersonGetDto;
import com.dto.mapstruct.dtomapstruct.mapstruct.dto.PersonPostDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {
    PersonGetDto PersonToPersonDto(Person person);

    Person personPostDtoToPerson(PersonPostDto personPostDto);
}
