package com.uni.section2.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


public class Client {
	public static void main(String[] args) {
	
		/*
		    *  클라이언트용 TCP 소켓 프로그래밍 순서
		    *  
		    *  1) 서버의 IP 주소와 서버가 정한 포트 번호를 매개변수로 하여 클라언트용 소켓 객체 생성
		    *  2) 서버와의 입출력 스트림 오픈
		    *  3) 보조 스트림을 통해 성능 개선
		    *  4) 스트림을 통해 읽고 쓰기
		    *  5) 통신 종료
		    */
		
		
		 // 1. 서버의 ip 주소와 서버가 정한 포트번호를 먼저 알아야함
		int port = 8500;
		
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			
			// 2. 서버의 ip 주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트 소켓 생성
			String serverIp = InetAddress.getLocalHost().getHostAddress();
			
			// 192.168.30.12
//			Socket socket = new Socket(serverIp, port);
			Socket socket = new Socket(serverIp, port);
			
			// 3. 서버와 입출력 오픈
			if(socket != null) {
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				
				do {
					System.out.println("대화 입력 : ");
					
					String msg = sc.nextLine();
					if(msg.equals("exit")) {
						System.out.println("대화를 종료합니다");
						break;
					}else {
						// 클라이언트 > 서버 메시지 전송
						pw.println(msg);
						pw.flush();
						
						// 서버 > 클라이언트 메시지 전송
						String reMsg = br.readLine();
						System.out.println(reMsg);
					}
					
				}while(true);
			}
			
			pw.close();
			br.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
		
		
	}
	
	
	
	
	
	
	
}














