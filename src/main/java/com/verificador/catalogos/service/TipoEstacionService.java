package com.verificador.catalogos.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.verificador.catalogos.domain.entity.TipoEstacion;
import com.verificador.catalogos.domain.repository.TipoEstacionRepository;
import com.verificador.catalogos.facade.TipoEstacionFacade;
import com.verificador.catalogos.web.model.EstacionModel;
import com.verificador.catalogos.web.model.TipoEstacionModel;

@Service
public class TipoEstacionService implements TipoEstacionFacade{

	private final TipoEstacionRepository tipoEstacionRepository;
	private final EstacionService estacionService;

	@Autowired
	public TipoEstacionService(TipoEstacionRepository tipoEstacionRepository,
			MarcaService marcaService,
			EstacionService estacionService) {
		this.tipoEstacionRepository = tipoEstacionRepository;
		this.estacionService = estacionService;
	}

	@Override
	public List<TipoEstacionModel> findTipoEstacionByIdEstacion(Long id, Long idGasolinera) {
		
		EstacionModel estacion = estacionService.findEstacionIdMarcaIdEstacion(id, idGasolinera);
		List<TipoEstacion> consultarTipoEstaciones = tipoEstacionRepository.findByEstacionId(estacion.getId());

		if(consultarTipoEstaciones.isEmpty()) {
			
		}
		
		return consultarTipoEstaciones
				.stream()
				.map(tipoEstacion -> TipoEstacionModel.crearTipoEstacionModel(tipoEstacion))
				.collect(Collectors.toList());
	}
	
	
}
