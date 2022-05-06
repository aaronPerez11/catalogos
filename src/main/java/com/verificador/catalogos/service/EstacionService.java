package com.verificador.catalogos.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verificador.catalogos.domain.entity.Estacion;
import com.verificador.catalogos.domain.repository.EstacionRepository;
import com.verificador.catalogos.facade.EstacionFacade;
import com.verificador.catalogos.web.model.EstacionModel;
import static com.verificador.catalogos.web.model.EstacionModel.crearEstacionModel;

@Service
public class EstacionService implements EstacionFacade {
	
	private final EstacionRepository estacionRepository;
	
	@Autowired
	public EstacionService(EstacionRepository estacionRepository) {
		this.estacionRepository = estacionRepository;
	}


	@Override
	public List<EstacionModel> findEstacionByIdMarca(Long id) {
		List<Estacion> consultarEstaciones = estacionRepository.findByMarcaId(id);
		
		return consultarEstaciones
				.stream()
				.map(estacion -> crearEstacionModel(estacion))
				.collect(Collectors.toList());
		
	}

}
