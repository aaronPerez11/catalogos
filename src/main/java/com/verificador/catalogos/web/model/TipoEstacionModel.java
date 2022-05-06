package com.verificador.catalogos.web.model;

import java.util.Objects;

import com.verificador.catalogos.domain.entity.TipoEstacion;

import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Getter
@Builder(toBuilder = true)
public class TipoEstacionModel {
	
	private Long id;
	private String combustible;
	private String codigo;
	
	@Tolerate
	protected TipoEstacionModel() {
		
	}
	
	public static TipoEstacionModel crearTipoEstacionModel(TipoEstacion tipoEstacion) {
		if(Objects.nonNull(tipoEstacion)) {
			return TipoEstacionModel.builder()
					.id(tipoEstacion.getId())
					.combustible(tipoEstacion.getTipoBomba().getCombustible())
					.codigo(tipoEstacion.getCodigo())
					.build();
		}
		return null;
	}

}
