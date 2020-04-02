package org.datas.prueba.conexion.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This is our model class and it corresponds to Customer table in database
 */

/*CLASE ENTITY DE MAPEO A UNA TABLA DE LA BD PARA HACER PRUEBAS*/
@Entity
@Table(name = "ADMTB001")
public class ADMTB001 {

	@Id
	@Column(name = "AD001FORM", columnDefinition = "char(15)")
	private String AD001FORM;

	@Column(name = "AD001APLI", columnDefinition = "char(15)")
	private String AD001APLI;

	@Column(name = "AD001DESC", columnDefinition = "varchar(50)")
	private String AD001DESC;

	public ADMTB001() {
		super();
	}

	public ADMTB001(String AD001APLI, String AD001DESC) {
		super();
		this.AD001APLI = AD001APLI;
		this.AD001DESC = AD001DESC;
	}

	public String getAD001FORM() {
		return AD001FORM;
	}

	public void setAD001FORM(String aD001FORM) {
		AD001FORM = aD001FORM;
	}

	public String getAD001APLI() {
		return AD001APLI;
	}

	public void setAD001APLI(String aD001APLI) {
		AD001APLI = aD001APLI;
	}

	public String getAD001DESC() {
		return AD001DESC;
	}

	public void setAD001DESC(String aD001DESC) {
		AD001DESC = aD001DESC;
	}

}
