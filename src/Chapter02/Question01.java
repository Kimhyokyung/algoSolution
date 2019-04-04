package Chapter02;

import java.util.*;

import javax.sound.midi.MidiEvent;

public class Question01 {
	
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
		
		// 2-1. 중복 없애기
		//list.deleteDups();
		//list.deleteDups2();
		//System.out.println(list.toString());
		
		// 2-2. 뒤에서 k번쨰 원소 구하기
		list.printKthToLast(list.first, 3);
		
		/*
		int[] idx = new int[1];
		idx[0] = 0;
		Node node2 = list.printKthToLast2(list.first, 3, idx);
		System.out.println(node2.data);
		*/
		
		Node node3 = list.PrintKthToLast3(list.first, 3);
		System.out.println(node3.data);
		
		// 2-3. 중간 노드 삭제
		Node midNode = list.first;
		for(int i=0; i<2; i++) {
			midNode = midNode.next;
		}
		list.deleteMidNode(midNode);
		System.out.println(list);
		
	}
}
