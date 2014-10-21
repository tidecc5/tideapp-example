/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.tidecc.modules.test;

import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

/**
 * Spring的支持依赖注入的JUnit4 集成测试基类, 相比Spring原基类名字更短.
 * 
 * 子类需要定义applicationContext文件的位置,如:
 * 
 * @ContextConfiguration(locations = { "/applicationContext-test.xml" })
 * 
 * @author Tidecc
 */

/**
 * @ActiveProfiles，可以指定一个或者多个 profile，这样我们的测试类就仅仅加载这些名字的 profile对应的配置环境信息
 */
@ActiveProfiles(Profiles.UNIT_TEST)
public abstract class SpringContextTestCase extends AbstractJUnit4SpringContextTests {
}
