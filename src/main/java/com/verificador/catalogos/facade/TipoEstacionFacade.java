package com.verificador.catalogos.facade;

import java.util.List;
import com.verificador.catalogos.web.model.TipoEstacionModel;

public interface TipoEstacionFacade {
	public List<TipoEstacionModel> findTipoEstacionByIdEstacion(Long id, Long idGasolinera);
}
