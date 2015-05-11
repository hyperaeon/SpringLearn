package com.spring.chapter3;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;

public class EncodedResourceExample {

	public static void main(String[] args)throws Throwable{
		Resource res = new ClassPathResource("files/file1.txt");
		EncodedResource enc = new EncodedResource(res, "utf-8");
		String content = FileCopyUtils.copyToString(enc.getReader());
		System.out.println(content);
	}
}
