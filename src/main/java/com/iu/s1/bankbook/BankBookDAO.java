package com.iu.s1.bankbook;



import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.s1.util.Pager;

@Repository
public class BankBookDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.bankbook.BankBookDAO.";

	//update
	public int update(BankBookDTO bankBookDTO)throws Exception {
		return sqlSession.update(NAMESPACE+"update", bankBookDTO);
	}
	
	//detail
	public BankBookDTO detail(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail", bankBookDTO);
	}

	//total
	public Long total() throws Exception{
		return sqlSession.selectOne(NAMESPACE+"total");
	}
	
	//list
	public List<BankBookDTO> list(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"list", pager);
	}
	
	//insert
	public int add(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"add", bankBookDTO);
	}
	
	//delete
	public int delete(BankBookDTO bankBookDTO)throws Exception{
		return sqlSession.delete(NAMESPACE+"delete", bankBookDTO);
	}
	
}