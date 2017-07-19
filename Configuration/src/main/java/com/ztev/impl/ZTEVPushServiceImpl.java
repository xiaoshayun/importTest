package com.ztev.impl;

import com.ztev.api.ZTEVPushService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ${xiaozb} on 2017/6/21.
 *
 * @copyright by ztev
 */
public class ZTEVPushServiceImpl implements ZTEVPushService {
	Logger logger = LoggerFactory.getLogger("ZTEVPushServiceImpl");

	@Override
	public void pushMessage(String msg) {
		logger.info("push message: " + msg);
	}
}
