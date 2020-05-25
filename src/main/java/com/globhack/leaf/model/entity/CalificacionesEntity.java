package com.globhack.leaf.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "calificaciones")
public class CalificacionesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "calificaciones_seq", sequenceName = "calificaciones_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "calificaciones_seq")
	@Column(name = "cdcalificacion", updatable = false)
	private Integer cdcalificacion;

	private int nmcalificacion;

	private String dsobservacion;

	@Basic(optional = false)
	@Column(name = "feregistro", insertable = false, updatable = false, columnDefinition = "timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date feregistro;

	@ManyToOne
	@JoinColumn(name = "cdclase", referencedColumnName = "cdclase", insertable = false, updatable = false)
	private ClasesEntity nmcalificacionClase;

	@PrePersist
	public void prePersist() {
		feregistro = new Date();
	}

	/**
	 * @return the cdcalificacion
	 */
	public Integer getCdcalificacion() {
		return cdcalificacion;
	}

	/**
	 * @param cdcalificacion the cdcalificacion to set
	 */
	public void setCdcalificacion(Integer cdcalificacion) {
		this.cdcalificacion = cdcalificacion;
	}

	/**
	 * @return the nmcalificacion
	 */
	public int getNmcalificacion() {
		return nmcalificacion;
	}

	/**
	 * @param nmcalificacion the nmcalificacion to set
	 */
	public void setNmcalificacion(int nmcalificacion) {
		this.nmcalificacion = nmcalificacion;
	}

	/**
	 * @return the dsobservacion
	 */
	public String getDsobservacion() {
		return dsobservacion;
	}

	/**
	 * @param dsobservacion the dsobservacion to set
	 */
	public void setDsobservacion(String dsobservacion) {
		this.dsobservacion = dsobservacion;
	}

	/**
	 * @return the feregistro
	 */
	public Date getFeregistro() {
		return feregistro;
	}

	/**
	 * @param feregistro the feregistro to set
	 */
	public void setFeregistro(Date feregistro) {
		this.feregistro = feregistro;
	}

	/**
	 * @return the nmcalificacionClase
	 */
	public ClasesEntity getNmcalificacionClase() {
		return nmcalificacionClase;
	}

	/**
	 * @param nmcalificacionClase the nmcalificacionClase to set
	 */
	public void setNmcalificacionClase(ClasesEntity nmcalificacionClase) {
		this.nmcalificacionClase = nmcalificacionClase;
	}
}
