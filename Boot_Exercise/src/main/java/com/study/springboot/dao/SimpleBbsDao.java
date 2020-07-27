package com.study.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.study.springboot.dto.SimpleBbsDto;

@Repository
public class SimpleBbsDao implements ISimpleBbsDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<SimpleBbsDto> listDao() {
		System.out.println("listDao");
		List<SimpleBbsDto> list = jdbcTemplate.query(
				"select * from sample", new BeanPropertyRowMapper<SimpleBbsDto>(SimpleBbsDto.class));
		
		return list;
	}

	@Override
	public SimpleBbsDto viewDao(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int writeDao(String writer, String title, String content) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteDao(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
