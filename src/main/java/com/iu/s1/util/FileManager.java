package com.iu.s1.util;

import java.io.File;
import java.util.Calendar;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileManager {
	
	@Autowired
	private ServletContext servletContext;
	
	public String save(MultipartFile multipartFile, String path) throws Exception{
		//1. 어디에 저장 : 파일저장은 tomcat이 있는 폴에 저장
		//path=/resources/upload/member
		String realpath = servletContext.getRealPath(path);
		System.out.println(realpath);
		
		File file = new File(realpath);
		
		if(!file.exists()) {
			//file2.mkdir();//중간에 폴더가 없으면 에러
			file.mkdirs();//중간 폴더가 없으면 중간 폴더도 생성 
		}
		//1.시간
		Calendar ca = Calendar.getInstance();
		long l = ca.getTimeInMillis();//현재 시간을 밀리세컨즈로 변환
		System.out.println("time: "+l);
		String oriName = multipartFile.getOriginalFilename();//DOG1
		
		String fileName = l+"_"+oriName;
		System.out.println("fileName :"+fileName);
		
		//2. UUID
		fileName = UUID.randomUUID().toString();
		fileName = fileName+"_"+oriName;
		System.out.println("UUID : "+fileName);
		
		//file HDD에 저장
		//1) MutipartFile 클래스의 transferTo 메서드 사용
		
//		file = new File(realpath, fileName);
//		file = new File(file, fileName);
//		multipartFile.transferTo(file);
		
		//2. FileCopyUtils
		file = new File(file, fileName);
		FileCopyUtils.copy(multipartFile.getBytes(), file);
		
		return fileName;
	}

}
