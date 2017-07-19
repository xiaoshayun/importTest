package com.ztev.boot;
import com.ztev.api.ZTEVPushService;
import com.ztev.impl.ZTEVPushServiceImpl;

public class ImportSelector {
	public ZTEVPushService pushService(String mode) {
		return new ZTEVPushServiceImpl();
	}
}
