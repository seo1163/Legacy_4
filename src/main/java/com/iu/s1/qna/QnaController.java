package com.iu.s1.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.iu.s1.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {
	
	@Autowired
	private QnaService qnaService;
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public ModelAndView list(ModelAndView mv, Pager pager) throws Exception{
		List<QnaDTO> ar = qnaService.list(pager);
		mv.addObject("list",ar);
		mv.addObject("pager",pager);
		mv.setViewName("qna/list");
		
		return mv;
	}
	
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public void detail(QnaDTO qnaDTO, Model model) throws Exception{
		qnaDTO = qnaService.detail(qnaDTO);
		model.addAttribute("dto",qnaDTO);
	}
	
	//insert form 이동
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add()throws Exception{
		
	}
	
	//DB에 insert
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(QnaDTO qnaDTO) throws Exception{
		int result = qnaService.add(qnaDTO);
		
		return "redirect:./list";
	}
	
	//delete
	@RequestMapping(value = "delete")
	public String delete(QnaDTO qnaDTO) throws Exception{
		int result = qnaService.delete(qnaDTO);
		
		return "redirect:./list";
	}
	//update
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update(QnaDTO qnaDTO, Model model) throws Exception{
		System.out.println(qnaDTO.getNum());
		
		qnaDTO = qnaService.detail(qnaDTO);
		model.addAttribute("dto", qnaDTO);
	}
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(QnaDTO qnaDTO) throws Exception{
		int result = qnaService.update(qnaDTO);
		return "redirect:./list";
	}

}
