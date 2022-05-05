package com.verificador.catalogos.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.verificador.catalogos.domain.entity.Marca;

public interface MarcaRepository extends CrudRepository<Marca, Long>{
	List<Marca> findAll();
	Optional<Marca> findById(Long id);

}
