package com.csaldivar.pruebas;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JRException
    {
    	
    	
    	String reporteCompilado = "C:/Users/Roberto/Documents/Magnabyte/workspace/orden-prod/ordenProdMayapack.jasper";
    	Map<String, Object> parametros = new HashMap<String, Object>();
    	 String[] anArray;

         anArray = new String[8];
         anArray[0] = "100";
         anArray[1] = "200";
         anArray[2] = "300";
         anArray[3] = "400";
         anArray[4] = "500";
         anArray[5] = "600";
         System.out.println("Tamaño del array " + anArray.length);
	     for (int h = 0; h < anArray.length; h++) {
	    	 if (anArray[h] != null){
	    		 parametros.put("PANT-FR".concat(String.valueOf(h+1)), anArray[h]);
	    	 } else {
	    		 parametros.put("PANT-FR".concat(String.valueOf(h+1)), "N/A");
	    	 }
	     }
    	parametros.put("uno", " PENDIENTE");
    	parametros.put("dos", "");
    	parametros.put("tres", "tres");
    	
		JasperReport reporte = (JasperReport) JRLoader.loadObject(reporteCompilado);
    	JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JREmptyDataSource());
    	JRExporter exporter = new JRPdfExporter();
    	exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
    	exporter.setParameter(JRExporterParameter.OUTPUT_FILE,  new File("C:/Users/Roberto/Documents/Magnabyte/workspace/orden-prod/ordenProdMayapack.pdf"));
    	exporter.exportReport();
        System.out.println( "Exportado" );
    }
}
