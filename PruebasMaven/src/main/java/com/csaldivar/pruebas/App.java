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
    	String reporteCompilado = "/home/clemente/reporte1.jasper";
    	Map<String, Object> parametros = new HashMap<String, Object>();
    	parametros.put("uno", "uno");
    	parametros.put("dos", "dos");
    	parametros.put("tres", "tres");
    	
		JasperReport reporte = (JasperReport) JRLoader.loadObject(reporteCompilado);
    	JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametros, new JREmptyDataSource());
    	JRExporter exporter = new JRPdfExporter();
    	exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
    	exporter.setParameter(JRExporterParameter.OUTPUT_FILE,  new File("/home/clemente/deivid.pdf"));
    	exporter.exportReport();
        System.out.println( "Exportado" );
    }
}
