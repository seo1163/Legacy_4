package com.iu.s1.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

@Service
public class NoticeService {
	
	@Autowired
	private NoticeDAO noticeDAO;
	
	
	public int add(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.add(noticeDTO);
	}
	
	public NoticeDTO detail(NoticeDTO noticeDTO)throws Exception{
		return noticeDAO.detail(noticeDTO);
	}
	
	public List<NoticeDTO> list (Pager pager)throws Exception{
		pager.makeRow();
		Long totalCount = noticeDAO.total();
		pager.makeNum(totalCount);
		List<NoticeDTO> ar = noticeDAO.list(pager);
		return ar;
	}
	public int delete (NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.delete(noticeDTO);
	}
	
	public int update (NoticeDTO noticeDTO) throws Exception{
		return noticeDAO.update(noticeDTO);
	}
	
}