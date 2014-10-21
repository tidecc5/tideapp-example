package com.tidecc.mybatis.cloud.titleDic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 抬头Service
 * 
 * @author tidecc
 *
 */
@Service
@Transactional
public class TitleService {
	
	@Autowired
	TitleDao titleDao;
	
	
	/**
	 * 基于oid 获取Title
	 * 
	 * @param oid
	 * @return
	 */
	public TitleEntity getTitleByOID(String oid){
		return titleDao.get(oid);
	}
	
	
	/**
	 * 保存Title
	 * 
	 * @param titleEntity
	 */
	public void saveTitle(TitleEntity titleEntity){
		titleDao.save(titleEntity);
	}

}
