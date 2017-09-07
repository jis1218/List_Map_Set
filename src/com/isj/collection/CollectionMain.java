package com.isj.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CollectionMain main = new CollectionMain();
		main.checkArray();
		
		main.checkGeneric();
		
		main.checkSet();
		
		main.checkMap();

	}
	
	public void checkArray(){
		//선언 
		//타입 이름[] or 타입[] 이름 = new 타입[배열 공간 크기]
		int intArray[] = new int[10]; //기본형인 int, long 등은 공간만 할당하는 걸로 0으로 초기화 됨
		System.out.println(intArray[7]);
		//Object형 배열은 
		Item itemArray[] = new Item[10];
		int itemLength = itemArray.length;
		//내부 코드에서 itemArray를 조작하는 경우가 발생하므로 그것을 방지하기 위해 반복문 내에서는 배열의 길이를 직접적으로 쓰지 않게끔 JSP라는 규약에서 권고함
		for(int i=0; i<itemLength; i++){
			itemArray[i] = new Item();
		
		}
		
		System.out.println(itemArray[7].getMyname());
	}
	
	//index를 포함하는 동적 객체배열
	public void checkList(){
		ArrayList<Item> list = new ArrayList(); //List만으로는 객체를 생성할 수 없음, 클래스가 아니라 인터페이스이기 때문, 설계객체는 구현체가 따로 있음, 즉 List를 implementing하는 클래스가 따로 있음
		
		//입력
		list.add(new Item()); // <-- 0번 Index로 생성이 됨
		list.add(new Item()); // <-- 1번 Index로 생성이 됨
		//조회
		list.get(0); // <- index가 0번째인 값을 가져옴
		
		//수정
		list.set(1, new Item()); //<-- 1번 Index item이 새로 생성한 item으로 대체됨
		list.add(1, new Item()); // <-- 1번부터 이후의 item index를 하나씩 증가시키고 새로운 item은 1번에 들어감
		
		//삭제
		list.remove(1); // <-- 특정 아이템 삭제, 삭제된 아이템엔 빈공간을 채우도록 땡겨짐
	}
	
	public void checkGeneric(){
		// 제네릭을 사용하는 방법
		// 타입<제네릭 타입> 변수이름        <- 제네릭타입은 클래스만 가능, 제한을 둘 수가 있음
		
		ArrayList arraylist = new ArrayList<>();
		
		arraylist.add(123);
		arraylist.add("hello");
		arraylist.add(new Item());
		
		
		//제네릭을 쓰지 않으면 향상된 포문을 쓰기가 쉽지 않음
		for(int i=0; i<arraylist.size(); i++){
			System.out.println(arraylist.get(i));
		}
	}
	
	//List와 유사한데 중복값을 허용하지 않는 동적 객체 배열
	public void checkSet(){
		
		HashSet<String> set = new HashSet<>(); //Set역시 interface이므로 구현체가 따로 있음, HashSet 또는 TreeSet 등등
		set.add("Hello");
		set.add("Good Bye");
		set.add("Hello");
		
		//set을 꺼내오는 방법은 Iterator를 사용하는 것, 제네릭을 사용하는게 좋음
		Iterator<String> iterator = set.iterator();
		
		for(;iterator.hasNext();){
			System.out.println(iterator.next());
			
		}
		
		//set은 삭제하는게 어려움
		
	}
	
	// Key, Value로 구성된 동적 객체 배열
	public void checkMap(){
		
		// 선언
		Map<String, String> map = new HashMap<>(); //Map 역시 interface라 HashMap 등의 구현체를 사용해야 함
		
		//입력
		map.put("Hey", "Jude");
		map.put("babo", "haha");
		map.put("Hello", "GoodBye");
		//조회
		System.out.println(map.get("Hey"));
		
		//맵을 반복문으로 처리하기
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.println(map.get(key));
		}
		
		
	}

}

class Item{
	private String myName = "지코";
	
	public String getMyname(){
		return myName;
	}
}
