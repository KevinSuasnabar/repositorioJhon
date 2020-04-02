package org.datas.prueba.conexion.models.services;

import java.util.List;

import org.datas.prueba.conexion.models.dto.PojoDto;
import org.datas.prueba.conexion.models.dto.ProductoDto;
import org.datas.prueba.conexion.models.dto.pojoDto2;
import org.datas.prueba.conexion.models.entity.ADMTB001;

public interface ICustomerService {
	//PRUEBA
	public List<ADMTB001> getAll();
	//PREIUBA
	public List<pojoDto2> getByName(String name);

	//***********************USA EL SP *////////////////////////////////
	public ProductoDto getAll1(String FEHO,Character MODO,String CTDA,Character CDMA,
			Character MARC,Character TPAR,Character CDAR,Character NBAR,Character CDCO,Character CODC,Character CDTP,Character CTEM);

}
