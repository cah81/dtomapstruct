package com.dto.mapstruct.dtomapstruct.infraestructure.controller;

import com.dto.mapstruct.dtomapstruct.application.service.PersonService;
import com.dto.mapstruct.dtomapstruct.domain.Person;
import com.dto.mapstruct.dtomapstruct.infraestructure.repository.PersonRepository;
import com.dto.mapstruct.dtomapstruct.mapstruct.dto.PersonGetDto;
import com.dto.mapstruct.dtomapstruct.mapstruct.dto.PersonPostDto;
import com.dto.mapstruct.dtomapstruct.mapstruct.mappers.MapStructMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {


    private MapStructMapper mapstructMapper;
    private PersonRepository personRepository;
    @Autowired
    public PersonController(MapStructMapper mapstructMapper, PersonRepository personRepository) {
        this.mapstructMapper = mapstructMapper;
        this.personRepository = personRepository;
    }

    @Autowired
    PersonService personService;


    @PostMapping()
    public ResponseEntity<Void> AddPerson(@RequestBody PersonPostDto personPostDto){

        personService.addPerson(personPostDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonGetDto> getPersonById(@PathVariable("id") long  id){

        return new ResponseEntity<>(personService.getById(id),HttpStatus.OK);
    }


}
