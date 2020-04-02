package org.datas.prueba.conexion.models.dto;

import java.io.Serializable;
import java.util.List;

//dto QUE CONTIENE LA LISTA DE POJOdtO
public class ProductoDto implements Serializable {

	public ProductoDto(List<PojoDto> listaDetallle) {
		super();
		this.listaDetallle = listaDetallle;
	}

	public ProductoDto() {
		super();
	}

	private List<PojoDto> listaDetallle;

	public List<PojoDto> getListaDetallle() {
		return listaDetallle;
	}

	public void setListaDetallle(List<PojoDto> listaDetallle) {
		this.listaDetallle = listaDetallle;
	}

	private static final long serialVersionUID = 1L;

}
