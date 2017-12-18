package application;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class Filter implements java.util.logging.Filter {
	private static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	    public static void main(String[] args) {
	        LOGGER.setFilter(new Filter());
	        LOGGER.severe("This is SEVERE message");
	        LOGGER.warning("This is important warning message");
	    }
	    @Override
	    public boolean isLoggable(LogRecord record) {
	        if(record == null)
	            return false;
	        String message = record.getMessage()==null?"":record.getMessage();
	        if(message.contains("important"))
	            return true;
	        return false;
	    }


}
