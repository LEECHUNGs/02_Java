package edu.kh.todoList.model.service;

import java.time.LocalDateTime;
import java.util.Map;

// Service : 
// 데이터 가공, 로직 처리 등의 기능을 제공하는 역할

public interface TodoListService {
	
	
	/** 할 일 목록 반환 서비스
	 * @return todoList + 완료된 개수
	 */
	Map<String, Object> todoListFullView();

	/** 날짜 포멧을 변환해서 반환
	 * @param regDate
	 * @return yyyy-mm-dd-hh:mm:ss 형태 날짜 반환
	 */
	String dateFormat(LocalDateTime regDate);

	/** 전달 받은 idex 번째 todo 반환
	 * @param index
	 * @return index번쨰 todo 상세 정보, 없으면 null 반환
	 */
	String todoDetailView(int index);

	/** 할 일 추가 서비스
	 * @param title
	 * @param content
	 * @return 추가된 inded 번호 or -1
	 */
	int todoAdd(String title, String content) throws Exception;

	/** 할 일 완료 여부 변경
	 * @param index
	 * @return 해당 index 요소의 완료 여부가 변경되면 true
	 * 		   index 요소가 없으면 false
	 */
	boolean todoComplete(int index) throws Exception;

	/** 할 일 수정 서비스
	 * @param index
	 * @param title
	 * @param string
	 * @return 수정 성공시 true, 실패 false
	 */
	boolean todoUpdate(int index, String title, String content) throws Exception;

	String todoDelete(int index) throws Exception;

}
