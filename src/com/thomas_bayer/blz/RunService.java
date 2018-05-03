package com.thomas_bayer.blz;

public class RunService {

	public static void main(String[] args) {
		BLZService s = new BLZService();
		BLZServicePortType pt = s.getBLZServiceSOAP11PortHttp();
		
		DetailsType dt = pt.getBank("70070010");
		
		System.out.println(dt.getBezeichnung());
		System.out.println(dt.getBic());
		System.out.println(dt.getOrt());
		System.out.println(dt.getPlz());		
	}

}
