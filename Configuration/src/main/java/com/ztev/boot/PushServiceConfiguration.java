package com.ztev.boot;

import com.ztev.api.ZTEVPushService;
import com.ztev.impl.ZTEVPushServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ${xiaozb} on 2017/6/21.
 *
 * @copyright by ztev
 */
@Configuration
public class PushServiceConfiguration {

	@Bean
	public ZTEVPushService pushService() {
		return new ZTEVPushServiceImpl();
	}
}
