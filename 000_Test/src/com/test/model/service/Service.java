package com.test.model.service;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
	
	public void ex1() {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try{
			
			fos = new FileOutputStream("/io_test/20240222/바이트기반_테스트.txt");
			
			bos = new BufferedOutputStream(fos);
			
			String s = "shit";
			
			bos.write(s.getBytes());
			
			bos.flush();
			
			System.out.println("출력 완료");
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		finally{
			try{
				if(bos != null) bos.close();
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public void ex2() {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try{
			
			fis = new FileInputStream("/io_test/20240222/바이트기반_테스트.txt");
			bis = new BufferedInputStream(fis);
			
			byte[] bytes = bis.readAllBytes();
			
			String s = new String(bytes);
			
			System.out.println(s);
			
					
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void ex3() {
		BufferedReader br = null;
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try{
			br = new BufferedReader(new InputStreamReader(System.in));
			bis = new BufferedInputStream(
					new FileInputStream("/io_test/20240222/바이트기반_테스트.txt"));
			
			System.out.print("파일명");
			StringBuilder target = new StringBuilder("/io_test/20240222/");
			
			target.append(br.readLine());
			File file = new File(target.toString());
			
			if(!file.exists()) {
				System.out.println("없는 파일");
			}
			
					
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				if(bis != null) bis.close(); 
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
	
	public void serverService() {
		int port = 8500;
		
		ServerSocket serverSocket = null;
		Socket clientSocket = null;
		
		InputStream is = null;
		OutputStream os = null;
		
		BufferedReader br = null;
		
		PrintWriter pw = null;
		
		try {
			
			serverSocket = new ServerSocket(port);
			
			clientSocket = serverSocket.accept();
			
			System.out.println("클라이언트 접속 성공");
			
			is = clientSocket.getInputStream();
			os = clientSocket.getOutputStream();
			
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(os);
			
			pw.println("아오 페리시치");
			pw.flush();
			

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			
			try {
				if(serverSocket != null) serverSocket.close();
				if(clientSocket != null) clientSocket.close();
				if(br != null) br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
