package com.iu.s1.qna;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.JunitTest;
import com.iu.s1.notice.NoticeDTO;
import com.iu.s1.util.Pager;

public class QnaDAOTest extends JunitTest{
	
	@Autowired
	private QnaDAO qnaDAO;
	
	//@Test
	public void check() {
		assertNotNull(qnaDAO);
	}
	
	//list
	@Test
	public void listTest() throws Exception{
		Pager pager = new Pager();
		pager.setPerPage(1L);
		pager.makeRow();
		List<QnaDTO> ar = qnaDAO.list(pager);
		System.out.println(ar.get(0).getNum());
		System.out.println(ar.get(4).getNum());
		assertNotEquals(5,ar.size());
	}

		//insert
		//@Test
		public void addTest() throws Exception{
			for(int i=0; i<200;i++) {
				QnaDTO qnaDTO = new QnaDTO();
				qnaDTO.setWriter("writer"+i);
				qnaDTO.setContents("contents"+i);
				qnaDTO.setTitle("title"+i);
				
				int result = qnaDAO.add(qnaDTO);
			}
				System.out.println("Insert Finish");
		}

		//detail
		//@Test
		public void detailTest() throws Exception{
			QnaDTO qnaDTO= new QnaDTO();
			qnaDTO.setNum(3L);
			qnaDTO = qnaDAO.detail(qnaDTO);
			assertNotNull(qnaDTO);
		}
		//delete
		//@Test
		public void deleteTest() throws Exception{
			QnaDTO qnaDTO = new QnaDTO();
			qnaDTO.setNum(2L);
			int result = qnaDAO.delete(qnaDTO);
			assertEquals(1, result);
		}

}
