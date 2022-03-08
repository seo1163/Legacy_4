package com.iu.s1.notice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s1.JunitTest;
import com.iu.s1.board.notice.NoticeDAO;
import com.iu.s1.board.notice.NoticeDTO;
import com.iu.s1.util.Pager;

public class NoticeDATOTest extends JunitTest {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	//@Test
	public void check() {
		assertNotNull(noticeDAO);
	}
	//list
	@Test
	public void listTest() throws Exception{
		Pager pager = new Pager();
		pager.setPerPage(1L);
		pager.makeRow();
		List<NoticeDTO> ar = noticeDAO.list(pager);
		System.out.println(ar.get(0).getNum());
		System.out.println(ar.get(4).getNum());
		assertNotEquals(5,ar.size());
		
	}
	
	//insert
	//@Test
	public void addTest() throws Exception{
		for(int i=0; i<200;i++) {
			NoticeDTO noticeDTO = new NoticeDTO();
			noticeDTO.setWriter("writer"+i);
			noticeDTO.setContents("contents"+i);
			noticeDTO.setTitle("title"+i);
			
			int result = noticeDAO.add(noticeDTO);
		}
			System.out.println("Insert Finish");
	}

	//detail
	//@Test
	public void detailTest() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(3L);
		noticeDTO = noticeDAO.detail(noticeDTO);
		assertNotNull(noticeDTO);
	}
	//delete
	//@Test
	public void deleteTest() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(2L);
		int result = noticeDAO.delete(noticeDTO);
		assertEquals(1, result);
	}
}
