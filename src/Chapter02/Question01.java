package Chapter02;

import java.util.*;

public class Question01 {
	
	static void deleteDups(LinkedList list) {
		
		Iterator<Node> m_iterator = list.iterator();
		
		
		
	}
	
	public static void main(String[] args) {
		
		SingleLinkedList list = new SingleLinkedList();
		list.add(2);
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		list.add(0);
		System.out.println(list.toString());
		
		// 2-1. �ߺ� ���ֱ�
		list.deleteDups();
		System.out.println(list.toString());
		
		// 2-2. �ڿ��� k���� ���� ���ϱ�
		list.printKthToLast(list.first, 3);
	}
}
