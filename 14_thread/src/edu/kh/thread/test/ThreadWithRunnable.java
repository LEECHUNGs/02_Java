package edu.kh.thread.test;

// Runnable 인터페이스 상속받아 쓰레드 생성
public class ThreadWithRunnable implements Runnable{
	// Runnable 인터페이스를 사용하는 방법은
	// 클래스 상속의 제약을 피하고 (단일상속의 제약)
	// 코드 재사용성을 높일 수 있기떄문에 일반적으로 권장
	
	@Override
	public void run() {
		for(int i = 0; i<5; i++) {
			System.out.println("Thread : " + i);
			
			try {
				// InterruptedException : 자바에서 다중 쓰레드 프로그래밍 시 
									   // 발생할 수 있는 예외
				// 1초간 스레드를 멈추어 대기시키기 (ms)
				Thread.sleep(1000); 
				// sleep() : static 메서드이기 때문에 클래스명.메서드명() 으로 작성
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
