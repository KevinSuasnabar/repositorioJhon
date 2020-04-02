package org.datas.prueba.conexion.models.dto;

import java.io.Serializable;

//DTO QUE SIRVE PARA CONSULTAR - SE PONEN LOS PARAMETROS DE LA CONSULTA
public class ConsultaDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String FEHO;
	private Character MODO;
	private String CTDA;
	private Character CDMA;
	private Character MARC;
	private Character TPAR;
	private Character CDAR;
	private Character NBAR;
	private Character CDCO;
	private Character CODC;
	private Character CDTP;
	private Character CTEM;

	public ConsultaDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConsultaDto(String fEHO, Character mODO, String cTDA, Character cDMA, Character mARC, Character tPAR, Character cDAR,
			Character nBAR, Character cDCO, Character cODC, Character cDTP, Character cTEM) {
		super();
		FEHO = fEHO;
		MODO = mODO;
		CTDA = cTDA;
		CDMA = cDMA;
		MARC = mARC;
		TPAR = tPAR;
		CDAR = cDAR;
		NBAR = nBAR;
		CDCO = cDCO;
		CODC = cODC;
		CDTP = cDTP;
		CTEM = cTEM;
	}

	public String getFEHO() {
		return FEHO;
	}

	public void setFEHO(String fEHO) {
		FEHO = fEHO;
	}

	public Character getMODO() {
		return MODO;
	}

	public void setMODO(Character mODO) {
		MODO = mODO;
	}

	public String getCTDA() {
		return CTDA;
	}

	public void setCTDA(String cTDA) {
		CTDA = cTDA;
	}

	public Character getCDMA() {
		return CDMA;
	}

	public void setCDMA(Character cDMA) {
		CDMA = cDMA;
	}

	public Character getMARC() {
		return MARC;
	}

	public void setMARC(Character mARC) {
		MARC = mARC;
	}

	public Character getTPAR() {
		return TPAR;
	}

	public void setTPAR(Character tPAR) {
		TPAR = tPAR;
	}

	public Character getCDAR() {
		return CDAR;
	}

	public void setCDAR(Character cDAR) {
		CDAR = cDAR;
	}

	public Character getNBAR() {
		return NBAR;
	}

	public void setNBAR(Character nBAR) {
		NBAR = nBAR;
	}

	public Character getCDCO() {
		return CDCO;
	}

	public void setCDCO(Character cDCO) {
		CDCO = cDCO;
	}

	public Character getCODC() {
		return CODC;
	}

	public void setCODC(Character cODC) {
		CODC = cODC;
	}

	public Character getCDTP() {
		return CDTP;
	}

	public void setCDTP(Character cDTP) {
		CDTP = cDTP;
	}

	public Character getCTEM() {
		return CTEM;
	}

	public void setCTEM(Character cTEM) {
		CTEM = cTEM;
	}

}
