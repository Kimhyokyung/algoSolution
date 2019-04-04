package Chapter02;

import java.util.HashSet;

import javax.xml.crypto.Data;

/*
 * 링크드리스트 구현
 * 참고: http://egloos.zum.com/brogram/v/8969605
 */
public class SingleLinkedList {
	
	Node node;
	Node first;
	
	public SingleLinkedList() {
		super();
		first = null;
	}
	
	// 마지막에 노드 추가
	public void add(int data) {
		if (first == null) {
			first = new Node(data, null);
			node = first;
		} else {
			while(node.next != null) {
				node = node.next;
			}
			Node newNode = new Node(data, null);
			node.next = newNode;
		}
	}
	
	// 원하는 data의 노드 삭제
	public void delete(int data) {
		node = first;
		if(node.data == data) {
			first = node.next;
		} else {
			while(true) {
				Node nextNode = node.next;
				if(nextNode.data == data) {
					node.next = nextNode.next;
					break;
				} else {
					if(nextNode.next == null) return;
					node = nextNode;
				}
			}
		}
	}
	
	// 중간에 노드 삽입
	public void insert(int insertData, int nextData) {
		node = first;
		if(node.data == nextData) {
			Node newNode = new Node(insertData, first);
			first = newNode;
		} else {
			while(true) {
				Node nextNode = node.next;
				if(nextNode.data == nextData) {
					Node newNode = new Node(insertData, nextNode);
					node.next = newNode;
					break;
				} else {
					if(nextNode.next == null) return;
					node = nextNode;
				}
			}
		}
	}
	
	public int search(int data) {
		int index = 0;
		node = first;
		while(true) {
			if(node.data == data) {
				break;
			} else {
				if(node.next == null) {
					return -1;
				} else {
					node = node.next;
					index++;
				}
			}
		}
		return index;
	}
	
	public String toString() {
		node = first;
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		while(true) {
			sb.append(node.data);
			if(node.next == null) break;
			sb.append(", ");
			node = node.next;
		}
		sb.append("]");
		
		return sb.toString();
	}
	
	/*
	 * 2-1. 중복 없애기
	 */
	public void deleteDups() {
		node = first;
		Node prevNode = null;
		HashSet<Integer> set = new HashSet<>();
		
		while(node != null) {
			if(!set.contains(node.data)) {
				set.add(node.data);
				prevNode = node;
			} else {
				prevNode.next = node.next;
			}
			node = node.next;
		}
	}
	
	/*
	 * 2-2. 뒤에서 k번째 원소 구하기
	 * 방법 A: 값을 출력하는 형태로 구현
	 */
	public int printKthToLast(Node node, int k) {
		if(node == null) return 0;
		
		int idx = printKthToLast(node.next, k)+1;
		if(idx == k) {
			System.out.println(k+"th to last node is " + node.data);
		}
		return idx;
	}
	
	/*
	 * 2-2. 뒤에서 k번째 원소 구하기
	 * 방법 B: 참조 사용
	 */
	/*public Node printKthToLast2(Node node, int k, int idx) {
		if(node == null) return null;
		
		int idx = printKthToLast(node.next, k, idx);
		
	}*/
	
	/*
	 * 2-3. 뒤에서 k번째 원소 구하기
	 * 방법 B: 참조 사용
	 */
}
