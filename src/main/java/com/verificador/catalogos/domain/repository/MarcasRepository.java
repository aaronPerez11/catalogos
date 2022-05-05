package com.verificador.catalogos.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.verificador.catalogos.domain.entity.Marcas;

public interface MarcasRepository extends CrudRepository<Marcas, Long>{
	List<Marcas> findAll();
	Optional<Marcas> findById(Long id);

}
