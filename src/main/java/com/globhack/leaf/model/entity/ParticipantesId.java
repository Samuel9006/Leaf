package com.globhack.leaf.model.entity;

import java.io.Serializable;

import javax.persistence.Column;

public class ParticipantesId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "nmdocumento")
	private Integer nmdocumento;

	@Column(name = "cdclase")
	private Integer cdclase;

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

}
