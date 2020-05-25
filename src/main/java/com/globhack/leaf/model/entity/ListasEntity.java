package com.globhack.leaf.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="listas")
public class ListasEntity implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @SequenceGenerator(name="listas_seq",
                       sequenceName="listas_seq",
                       allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator="listas_seq")
    @Column(name = "cdlista", updatable=false)
    private Integer cdlista;
	
	private String dscodigo;
	
	private String dsvalor;
	
	private String snactivo;
	
	private Integer cdlista_dependencia;

	/**
	 * @return the cdlista
	 */
	public Integer getCdlista() {
		return cdlista;
	}

	/**
	 * @param cdlista the cdlista to set
	 */
	public void setCdlista(Integer cdlista) {
		this.cdlista = cdlista;
	}

	/**
	 * @return the dscodigo
	 */
	public String getDscodigo() {
		return dscodigo;
	}

	/**
	 * @param dscodigo the dscodigo to set
	 */
	public void setDscodigo(String dscodigo) {
		this.dscodigo = dscodigo;
	}

	/**
	 * @return the dsvalor
	 */
	public String getDsvalor() {
		return dsvalor;
	}

	/**
	 * @param dsvalor the dsvalor to set
	 */
	public void setDsvalor(String dsvalor) {
		this.dsvalor = dsvalor;
	}

	/**
	 * @return the snactivo
	 */
	public String getSnactivo() {
		return snactivo;
	}

	/**
	 * @param snactivo the snactivo to set
	 */
	public void setSnactivo(String snactivo) {
		this.snactivo = snactivo;
	}

	/**
	 * @return the cdlista_dependencia
	 */
	public Integer getCdlista_dependencia() {
		return cdlista_dependencia;
	}

	/**
	 * @param cdlista_dependencia the cdlista_dependencia to set
	 */
	public void setCdlista_dependencia(Integer cdlista_dependencia) {
		this.cdlista_dependencia = cdlista_dependencia;
	}
}
