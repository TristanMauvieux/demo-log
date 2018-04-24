package org.diginamic;

import org.diginamic.service.AppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
    	LOG.info("bonjour je suis le debut de l'application");
    	LOG.info("implémentation LOGBACK");
    	
    	new AppService().executer("valeur N1");
    }
}
