package com.verificador.catalogos.web.model;

import java.util.Date;
import java.util.Objects;

import com.verificador.catalogos.domain.entity.TipoLector;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Tolerate;

@Getter
@Setter
@Builder(toBuilder = true)
@Schema(name = "Tipo Lector", description = "Modelo de datos que identifica el tipo de lector")
public class TipoLectorModel {

	@Schema(description = "Identificador único del programa de control volumétrico", example = "1")
	private Long id;
	
	@Schema(description = "Marca del control volumétrico", example = "eGas")
	private String marca;
	
	@Schema(description = "Versión del programa", example = "10.4.5")
	private String version;
	
	@Schema(description = "Fecha de última actualización del control volumétrico", example = "01-04-2022")
	private Date fecha;
	
	@Tolerate
	protected TipoLectorModel() {
		
	}
	
	public static TipoLectorModel crearTipoLectorModel(TipoLector lector) {
		if(Objects.nonNull(lector)) {
			return TipoLectorModel.builder()
					.id(lector.getId())
					.marca(lector.getMarca())
					.version(lector.getVersion())
					.fecha(lector.getUltimaActualizacion())
					.build();
		}
		return null;
	}
}
