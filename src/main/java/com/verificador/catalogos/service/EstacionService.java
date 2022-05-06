package com.verificador.catalogos.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verificador.catalogos.domain.entity.Estacion;
import com.verificador.catalogos.domain.repository.EstacionRepository;
import com.verificador.catalogos.facade.EstacionFacade;
import com.verificador.catalogos.web.model.EstacionModel;
import com.verificador.catalogos.web.model.MarcaModel;
import static com.verificador.catalogos.web.model.EstacionModel.crearEstacionModel;

@Service
public class EstacionService implements EstacionFacade {
	
	private final EstacionRepository estacionRepository;
	private final MarcaService marcaService;
	
	@Autowired
	public EstacionService(EstacionRepository estacionRepository,
			MarcaService marcaService) {
		this.estacionRepository = estacionRepository;
		this.marcaService = marcaService;
	}


	@Override
	public List<EstacionModel> findEstacionByIdMarca(Long id) {
		List<Estacion> consultarEstaciones = estacionRepository.findByMarcaId(id);
		
		return consultarEstaciones
				.stream()
				.map(estacion -> crearEstacionModel(estacion))
				.collect(Collectors.toList());
	}


	@Override
	public EstacionModel findEstacionById(Long id) {
		Estacion estacionEntity = estacionRepository.findById(id).orElseThrow();
		return crearEstacionModel(estacionEntity);
	}

	
	public EstacionModel findEstacionIdMarcaIdEstacion(Long id, Long idGasolinera) {
		
		MarcaModel marca = marcaService.findById(id);
		EstacionModel gasolinera = findEstacionById(idGasolinera);
		
		if(!marca.getNombre().equalsIgnoreCase(gasolinera.getNombre())) {
			new Throwable("Error");
		}
		
		return gasolinera;
	}
}
