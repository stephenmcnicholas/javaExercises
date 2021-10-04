package alpha;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {


	private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());
	
	public static void main(String[] args) {
		
		//if no config file is provided, default is to log ERROR (or FATAL) messages only to the console
		log.debug("I am debugging"); 
				
		if(5>4)
		{
			log.error("Object is not present");
		}
		else 
		{
			log.fatal("This is fatal");
		}
		log.info("This is just info");
		
		
		// config file tells you 
		// a) where to log (Appenders tag: console and/or file)
		// b) what to log (Loggers tag: e.g. Root level="error" prints ONLY errors, "trace" prints entirety)
		// c) how to log (Appenders tag: PatternLayout as regex) 
		
		
		
		

	}

}
