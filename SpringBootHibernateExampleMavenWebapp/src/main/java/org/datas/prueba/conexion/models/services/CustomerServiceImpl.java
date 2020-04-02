package org.datas.prueba.conexion.models.services;

import java.util.List;

import org.datas.prueba.conexion.models.dao.ICustomerDao;
import org.datas.prueba.conexion.models.dto.PojoDto;
import org.datas.prueba.conexion.models.dto.ProductoDto;
import org.datas.prueba.conexion.models.dto.pojoDto2;
import org.datas.prueba.conexion.models.entity.ADMTB001;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("customerService")
public class CustomerServiceImpl implements ICustomerService{

	//INTANCIA INYECTADA
	@Autowired
	private ICustomerDao customerDao;
	
//	@Autowired
//	private ICustomerDao1 customerDao1;

//	@Override
//	@Transactional
//	public List<ADMTB001> getAll() {
//		// TODO Auto-generated method stub
//		return customerDao.getTodos();
//	}

	//METODO PRINCIPAL QUE USA EL STORE PROCEDURE********/////////
	@Override
	@Transactional
	public ProductoDto getAll1(String FEHO,Character MODO,String CTDA,Character CDMA,
			Character MARC,Character TPAR,Character CDAR,Character NBAR,Character CDCO,Character CODC,Character CDTP,Character CTEM) {
		// TODO Auto-generated method stub
		return customerDao.getAll(FEHO, MODO, CTDA, CDMA, MARC, TPAR, CDAR, NBAR, CDCO, CODC, CDTP, CTEM);
	}

	//PRUEBA
	@Override
	@Transactional
	public List<ADMTB001> getAll() {
		return customerDao.getTodos();
	}

	//PRUEBA
	@Override
	@Transactional
	public List<pojoDto2> getByName(String name) {
		// TODO Auto-generated method stub
		return customerDao.getByName(name);
	}
	

}
