/**
 * 
 */
package Other.XianJing;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Dahai
 * @Date 2015年10月6日
 * 日志粒度的控制
 */
public class BadLogger {
	private Logger m_log = null; 

    public BadLogger(Level l){
        ConsoleHandler ch = new ConsoleHandler();
        m_log = Logger.getLogger("no2.BadLogger.logger");
        m_log.addHandler(ch);
        m_log.setLevel(l); 
        m_log.setUseParentHandlers(false);
        ch.setLevel(l);
    }

    public void test(){                          
        System.out.println("The level for the log is: "+ m_log.getLevel());  
        m_log.finest("This is a test for finest");
        m_log.finer("This is a test for finer");
        m_log.fine("This is a test for fine");
        m_log.info("This is a test for info");
        m_log.warning("This is a warning test");
        m_log.severe("This is a severe test");
    }

    public static void main(String[] args){
        Level loglevel = Level.INFO;
        if ( args.length !=0 ){
            if ( args[0].equals("ALL") ){
                loglevel = Level.ALL;
            }
            else if ( args[0].equals("FINE") ){
                loglevel = Level.FINE;
            }
            else if ( args[0].equals("FINEST") ){
                loglevel = Level.FINEST;
            }
            else if ( args[0].equals("WARNING") ){
                loglevel = Level.WARNING;
            }
            else if ( args[0].equals("SEVERE") ) {
                loglevel = Level.SEVERE;
            }
        }
        BadLogger logex = new BadLogger(loglevel);
        logex.test(); 
    }
}
