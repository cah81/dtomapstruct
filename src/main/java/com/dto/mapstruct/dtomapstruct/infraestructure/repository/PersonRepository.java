package com.dto.mapstruct.dtomapstruct.infraestructure.repository;

import com.dto.mapstruct.dtomapstruct.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
}
