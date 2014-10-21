package com.tidecc.cloud.titleDic.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.tidecc.modules.test.SpringTransactionalTestCase;
import com.tidecc.mybatis.cloud.titleDic.TitleEntity;
import com.tidecc.mybatis.cloud.titleDic.TitleService;

/**
 * TitleServiceTest
 * 
 * @author tidecc
 *
 */
@ContextConfiguration("/applicationContext.xml")
public class TitleServiceTest extends SpringTransactionalTestCase {

	@Autowired
	TitleService titleService;
	
	public void getTitleByOIDTest() {
		
		titleService.getTitleByOID("abc");
	}
	
	
	
	@Test
	public void saveTitle(){
		TitleEntity title = new TitleEntity();
		title.setTitleName("开盘价");
		title.setTitleCode("KaiPanJia");
		title.setDecimalPlace(4);
		title.setOffsetPlace(0);
		title.setCurrencyID("RMB");
		
		titleService.saveTitle(title);
		
	}

}
