package com.verificador.catalogos.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Table(name = "tipo_bomba", schema = "public", indexes = {
		@Index(name = "id_tipo_bomba_idx", columnList = "id_tipo_bomba")
})
@Getter
public class TipoBomba implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_tipo_bomba")
	private Long id;
	
	@Column(name = "tipo_combustible")
	private String combustible;
}
