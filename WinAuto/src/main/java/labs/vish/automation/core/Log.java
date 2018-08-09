package labs.vish.automation.core;

import java.io.File;
import java.lang.reflect.Method;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.testng.ITestContext;

public class Log {
    
    public static Logger logger = LogManager.getLogger(Log.class.getName());    

    public static void logInitialize() {
        LoggerContext context = (LoggerContext) LogManager.getContext(false);
        File file = new File("src//test//Resources//log4j2.xml");    
        context.setConfigLocation(file.toURI());
    } 

    public static void startTestSuite(ITestContext testContext) {
        logInitialize();
        logger.info("\n");
        logger.info("-------------------------------------------------------------------------------");
        logger.info(" TEST SUITE : " + testContext.getCurrentXmlTest().getSuite().getName());
        logger.info("-------------------------------------------------------------------------------");
    }

    public static void endTestSuite() {
        logger.info("\n");
        logger.info("-------------------------------- TEST SUITE END --------------------------------");
    }

    public static void startTestCase(Method method) {
        logger.info("\n");
        logger.info("------------------------------------------------");
        logger.info(" TEST CASE : " + method.getName());
        logger.info("------------------------------------------------");
    }

    public static void endTestCase() {
        logger.info("\n");
        logger.info("------------------------------------------------");
    }

    public static void info(String message) {
        logger.info("> INFO: " + message);
    }

    public static void warn(String message) {
        logger.warn("> WARN: " + message);
    }

    public static void error(String message) {
        logger.error("> ERROR: " + message);
    }

    public static void fatal(String message) {
        logger.fatal("> FATAL: " + message);
    }

    public static void debug(String message) {
        logger.debug("> DEBUG: " + message);
    }

    public static void expected(String message) {
        logger.trace(">> EXPECTED : " + message);
    }

    public static void actual(String message) {
        logger.trace(">> ACTUAL : " + message);
    }

}