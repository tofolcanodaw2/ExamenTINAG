package aplicacion.modelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import aplicacion.controlador.Apsyved;
import aplicacion.controlador.Apted;
import aplicacion.controlador.Principal;
import aplicacion.controlador.rest.RestAccidentes;
import aplicacion.modelo.dao.MyBatisUtil;

/***
 * Pojo Singleton para loguear errores y otros mensajes
 * 
 * @author tofol
 *
 */
public class LogSingleton {
	private static final LogSingleton INSTANCE = new LogSingleton();
	private Logger loggerMyBatisUtil = LoggerFactory.getLogger(MyBatisUtil.class);
	private Logger loggerApted = LoggerFactory.getLogger(Apted.class);
	private Logger loggerApsyved = LoggerFactory.getLogger(Apsyved.class);
	private Logger loggerPrincipal = LoggerFactory.getLogger(Principal.class);
	private Logger loggerRestAccidentes = LoggerFactory.getLogger(RestAccidentes.class);

	private LogSingleton() {

	}

	public static LogSingleton getInstance() {
		return INSTANCE;
	}

	public Logger getLoggerMyBatisUtil() {
		return loggerMyBatisUtil;
	}

	public Logger getLoggerApted() {
		return loggerApted;
	}

	public Logger getLoggerApsyved() {
		return loggerApsyved;
	}

	public Logger getLoggerPrincipal() {
		return loggerPrincipal;
	}

	public Logger getLoggerRestAccidentes() {
		return loggerRestAccidentes;
	}

}
