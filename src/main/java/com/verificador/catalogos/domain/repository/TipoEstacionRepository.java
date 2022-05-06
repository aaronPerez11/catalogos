package com.verificador.catalogos.domain.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.verificador.catalogos.domain.entity.TipoEstacion;


public interface TipoEstacionRepository extends CrudRepository<TipoEstacion, Long>{

	List<TipoEstacion> findByEstacionId(Long id);
}
