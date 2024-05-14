package classes.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 30391
 */
public class LogInformation {

    public static final Logger LOGGER = LoggerFactory.getLogger("classes.Log.LogInformation");


    public static void main(String[] args) {
        LOGGER.info("这是main方法日志");

    }

    public static void run() {
        LOGGER.info("这是Run方法");
    }
}
