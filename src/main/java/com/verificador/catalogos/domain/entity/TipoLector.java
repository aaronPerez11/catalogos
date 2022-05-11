package com.verificador.catalogos.domain.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name = "tipo_lector", schema = "public",
indexes = {
		@Index(name = "id_tipo_lector_idx", columnList = "id_tipo_lector")
})
@Getter
public class TipoLector implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_lector")
	private Long id;
	
	@Column(name = "version")
	private String version;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "fecha_actualizacion")
	private Date ultimaActualizacion;

}
