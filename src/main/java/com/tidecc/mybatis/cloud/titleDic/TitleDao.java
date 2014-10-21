package com.tidecc.mybatis.cloud.titleDic;


import java.util.List;
import java.util.Map;


import com.tidecc.mybatis.repository.MyBatisRepository;

/**
 * 抬头Dao
 * 
 * @author tidecc
 *
 */
@MyBatisRepository
public interface TitleDao {
	
	// TODO_TideCC 可以考虑用注解的方式, 直接在Service上集成Dao的各项功能, 这样更方便快输开发.
	
	TitleEntity get(String oid);
	
	void save(TitleEntity titleEntity);
	
	void delete(String oid);
	
	List<TitleEntity> search(Map<String, Object> parameters);
	

}
