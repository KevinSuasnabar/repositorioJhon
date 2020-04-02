package org.datas.prueba.conexion.models.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.ParameterMode;

//@NamedStoredProcedureQueries({
//		@NamedStoredProcedureQuery(name = "USP_700_STOCK_FAB", procedureName = "USP_700_STOCK_FAB", resultClasses = {
//				PojoDto.class }, parameters = {
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "FEHO", type = String.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "MODO", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "CTDA", type = String.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "CDMA", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "MARC", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "TPAR", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "CDAR", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "NBAR", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "CDCO", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "CODC", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "CDTP", type = Character.class),
//						@StoredProcedureParameter(mode = ParameterMode.IN, name = "CTEM", type = Character.class),
//
//		}) })  ESTA CLASE POJO ES LA PRINCIPAL ---- EL SP NOS DEVUELVE UN ARRAY DE ESTE OBJETO
public class PojoDto {

	private String CTDA;

	private String MARC;
	private String TPAR;
	private String CDAR;
	private String CDCO;
	private String SD01;
	private String SD02;
	private String SD03;
	private String SD04;
	private String SD05;
	private String SD06;
	private String SD07;
	private String SD08;
	private String SD09;
	private String SD10;
	private String SD11;
	private String SD12;
	private String SD13;
	private String SDTO;
	private String NTDA;
	private String CDCV;
	private String CDSC;
	private String NBMA;
	private String ABRE;
	private String ABR2;
	private String CDMA;
	private String NBGR;
	private String NBTA;
	private String ORDT;
	private String CDTP;
	private String NBPR;
	private String LINE;
	private String NBLI;
	private String NBAR;
	private String PCOS;
	private String PVPB;
	private String PUNI;
	private String PRIP;

	private String PRIF;
	private String FTDA;
	private String NBCO;
	private String CODC;
	private String NOMC;

	private String CT01;
	private String CT02;
	private String CT03;
	private String CT04;
	private String CT05;
	private String CT06;
	private String CT07;
	private String CT08;
	private String CT09;
	private String CT10;
	private String CT11;
	private String CT12;
	private String CT13;

	private String NBOR;
	private String NMOP;
	private String NBSC;
	private String NBTP;
	private String NBTE;
	private String TIPT;
	private String PERI;
	private String CUEL;
	private String MANG;
	private String BOTA;
	private String ENTA;
	private String NBMO;
	private String CTEM;
	private String NTEM;

	private String TEM2;
	private String TEM3;

	private String LETR;
	private String PRIM;
	private String SEGU;
	private String SALD;
	private String TERC;
	private String FALL;
	private String PUBL;
	private String OUTL;

	@Override
	public String toString() {
		return "PojoDto [CTDA=" + CTDA + ", MARC=" + MARC + ", TPAR=" + TPAR + ", CDAR=" + CDAR + ", CDCO=" + CDCO
				+ ", SD01=" + SD01 + ", SD02=" + SD02 + ", SD03=" + SD03 + ", SD04=" + SD04 + ", SD05=" + SD05
				+ ", SD06=" + SD06 + ", SD07=" + SD07 + ", SD08=" + SD08 + ", SD09=" + SD09 + ", SD10=" + SD10
				+ ", SD11=" + SD11 + ", SD12=" + SD12 + ", SD13=" + SD13 + ", SDTO=" + SDTO + ", NTDA=" + NTDA
				+ ", CDCV=" + CDCV + ", CDSC=" + CDSC + ", NBMA=" + NBMA + ", ABRE=" + ABRE + ", ABR2=" + ABR2
				+ ", CDMA=" + CDMA + ", NBGR=" + NBGR + ", NBTA=" + NBTA + ", ORDT=" + ORDT + ", CDTP=" + CDTP
				+ ", NBPR=" + NBPR + ", LINE=" + LINE + ", NBLI=" + NBLI + ", NBAR=" + NBAR + ", PCOS=" + PCOS
				+ ", PVPB=" + PVPB + ", PUNI=" + PUNI + ", PRIP=" + PRIP + ", PRIF=" + PRIF + ", FTDA=" + FTDA
				+ ", NBCO=" + NBCO + ", CODC=" + CODC + ", NOMC=" + NOMC + ", CT01=" + CT01 + ", CT02=" + CT02
				+ ", CT03=" + CT03 + ", CT04=" + CT04 + ", CT05=" + CT05 + ", CT06=" + CT06 + ", CT07=" + CT07
				+ ", CT08=" + CT08 + ", CT09=" + CT09 + ", CT10=" + CT10 + ", CT11=" + CT11 + ", CT12=" + CT12
				+ ", CT13=" + CT13 + ", NBOR=" + NBOR + ", NMOP=" + NMOP + ", NBSC=" + NBSC + ", NBTP=" + NBTP
				+ ", NBTE=" + NBTE + ", TIPT=" + TIPT + ", PERI=" + PERI + ", CUEL=" + CUEL + ", MANG=" + MANG
				+ ", BOTA=" + BOTA + ", ENTA=" + ENTA + ", NBMO=" + NBMO + ", CTEM=" + CTEM + ", NTEM=" + NTEM
				+ ", TEM2=" + TEM2 + ", TEM3=" + TEM3 + ", LETR=" + LETR + ", PRIM=" + PRIM + ", SEGU=" + SEGU
				+ ", SALD=" + SALD + ", TERC=" + TERC + ", FALL=" + FALL + ", PUBL=" + PUBL + ", OUTL=" + OUTL + "]";
	}

	public PojoDto(String cTDA, String mARC, String tPAR, String cDAR, String cDCO, String sD01, String sD02,
			String sD03, String sD04, String sD05, String sD06, String sD07, String sD08, String sD09, String sD10,
			String sD11, String sD12, String sD13, String sDTO, String nTDA, String cDCV, String cDSC, String nBMA,
			String aBRE, String aBR2, String cDMA, String nBGR, String nBTA, String oRDT, String cDTP, String nBPR,
			String lINE, String nBLI, String nBAR, String pCOS, String pVPB, String pUNI, String pRIP, String pRIF,
			String fTDA, String nBCO, String cODC, String nOMC, String cT01, String cT02, String cT03, String cT04,
			String cT05, String cT06, String cT07, String cT08, String cT09, String cT10, String cT11, String cT12,
			String cT13, String nBOR, String nMOP, String nBSC, String nBTP, String nBTE, String tIPT, String pERI,
			String cUEL, String mANG, String bOTA, String eNTA, String nBMO, String cTEM, String nTEM, String tEM2,
			String tEM3, String lETR, String pRIM, String sEGU, String sALD, String tERC, String fALL, String pUBL,
			String oUTL) {
		super();
		CTDA = cTDA;
		MARC = mARC;
		TPAR = tPAR;
		CDAR = cDAR;
		CDCO = cDCO;
		SD01 = sD01;
		SD02 = sD02;
		SD03 = sD03;
		SD04 = sD04;
		SD05 = sD05;
		SD06 = sD06;
		SD07 = sD07;
		SD08 = sD08;
		SD09 = sD09;
		SD10 = sD10;
		SD11 = sD11;
		SD12 = sD12;
		SD13 = sD13;
		SDTO = sDTO;
		NTDA = nTDA;
		CDCV = cDCV;
		CDSC = cDSC;
		NBMA = nBMA;
		ABRE = aBRE;
		ABR2 = aBR2;
		CDMA = cDMA;
		NBGR = nBGR;
		NBTA = nBTA;
		ORDT = oRDT;
		CDTP = cDTP;
		NBPR = nBPR;
		LINE = lINE;
		NBLI = nBLI;
		NBAR = nBAR;
		PCOS = pCOS;
		PVPB = pVPB;
		PUNI = pUNI;
		PRIP = pRIP;
		PRIF = pRIF;
		FTDA = fTDA;
		NBCO = nBCO;
		CODC = cODC;
		NOMC = nOMC;
		CT01 = cT01;
		CT02 = cT02;
		CT03 = cT03;
		CT04 = cT04;
		CT05 = cT05;
		CT06 = cT06;
		CT07 = cT07;
		CT08 = cT08;
		CT09 = cT09;
		CT10 = cT10;
		CT11 = cT11;
		CT12 = cT12;
		CT13 = cT13;
		NBOR = nBOR;
		NMOP = nMOP;
		NBSC = nBSC;
		NBTP = nBTP;
		NBTE = nBTE;
		TIPT = tIPT;
		PERI = pERI;
		CUEL = cUEL;
		MANG = mANG;
		BOTA = bOTA;
		ENTA = eNTA;
		NBMO = nBMO;
		CTEM = cTEM;
		NTEM = nTEM;
		TEM2 = tEM2;
		TEM3 = tEM3;
		LETR = lETR;
		PRIM = pRIM;
		SEGU = sEGU;
		SALD = sALD;
		TERC = tERC;
		FALL = fALL;
		PUBL = pUBL;
		OUTL = oUTL;
	}

	public PojoDto() {
		super();
	}

	public String getCTDA() {
		return CTDA;
	}

	public void setCTDA(String cTDA) {
		CTDA = cTDA;
	}

	public String getMARC() {
		return MARC;
	}

	public void setMARC(String mARC) {
		MARC = mARC;
	}

	public String getTPAR() {
		return TPAR;
	}

	public void setTPAR(String tPAR) {
		TPAR = tPAR;
	}

	public String getCDAR() {
		return CDAR;
	}

	public void setCDAR(String cDAR) {
		CDAR = cDAR;
	}

	public String getCDCO() {
		return CDCO;
	}

	public void setCDCO(String cDCO) {
		CDCO = cDCO;
	}

	public String getSD01() {
		return SD01;
	}

	public void setSD01(String sD01) {
		SD01 = sD01;
	}

	public String getSD02() {
		return SD02;
	}

	public void setSD02(String sD02) {
		SD02 = sD02;
	}

	public String getSD03() {
		return SD03;
	}

	public void setSD03(String sD03) {
		SD03 = sD03;
	}

	public String getSD04() {
		return SD04;
	}

	public void setSD04(String sD04) {
		SD04 = sD04;
	}

	public String getSD05() {
		return SD05;
	}

	public void setSD05(String sD05) {
		SD05 = sD05;
	}

	public String getSD06() {
		return SD06;
	}

	public void setSD06(String sD06) {
		SD06 = sD06;
	}

	public String getSD07() {
		return SD07;
	}

	public void setSD07(String sD07) {
		SD07 = sD07;
	}

	public String getSD08() {
		return SD08;
	}

	public void setSD08(String sD08) {
		SD08 = sD08;
	}

	public String getSD09() {
		return SD09;
	}

	public void setSD09(String sD09) {
		SD09 = sD09;
	}

	public String getSD10() {
		return SD10;
	}

	public void setSD10(String sD10) {
		SD10 = sD10;
	}

	public String getSD11() {
		return SD11;
	}

	public void setSD11(String sD11) {
		SD11 = sD11;
	}

	public String getSD12() {
		return SD12;
	}

	public void setSD12(String sD12) {
		SD12 = sD12;
	}

	public String getSD13() {
		return SD13;
	}

	public void setSD13(String sD13) {
		SD13 = sD13;
	}

	public String getSDTO() {
		return SDTO;
	}

	public void setSDTO(String sDTO) {
		SDTO = sDTO;
	}

	public String getNTDA() {
		return NTDA;
	}

	public void setNTDA(String nTDA) {
		NTDA = nTDA;
	}

	public String getCDCV() {
		return CDCV;
	}

	public void setCDCV(String cDCV) {
		CDCV = cDCV;
	}

	public String getCDSC() {
		return CDSC;
	}

	public void setCDSC(String cDSC) {
		CDSC = cDSC;
	}

	public String getNBMA() {
		return NBMA;
	}

	public void setNBMA(String nBMA) {
		NBMA = nBMA;
	}

	public String getABRE() {
		return ABRE;
	}

	public void setABRE(String aBRE) {
		ABRE = aBRE;
	}

	public String getABR2() {
		return ABR2;
	}

	public void setABR2(String aBR2) {
		ABR2 = aBR2;
	}

	public String getCDMA() {
		return CDMA;
	}

	public void setCDMA(String cDMA) {
		CDMA = cDMA;
	}

	public String getNBGR() {
		return NBGR;
	}

	public void setNBGR(String nBGR) {
		NBGR = nBGR;
	}

	public String getNBTA() {
		return NBTA;
	}

	public void setNBTA(String nBTA) {
		NBTA = nBTA;
	}

	public String getORDT() {
		return ORDT;
	}

	public void setORDT(String oRDT) {
		ORDT = oRDT;
	}

	public String getCDTP() {
		return CDTP;
	}

	public void setCDTP(String cDTP) {
		CDTP = cDTP;
	}

	public String getNBPR() {
		return NBPR;
	}

	public void setNBPR(String nBPR) {
		NBPR = nBPR;
	}

	public String getLINE() {
		return LINE;
	}

	public void setLINE(String lINE) {
		LINE = lINE;
	}

	public String getNBLI() {
		return NBLI;
	}

	public void setNBLI(String nBLI) {
		NBLI = nBLI;
	}

	public String getNBAR() {
		return NBAR;
	}

	public void setNBAR(String nBAR) {
		NBAR = nBAR;
	}

	public String getPCOS() {
		return PCOS;
	}

	public void setPCOS(String pCOS) {
		PCOS = pCOS;
	}

	public String getPVPB() {
		return PVPB;
	}

	public void setPVPB(String pVPB) {
		PVPB = pVPB;
	}

	public String getPUNI() {
		return PUNI;
	}

	public void setPUNI(String pUNI) {
		PUNI = pUNI;
	}

	public String getPRIP() {
		return PRIP;
	}

	public void setPRIP(String pRIP) {
		PRIP = pRIP;
	}

	public String getPRIF() {
		return PRIF;
	}

	public void setPRIF(String pRIF) {
		PRIF = pRIF;
	}

	public String getFTDA() {
		return FTDA;
	}

	public void setFTDA(String fTDA) {
		FTDA = fTDA;
	}

	public String getNBCO() {
		return NBCO;
	}

	public void setNBCO(String nBCO) {
		NBCO = nBCO;
	}

	public String getCODC() {
		return CODC;
	}

	public void setCODC(String cODC) {
		CODC = cODC;
	}

	public String getNOMC() {
		return NOMC;
	}

	public void setNOMC(String nOMC) {
		NOMC = nOMC;
	}

	public String getCT01() {
		return CT01;
	}

	public void setCT01(String cT01) {
		CT01 = cT01;
	}

	public String getCT02() {
		return CT02;
	}

	public void setCT02(String cT02) {
		CT02 = cT02;
	}

	public String getCT03() {
		return CT03;
	}

	public void setCT03(String cT03) {
		CT03 = cT03;
	}

	public String getCT04() {
		return CT04;
	}

	public void setCT04(String cT04) {
		CT04 = cT04;
	}

	public String getCT05() {
		return CT05;
	}

	public void setCT05(String cT05) {
		CT05 = cT05;
	}

	public String getCT06() {
		return CT06;
	}

	public void setCT06(String cT06) {
		CT06 = cT06;
	}

	public String getCT07() {
		return CT07;
	}

	public void setCT07(String cT07) {
		CT07 = cT07;
	}

	public String getCT08() {
		return CT08;
	}

	public void setCT08(String cT08) {
		CT08 = cT08;
	}

	public String getCT09() {
		return CT09;
	}

	public void setCT09(String cT09) {
		CT09 = cT09;
	}

	public String getCT10() {
		return CT10;
	}

	public void setCT10(String cT10) {
		CT10 = cT10;
	}

	public String getCT11() {
		return CT11;
	}

	public void setCT11(String cT11) {
		CT11 = cT11;
	}

	public String getCT12() {
		return CT12;
	}

	public void setCT12(String cT12) {
		CT12 = cT12;
	}

	public String getCT13() {
		return CT13;
	}

	public void setCT13(String cT13) {
		CT13 = cT13;
	}

	public String getNBOR() {
		return NBOR;
	}

	public void setNBOR(String nBOR) {
		NBOR = nBOR;
	}

	public String getNMOP() {
		return NMOP;
	}

	public void setNMOP(String nMOP) {
		NMOP = nMOP;
	}

	public String getNBSC() {
		return NBSC;
	}

	public void setNBSC(String nBSC) {
		NBSC = nBSC;
	}

	public String getNBTP() {
		return NBTP;
	}

	public void setNBTP(String nBTP) {
		NBTP = nBTP;
	}

	public String getNBTE() {
		return NBTE;
	}

	public void setNBTE(String nBTE) {
		NBTE = nBTE;
	}

	public String getTIPT() {
		return TIPT;
	}

	public void setTIPT(String tIPT) {
		TIPT = tIPT;
	}

	public String getPERI() {
		return PERI;
	}

	public void setPERI(String pERI) {
		PERI = pERI;
	}

	public String getCUEL() {
		return CUEL;
	}

	public void setCUEL(String cUEL) {
		CUEL = cUEL;
	}

	public String getMANG() {
		return MANG;
	}

	public void setMANG(String mANG) {
		MANG = mANG;
	}

	public String getBOTA() {
		return BOTA;
	}

	public void setBOTA(String bOTA) {
		BOTA = bOTA;
	}

	public String getENTA() {
		return ENTA;
	}

	public void setENTA(String eNTA) {
		ENTA = eNTA;
	}

	public String getNBMO() {
		return NBMO;
	}

	public void setNBMO(String nBMO) {
		NBMO = nBMO;
	}

	public String getCTEM() {
		return CTEM;
	}

	public void setCTEM(String cTEM) {
		CTEM = cTEM;
	}

	public String getNTEM() {
		return NTEM;
	}

	public void setNTEM(String nTEM) {
		NTEM = nTEM;
	}

	public String getTEM2() {
		return TEM2;
	}

	public void setTEM2(String tEM2) {
		TEM2 = tEM2;
	}

	public String getTEM3() {
		return TEM3;
	}

	public void setTEM3(String tEM3) {
		TEM3 = tEM3;
	}

	public String getLETR() {
		return LETR;
	}

	public void setLETR(String lETR) {
		LETR = lETR;
	}

	public String getPRIM() {
		return PRIM;
	}

	public void setPRIM(String pRIM) {
		PRIM = pRIM;
	}

	public String getSEGU() {
		return SEGU;
	}

	public void setSEGU(String sEGU) {
		SEGU = sEGU;
	}

	public String getSALD() {
		return SALD;
	}

	public void setSALD(String sALD) {
		SALD = sALD;
	}

	public String getTERC() {
		return TERC;
	}

	public void setTERC(String tERC) {
		TERC = tERC;
	}

	public String getFALL() {
		return FALL;
	}

	public void setFALL(String fALL) {
		FALL = fALL;
	}

	public String getPUBL() {
		return PUBL;
	}

	public void setPUBL(String pUBL) {
		PUBL = pUBL;
	}

	public String getOUTL() {
		return OUTL;
	}

	public void setOUTL(String oUTL) {
		OUTL = oUTL;
	}

}
