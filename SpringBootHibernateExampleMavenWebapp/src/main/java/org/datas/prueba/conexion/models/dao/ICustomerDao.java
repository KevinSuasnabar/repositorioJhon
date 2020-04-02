package org.datas.prueba.conexion.models.dao;

import java.util.List;

import org.datas.prueba.conexion.models.dto.PojoDto;
import org.datas.prueba.conexion.models.dto.ProductoDto;
import org.datas.prueba.conexion.models.dto.pojoDto2;
import org.datas.prueba.conexion.models.entity.ADMTB001;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerDao {

	//PRUEBA
	public List<ADMTB001> getTodos();

	//PREUBA
	public List<pojoDto2> getByName(String name);

	//**************METODO QUE USA EL SP *******************************//
	public ProductoDto getAll(String FEHO, Character MODO, String CTDA, Character CDMA, Character MARC, Character TPAR, Character CDAR,
			Character NBAR, Character CDCO, Character CODC, Character CDTP, Character CTEM);

}
