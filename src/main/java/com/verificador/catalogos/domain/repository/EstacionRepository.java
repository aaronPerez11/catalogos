package com.verificador.catalogos.domain.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.verificador.catalogos.domain.entity.Estacion;

public interface EstacionRepository extends CrudRepository<Estacion, Long>{

	List<Estacion> findByMarcaId(Long id);
}
