package com.iu.s1.notice;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class NoticeDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.iu.s1.notice.NoticeDAO.";
	
	
	public int add(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.insert(NAMESPACE+"add", noticeDTO);
	}
	
	public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail", noticeDTO);
	}
	
	public List<NoticeDTO> list() throws Exception{
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	

}