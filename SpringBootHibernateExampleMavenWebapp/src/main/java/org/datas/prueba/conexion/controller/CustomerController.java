package org.datas.prueba.conexion.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.datas.prueba.conexion.models.dto.ConsultaDto;
import org.datas.prueba.conexion.models.dto.PojoDto;
import org.datas.prueba.conexion.models.dto.ProductoDto;
import org.datas.prueba.conexion.models.dto.pojoDto2;
import org.datas.prueba.conexion.models.entity.ADMTB001;
import org.datas.prueba.conexion.models.services.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private ICustomerService serviceADMT;

	// prueba
	@GetMapping("/prueba")
	private List<ADMTB001> getAll() {
		return serviceADMT.getAll();
	}

	// prueba
	@GetMapping("/prueba1")
	private List<pojoDto2> getAll1() {
		return serviceADMT.getByName("kevin");
	}

	/*********************
	 * CONTROLADOR QUE USA EL PROCEDIMIENTO ALMACENADO
	 **************************************/
	@PostMapping("/productos")
	private ResponseEntity<?> getAll2(@RequestBody ConsultaDto consulta) {
		ProductoDto p = serviceADMT.getAll1(consulta.getFEHO(), consulta.getMODO(), consulta.getCTDA(),
				consulta.getCDMA(), consulta.getMARC(), consulta.getTPAR(), consulta.getCDAR(), consulta.getNBAR(),
				consulta.getCDCO(), consulta.getCODC(), consulta.getCDTP(), consulta.getCTEM());

		return new ResponseEntity<>(p, HttpStatus.OK);
	}

}
