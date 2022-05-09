package com.verificador.catalogos.web.model;

import java.util.Objects;

import com.verificador.catalogos.domain.entity.TipoEstacion;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.experimental.Tolerate;

@Getter
@Builder(toBuilder = true)
@Schema(name = "Tipo estación", description = "Modelo de datos para el tipo estaciones de servicio")
public class TipoEstacionModel {
	
	@Schema(description = "Identificador único de la estación de servicio", example = "1")
	private Long id;
	
	@Schema(description = "Tipo de combustible que entrega", example = "GASOLINA")
	private String combustible;
	
	@Schema(description = "Código asignado a la estación de servicio", example = "ESG-001")
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
