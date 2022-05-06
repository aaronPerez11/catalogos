package com.verificador.catalogos.facade;

import java.util.List;
import com.verificador.catalogos.web.model.EstacionModel;

public interface EstacionFacade {
	
	public EstacionModel findEstacionById(Long id);
	public List<EstacionModel> findEstacionByIdMarca(Long id);
}
