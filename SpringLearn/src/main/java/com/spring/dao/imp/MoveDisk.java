package com.spring.dao.imp;

import com.spring.dao.Disk;

public class MoveDisk implements Disk {

	public void read() {
		System.out.println("��ȡ�ƶ�Ӳ��...");
	}

	public void write() {
		System.out.println("д���ƶ�Ӳ��...");
	}

}
