package org.diginamic.service;

import org.diginamic.App;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppService {
	private static final Logger LOG = LoggerFactory.getLogger(App.class);
   
	public void executer( String param )
    {
    	LOG.debug("Traitement 1 : param ={}", param);
    	
    }

}
