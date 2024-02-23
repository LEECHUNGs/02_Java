package edu.kh.io.pack3.model.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import edu.kh.io.pack3.model.dto.Member;

public class ObjectService {
	
	/* ObjectInputStream / ObjectOutputStream
	 * 
	 * - Java 객체(Instance == Object)를 입/출력 시
	 *   사용하는 바이트 기반 '보조' 스트림
	 *   (보조 스트림은 단독 사용 불가능!!!)
	 *   
	 * *** 직렬화(Serializable) ***
	 * - 객체를 직접(직선) 형태로 변환
	 * */
	
	/**
	 * 객체를 외부 파일로 출력하기
	 */
	public void objectOutput() {
		
		// 스트림 참조 변수
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try{
			// .dat 확장자 : data를 담고 있는 파일을 나타내는 확장자
			fos = new FileOutputStream("/io_test/20240222/Member.dat");
			
			oos = new ObjectOutputStream(fos); // 객체 보조 스트림 생성
			
			Member member = new Member("member01", "pass01", "김회원", 30);
			
			// ObjectOutputStream 을 이용해 Member 객체 출력
			oos.writeObject(member); // 객체 출력
			
			System.out.println("회원 출력 완료");
			
			// [직렬화가 되지 않음]
			// java.io.NotSerializableException
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		finally {
			
			try{
				if(oos != null) oos.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 외부 파일로 부터 객체 입력 받기
	 */
	public void objectInput() {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			
			// 파일 입력 기반 스트림 생성
			fis = new FileInputStream("/io_test/20240222/Member.dat");
			
			// 객체 입력 보조 스트림
			ois = new ObjectInputStream(fis);
			
			// 스트림을 이용해 파일에 작성된 
			// 직렬화가 된 Member 객체를 읽어와
			// 역직렬화를 수행해 정상적인 Member 객체로 변경
			
			// Object ois.readObject() : 직렬화된 객체를 읽어와 역직렬화
									  // + Member 객체로 변경(DownCasting)
			
			Member m = (Member)ois.readObject();
			
			System.out.println(m);
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			try{
				if(ois != null) ois.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
