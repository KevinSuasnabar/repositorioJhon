package org.datas.prueba.conexion.models.dto;

import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;


//eSTE CLASE POJO SOLO ES DE PRUEBA
@NamedStoredProcedureQueries({
		@NamedStoredProcedureQuery(name = "SelectAllCustomers", procedureName = "SelectAllCustomers", resultClasses = {
				pojoDto2.class }, parameters = {
						@StoredProcedureParameter(mode = ParameterMode.IN, name = "@customer_name", type = String.class),

		}) })
public class pojoDto2 {

	private Long id;

	private String customerName;

	private String email;

	public pojoDto2(Long id, String customerName, String email) {
		this.id = id;
		this.customerName = customerName;
		this.email = email;
	}

	public pojoDto2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
