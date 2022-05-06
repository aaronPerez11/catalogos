package com.verificador.catalogos.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import lombok.Getter;


@Entity
@Table(name = "tipo_estacion", schema = "public",
indexes = {
		@Index(name = "id_tipo_estacion_idx", columnList = "id_tipo_estacion")
})
@Getter
public class TipoEstacion implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_estacion")
	private Long id;
	
	@OneToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "id_tipo_bomba", referencedColumnName = "id_tipo_bomba")
	private TipoBomba tipoBomba;
	
	@OneToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "id_estacion", referencedColumnName = "id_estacion")
	private Estacion estacion;
	
	@Column(name = "nombre")
	private String codigo;
}
