package testimport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ztev.api.ZTEVPushService;
import com.ztev.boot.EnableZTEVPushService;

@EnableZTEVPushService
@SpringBootApplication
public class ConfigurationTest implements CommandLineRunner{
	@Autowired
	ZTEVPushService zTEVPushService;
	public static void main(String[] args) {
		SpringApplication.run(ConfigurationTest.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		zTEVPushService.pushMessage("hehe");
	}
}
