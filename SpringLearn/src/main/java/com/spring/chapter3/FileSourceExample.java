package com.spring.chapter3;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class FileSourceExample {

	public static void main(String[] args) {
		String filePath = "D:/Program/workspace-kepler/SpringLearn/src/main/resources/files/file1.txt";
		try {
			Resource res1 = new FileSystemResource(filePath);
			Resource res2 = new ClassPathResource("files/file1.txt");
			
			InputStream is1 = res1.getInputStream();
			InputStream is2 = res2.getInputStream();
			System.out.println("file1Name: " + res1.getFilename());
			System.out.println("file2Name: " + res2.getFilename());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
