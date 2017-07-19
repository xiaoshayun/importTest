package com.ztev.boot;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Created by ${xiaozb} on 2017/6/21.
 *
 * @copyright by ztev
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(PushServiceConfiguration.class)
@Documented
public @interface EnableZTEVPushService {

}
