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
		//���� 
		//Ÿ�� �̸�[] or Ÿ��[] �̸� = new Ÿ��[�迭 ���� ũ��]
		int intArray[] = new int[10]; //�⺻���� int, long ���� ������ �Ҵ��ϴ� �ɷ� 0���� �ʱ�ȭ ��
		System.out.println(intArray[7]);
		//Object�� �迭�� 
		Item itemArray[] = new Item[10];
		int itemLength = itemArray.length;
		//���� �ڵ忡�� itemArray�� �����ϴ� ��찡 �߻��ϹǷ� �װ��� �����ϱ� ���� �ݺ��� �������� �迭�� ���̸� ���������� ���� �ʰԲ� JSP��� �Ծ࿡�� �ǰ���
		for(int i=0; i<itemLength; i++){
			itemArray[i] = new Item();
		
		}
		
		System.out.println(itemArray[7].getMyname());
	}
	
	//index�� �����ϴ� ���� ��ü�迭
	public void checkList(){
		ArrayList<Item> list = new ArrayList(); //List�����δ� ��ü�� ������ �� ����, Ŭ������ �ƴ϶� �������̽��̱� ����, ���谴ü�� ����ü�� ���� ����, �� List�� implementing�ϴ� Ŭ������ ���� ����
		
		//�Է�
		list.add(new Item()); // <-- 0�� Index�� ������ ��
		list.add(new Item()); // <-- 1�� Index�� ������ ��
		//��ȸ
		list.get(0); // <- index�� 0��°�� ���� ������
		
		//����
		list.set(1, new Item()); //<-- 1�� Index item�� ���� ������ item���� ��ü��
		list.add(1, new Item()); // <-- 1������ ������ item index�� �ϳ��� ������Ű�� ���ο� item�� 1���� ��
		
		//����
		list.remove(1); // <-- Ư�� ������ ����, ������ �����ۿ� ������� ä�쵵�� ������
	}
	
	public void checkGeneric(){
		// ���׸��� ����ϴ� ���
		// Ÿ��<���׸� Ÿ��> �����̸�        <- ���׸�Ÿ���� Ŭ������ ����, ������ �� ���� ����
		
		ArrayList arraylist = new ArrayList<>();
		
		arraylist.add(123);
		arraylist.add("hello");
		arraylist.add(new Item());
		
		
		//���׸��� ���� ������ ���� ������ ���Ⱑ ���� ����
		for(int i=0; i<arraylist.size(); i++){
			System.out.println(arraylist.get(i));
		}
	}
	
	//List�� �����ѵ� �ߺ����� ������� �ʴ� ���� ��ü �迭
	public void checkSet(){
		
		HashSet<String> set = new HashSet<>(); //Set���� interface�̹Ƿ� ����ü�� ���� ����, HashSet �Ǵ� TreeSet ���
		set.add("Hello");
		set.add("Good Bye");
		set.add("Hello");
		
		//set�� �������� ����� Iterator�� ����ϴ� ��, ���׸��� ����ϴ°� ����
		Iterator<String> iterator = set.iterator();
		
		for(;iterator.hasNext();){
			System.out.println(iterator.next());
			
		}
		
		//set�� �����ϴ°� �����
		
	}
	
	// Key, Value�� ������ ���� ��ü �迭
	public void checkMap(){
		
		// ����
		Map<String, String> map = new HashMap<>(); //Map ���� interface�� HashMap ���� ����ü�� ����ؾ� ��
		
		//�Է�
		map.put("Hey", "Jude");
		map.put("babo", "haha");
		map.put("Hello", "GoodBye");
		//��ȸ
		System.out.println(map.get("Hey"));
		
		//���� �ݺ������� ó���ϱ�
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.println(map.get(key));
		}
		
		
	}

}

class Item{
	private String myName = "����";
	
	public String getMyname(){
		return myName;
	}
}
