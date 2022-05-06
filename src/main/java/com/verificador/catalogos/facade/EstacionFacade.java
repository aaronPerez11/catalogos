package com.verificador.catalogos.facade;

import java.util.List;
import com.verificador.catalogos.web.model.EstacionModel;

public interface EstacionFacade {
	public List<EstacionModel> findEstacionByIdMarca(Long id);
}
