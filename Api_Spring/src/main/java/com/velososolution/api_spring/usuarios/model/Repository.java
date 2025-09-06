package com.velososolution.api_spring.usuarios.model;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "usuarios", path = "usuarios")
public interface Repository extends JpaRepository<Usuarios, Long> {

}
