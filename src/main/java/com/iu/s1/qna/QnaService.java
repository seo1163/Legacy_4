package com.iu.s1.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

@Service
public class QnaService {
		//Controller -> Service -> DAO
		//DAO로 데이터를 보내기전에 전처리 작업
		//DAO에서 리턴받은 데이터를 Controller로 보내기전 후처리 작업
	
	@Autowired
	private QnaDAO qnaDAO;
	
	//list
	public List<QnaDTO>list(Pager pager) throws Exception{
		pager.makeRow();
		
		Long totalCount = qnaDAO.total(pager);
		pager.makeNum(totalCount);
		List<QnaDTO> ar = qnaDAO.list(pager);
		
		return ar;
	}
	
	//add
	public int add(QnaDTO qnaDTO) throws Exception{
		return qnaDAO.add(qnaDTO);
	}
	
	//detail
	public QnaDTO detail(QnaDTO qnaDTO) throws Exception{
		return qnaDAO.detail(qnaDTO);
	}
	
	//delete
	public int delete (QnaDTO qnaDTO) throws Exception{
		return qnaDAO.delete(qnaDTO);
	}
	
	//update
	public int update(QnaDTO qnaDTO) throws Exception{
		return qnaDAO.update(qnaDTO);
	}
}
