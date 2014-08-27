package com.csaldivar.pruebas;

import java.io.File;

public class Pruebas {
	
	public static void main(String[] args) {
//		String 	cadena = "00006503_00029_20140814";
//		
//		System.out.println(cadena.substring(0, cadena.indexOf('_')));
		
		String pathArchivo = "C:/Users/Roberto/Documents/EJEMPLO-EXCEL-NOMINA.xlsx";
		
		File file = new File(pathArchivo);
		System.out.println(file.getParent().concat(File.separator).concat("otroarchivop.xls"));
		
	}

}
