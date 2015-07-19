package flumeNG;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogProducer {

	public static void main(String[] args) throws Exception {
		while (true) {
			Logger logger = LoggerFactory.getLogger(LogProducer.class);
			logger.error("日志时间" + System.currentTimeMillis());
			TimeUnit.SECONDS.sleep(1);
		}
	}

}