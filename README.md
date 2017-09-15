#Array, List, Set, Map 추가 정리

## Array 내용 추가
##### ListArray에는 String, Integer 등 기본형이 Wrapping 된 클래스뿐만 아니라 내가 만든 클래스도 넣을 수 있다. 예제를 보면
```java
public void checkArray(){

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
  class Item{
	private String myName = "지코";

	public String getMyname(){
		return myName;
	}
}
```

##### 새로 확인한 내용은 array를 객체 선언 할 경우 array의 크기만큼 0으로 초기화가 된다는 것
```java
//선언
//타입 이름[] or 타입[] 이름 = new 타입[배열 공간 크기]
int intArray[] = new int[10]; //기본형인 int, long 등은 공간만 할당하는 걸로 0으로 초기화 됨
```

## List 내용 추가
##### List의 set 함수는 해당 index를 대체해주는 역할
```java
list.set(1, new Item()); //<-- 1번 Index item이 새로 생성한 item으로 대체됨
```

## Set은 추가할 내용 없음

## Map 내용 추가

##### Map은 Key, Value로 구성되어 있음, put함수와 get함수로 찾고자 하는 데이터를 key로 찾을 수 있음, 예제에서는 Set에 Key값을 넣어 응용하였음

```java

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
```
