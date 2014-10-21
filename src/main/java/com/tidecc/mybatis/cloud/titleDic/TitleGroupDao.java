package com.tidecc.mybatis.cloud.titleDic;

import java.util.List;
import java.util.Map;

import com.tidecc.mybatis.repository.MyBatisRepository;

/**
 * 抬头组的Dao
 * 
 * @author tidecc
 *
 */
@MyBatisRepository
public interface TitleGroupDao {
	
	TitleGroupEntity get(String oid);
	
	void save(TitleGroupEntity titleGroup);
	
	void delete(String oid);
	
	List<TitleGroupEntity> search(Map<String, Object> parameter);
	
	// TODO_TideCC: TitleGroup的Dao已经完成, 后续完成Service和Test测试.

}
