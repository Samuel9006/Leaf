package com.globhack.leaf.model.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuarios")
public class UsuariosEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private Integer nmdocumento;

	@NotEmpty(message = "El campo 'Tipo de documento' es requerido")
	@Column(name = "dstipo_documento", nullable = false)
	private String dstipoDocumento;

	@NotEmpty(message = "El campo 'primer apellido' es requerido")
	@Column(name = "dsprimer_apellido", nullable = false)
	private String dsprimerApellido;

	@Column(name = "dssegundo_apellido", nullable = true)
	private String dssegundoApellido;

	@NotEmpty(message = "El campo 'primer nombre' es requerido")
	@Column(name = "dsprimer_nombre", nullable = false)
	private String dsprimerNombre;

	@Column(name = "dssegundo_nombre", nullable = true)
	private String dssegundoNombre;

	@Column(nullable = true,unique=true)
	private String dscorreo;

	@NotEmpty(message = "El campo 'Usuario' es requerido")
	@Column(nullable = false,unique=true)
	private String dsusuario;

	@NotEmpty(message = "El campo 'Clave' es requerido")
	@Column(nullable = false)
	private String dsclave;

	// relations
	@JsonIgnore(true)
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ParticipantesEntity> lstParticipantes;

	@JsonIgnore(true)
	@OneToMany(mappedBy = "usuarioprof", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ClasesEntity> lstClasesProfesor;

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
	 * @return the dstipoDocumento
	 */
	public String getDstipoDocumento() {
		return dstipoDocumento;
	}

	/**
	 * @param dstipoDocumento the dstipoDocumento to set
	 */
	public void setDstipoDocumento(String dstipoDocumento) {
		this.dstipoDocumento = dstipoDocumento;
	}

	/**
	 * @return the dsprimerApellido
	 */
	public String getDsprimerApellido() {
		return dsprimerApellido;
	}

	/**
	 * @param dsprimerApellido the dsprimerApellido to set
	 */
	public void setDsprimerApellido(String dsprimerApellido) {
		this.dsprimerApellido = dsprimerApellido;
	}

	/**
	 * @return the dssegundoApellido
	 */
	public String getDssegundoApellido() {
		return dssegundoApellido;
	}

	/**
	 * @param dssegundoApellido the dssegundoApellido to set
	 */
	public void setDssegundoApellido(String dssegundoApellido) {
		this.dssegundoApellido = dssegundoApellido;
	}

	/**
	 * @return the dsprimerNombre
	 */
	public String getDsprimerNombre() {
		return dsprimerNombre;
	}

	/**
	 * @param dsprimerNombre the dsprimerNombre to set
	 */
	public void setDsprimerNombre(String dsprimerNombre) {
		this.dsprimerNombre = dsprimerNombre;
	}

	/**
	 * @return the dssegundoNombre
	 */
	public String getDssegundoNombre() {
		return dssegundoNombre;
	}

	/**
	 * @param dssegundoNombre the dssegundoNombre to set
	 */
	public void setDssegundoNombre(String dssegundoNombre) {
		this.dssegundoNombre = dssegundoNombre;
	}

	/**
	 * @return the dscorreo
	 */
	public String getDscorreo() {
		return dscorreo;
	}

	/**
	 * @param dscorreo the dscorreo to set
	 */
	public void setDscorreo(String dscorreo) {
		this.dscorreo = dscorreo;
	}

	/**
	 * @return the dsusuario
	 */
	public String getDsusuario() {
		return dsusuario;
	}

	/**
	 * @param dsusuario the dsusuario to set
	 */
	public void setDsusuario(String dsusuario) {
		this.dsusuario = dsusuario;
	}

	/**
	 * @return the dsclave
	 */
	public String getDsclave() {
		return dsclave;
	}

	/**
	 * @param dsclave the dsclave to set
	 */
	public void setDsclave(String dsclave) {
		this.dsclave = dsclave;
	}

	/**
	 * @return the lstParticipantes
	 */
	public List<ParticipantesEntity> getLstParticipantes() {
		return lstParticipantes;
	}

	/**
	 * @param lstParticipantes the lstParticipantes to set
	 */
	public void setLstParticipantes(List<ParticipantesEntity> lstParticipantes) {
		this.lstParticipantes = lstParticipantes;
	}

	/**
	 * @return the lstClasesProfesor
	 */
	public List<ClasesEntity> getLstClasesProfesor() {
		return lstClasesProfesor;
	}

	/**
	 * @param lstClasesProfesor the lstClasesProfesor to set
	 */
	public void setLstClasesProfesor(List<ClasesEntity> lstClasesProfesor) {
		this.lstClasesProfesor = lstClasesProfesor;
	}

}
