package co.edw.proyecto.ejb.business.ejb.interfac;


import java.util.List;

import javax.ejb.Local;
//import co.com.gco.tarjetas.conciliador.ejb.persistence.entities.TtarParametroSistema;

import co.edw.proyecto.persistence.Empleados;

/**
* ParametroSistemaManagerLocal
* @author edward.rodriguez@ingeneo.com.co
*/
@Local
public interface ParametroSistemaManagerLocal {
	
    
//    /**
//     * Metodo que consulta el valor de una parametro de la tabla parametros de sistema segun el codigo de parametro ingresado
//     * @author edward.rodriguez@ingeneo.com.co
//     * @param String cdparametro
//     * @return String
//     */  
//	public String consultarValorParametro(String cdparametro);
//	
//    /**
//     * Metodo que consulta un registro (Entidad) de la tabla parametros de sistema segun el codigo de parametro ingresado
//     * @author edward.rodriguez@ingeneo.com.co
//     * @param String cdparametro
//     * @return TtarParametroSistema
//     */  
//	public TtarParametroSistema consultarParametro(String cdparametro);

	  /**
	  * Metodo que consulta empleados segun el estado
	  * @author edward.rodriguez@ingeneo.com.co
	  * @param String estado
	  * @return List<Empleados>
	  */  
		public List<Empleados> consultarEmpleados (Integer estado);
    
}
