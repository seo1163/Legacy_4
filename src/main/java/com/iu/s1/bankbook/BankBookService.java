package com.iu.s1.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.s1.util.Pager;

@Service
public class BankBookService {
	//Controller -> Service -> DAO
	//DAO로 데이터를 보내기전에 전처리 작업
	//DAO에서 리턴받은 데이터를 Controller로 보내기전 후처리 작업
	
	@Autowired
	private BankBookDAO bankBookDAO;
	
	//Update
	public int update(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.update(bankBookDTO);
	}
	
	//메서드는 DAO의 메서드와 거의 동일
	//delete
	public int delete (BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.delete(bankBookDTO);
	}
	
	//add
	public int add(BankBookDTO bankBookDTO)throws Exception{
		return bankBookDAO.add(bankBookDTO);
	}
	
	
	//detail
	public BankBookDTO detail(BankBookDTO bankBookDTO)throws Exception{
		
		return bankBookDAO.detail(bankBookDTO);
	}
	
	//list
	public List<BankBookDTO> list(Pager pager)throws Exception{
		
		//DAO 메서 호출 전 전처리 작업
		pager.makeRow();
		
		Long totalCount = bankBookDAO.total();
		pager.makeNum(totalCount);
		//호출 후 후처리 작업
		List<BankBookDTO> ar = bankBookDAO.list(pager);
		
		return ar;
	} 

}