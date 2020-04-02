package org.datas.prueba.conexion.models.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.datas.prueba.conexion.models.dto.PojoDto;
import org.datas.prueba.conexion.models.dto.ProductoDto;
import org.datas.prueba.conexion.models.dto.pojoDto2;
import org.datas.prueba.conexion.models.entity.ADMTB001;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

//	public List<Customer> getAllCustomers() {
//		Session session = this.sessionFactory.getCurrentSession();
//		List<Customer> customerList = session.createQuery("from Customer").list();
//		return customerList;
//	}
//
//	public Customer getCustomer(int id) {
//		Session session = this.sessionFactory.getCurrentSession();
//		Customer customer = (Customer) session.get(Customer.class, id);
//		return customer;
//	}
//
//	public Customer addCustomer(Customer customer) {
//		Session session = this.sessionFactory.getCurrentSession();
//		session.save(customer);
//		return customer;
//	}
//
//	public void updateCustomer(Customer customer) {
//		Session session = this.sessionFactory.getCurrentSession();
//		session.update(customer);
//	}
//
//	public void deleteCustomer(int id) {
//		Session session = this.sessionFactory.getCurrentSession();
//		Customer p = (Customer) session.load(Customer.class, new Integer(id));
//		if (null != p) {
//			session.delete(p);
//		}
//	}

	//PARA PRUEBA
	@Override
	public List<ADMTB001> getTodos() {
		Session session = this.sessionFactory.getCurrentSession();
		List<ADMTB001> customerList = session.createQuery("from ADMTB001").list();
		return customerList;
	}

	//PARA PRUEBA
	@Override
	@SuppressWarnings("unchecked")
	public List<pojoDto2> getByName(String customer_name) {
		Session session = this.sessionFactory.getCurrentSession();
		StoredProcedureQuery sp = session.createStoredProcedureCall("SelectAllCustomers");
		sp.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		sp.setParameter(1, customer_name);
		sp.execute();

		return sp.getResultList();
	}
	
	/*******************METODO QUE USA EL PROCEDIMIENTO USP_700_STOCK_FAB*******************************/

	@Override
	@SuppressWarnings("unchecked")
	public ProductoDto getAll(String FEHO, Character MODO, String CTDA, Character CDMA, Character MARC, Character TPAR,
			Character CDAR, Character NBAR, Character CDCO, Character CODC, Character CDTP, Character CTEM) {
		Session session = this.sessionFactory.getCurrentSession();
		StoredProcedureQuery sp = session.createStoredProcedureCall("USP_700_STOCK_FAB");
		sp.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(2, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(3, String.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(4, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(5, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(6, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(7, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(8, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(9, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(10, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(11, Character.class, ParameterMode.IN);
		sp.registerStoredProcedureParameter(12, Character.class, ParameterMode.IN);

		sp.setParameter(1, FEHO);
		sp.setParameter(2, MODO);
		sp.setParameter(3, CTDA);
		sp.setParameter(4, CDMA);
		sp.setParameter(5, MARC);
		sp.setParameter(6, TPAR);
		sp.setParameter(7, CDAR);
		sp.setParameter(8, NBAR);
		sp.setParameter(9, CDCO);
		sp.setParameter(10, CODC);
		sp.setParameter(11, CDTP);
		sp.setParameter(12, CTEM);

		sp.execute();
		
		
		ProductoDto pDto=new ProductoDto();

		pDto.setListaDetallle(sp.getResultList());

		return pDto;
	}

}
