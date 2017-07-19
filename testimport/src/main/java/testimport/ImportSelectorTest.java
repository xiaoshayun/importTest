package testimport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ztev.api.ZTEVPushService;
import com.ztev.boot.EnableImportSelector;

@EnableImportSelector(mode="大家好呀")
@SpringBootApplication
public class ImportSelectorTest implements CommandLineRunner{
	@Autowired
	ZTEVPushService zTEVPushService;
	public static void main(String[] args) {
		SpringApplication.run(ImportSelectorTest.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		zTEVPushService.pushMessage("hehe");
	}
}
