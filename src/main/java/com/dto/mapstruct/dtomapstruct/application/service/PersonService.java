package com.dto.mapstruct.dtomapstruct.application.service;

import com.dto.mapstruct.dtomapstruct.domain.Person;
import com.dto.mapstruct.dtomapstruct.infraestructure.repository.PersonRepository;
import com.dto.mapstruct.dtomapstruct.mapstruct.dto.PersonGetDto;
import com.dto.mapstruct.dtomapstruct.mapstruct.dto.PersonPostDto;
import com.dto.mapstruct.dtomapstruct.mapstruct.mappers.MapStructMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class PersonService {

    private MapStructMapper mapstructMapper;
    private PersonRepository personRepository;

    @Autowired
    public PersonService(MapStructMapper mapstructMapper, PersonRepository personRepository) {
        this.mapstructMapper = mapstructMapper;
        this.personRepository = personRepository;
    }



    public void addPerson(PersonPostDto personPostDto){
        Person person = mapstructMapper.personPostDtoToPerson(personPostDto);
        personRepository.save(person);
    }

    public PersonGetDto getById(long id){
        return mapstructMapper.PersonToPersonDto(personRepository.findById(id).get());
    }
}
