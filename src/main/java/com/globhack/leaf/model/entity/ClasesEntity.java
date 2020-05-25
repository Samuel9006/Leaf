package com.globhack.leaf.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "clases")
public class ClasesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	/*@SequenceGenerator(name = "clases_seq", sequenceName = "clases_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clases_seq")*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "cdclase", updatable = false)
	private Integer cdclase;

	@NotEmpty(message = "El campo 'Nombre de la clase' es requerido")
	@Column(name = "dsnombre_clase", nullable = false)
	private String dsnombreClase;

	//@NotEmpty(message = "El campo 'Tiempo de la clase' es requerido")
	@Column(name = "nmtiempo_clase", nullable = true)
	private Integer nmTiempoClase;

	@NotEmpty(message = "El campo 'DescripciÃ³n de la clase' es requerido")
	@Column(nullable = false)
	private String dsclase;

	// relations
	@JsonIgnore(true)
	@OneToMany(mappedBy = "clase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ParticipantesEntity> lstClases;
	@JsonIgnore(true)
	@OneToMany(mappedBy = "nmcalificacionClase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CalificacionesEntity> lstClaseCalificacion;
	

	/**
	 * @return the cdclase
	 */
	public Integer getCdclase() {
		return cdclase;
	}

	/**
	 * @param cdclase the cdclase to set
	 */
	public void setCdclase(Integer cdclase) {
		this.cdclase = cdclase;
	}

	/**
	 * @return the dsnombreClase
	 */
	public String getDsnombreClase() {
		return dsnombreClase;
	}

	/**
	 * @param dsnombreClase the dsnombreClase to set
	 */
	public void setDsnombreClase(String dsnombreClase) {
		this.dsnombreClase = dsnombreClase;
	}

	/**
	 * @return the nmTiempoClase
	 */
	public int getNmTiempoClase() {
		return nmTiempoClase;
	}

	/**
	 * @param nmTiempoClase the nmTiempoClase to set
	 */
	public void setNmTiempoClase(int nmTiempoClase) {
		this.nmTiempoClase = nmTiempoClase;
	}

	/**
	 * @return the dsclase
	 */
	public String getDsclase() {
		return dsclase;
	}

	/**
	 * @param dsclase the dsclase to set
	 */
	public void setDsclase(String dsclase) {
		this.dsclase = dsclase;
	}

	/**
	 * @return the lstClases
	 */
	public List<ParticipantesEntity> getLstClases() {
		return lstClases;
	}

	/**
	 * @param lstClases the lstClases to set
	 */
	public void setLstClases(List<ParticipantesEntity> lstClases) {
		this.lstClases = lstClases;
	}
	
	
}
