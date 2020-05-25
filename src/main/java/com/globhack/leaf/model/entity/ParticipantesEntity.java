package com.globhack.leaf.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "participantes")
@IdClass(ParticipantesId.class)
public class ParticipantesEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer nmdocumento;

	@Id
	private Integer cdclase;

	@Basic(optional = false)
	@Column(name = "feregistro", updatable = false, columnDefinition = "timestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date feregistro;

	@ManyToOne
	@JoinColumn(name = "nmdocumento", referencedColumnName = "nmdocumento", insertable = false, updatable = false)
	private UsuariosEntity usuario;

	@ManyToOne
	@JoinColumn(name = "cdclase", referencedColumnName = "cdclase", insertable = false, updatable = false)
	private ClasesEntity clase;

	/**
	 * @return the nmdocumento
	 */
	public Integer getNmdocumento() {
		return nmdocumento;
	}

	/**
	 * @param nmdocumento the nmdocumento to set
	 */
	public void setNmdocumento(Integer nmdocumento) {
		this.nmdocumento = nmdocumento;
	}

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
	 * @return the usuario
	 */
	public UsuariosEntity getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(UsuariosEntity usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the clase
	 */
	public ClasesEntity getClase() {
		return clase;
	}

	/**
	 * @param clase the clase to set
	 */
	public void setClase(ClasesEntity clase) {
		this.clase = clase;
	}

}
