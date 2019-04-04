package Chapter02;

import java.util.HashSet;

import javax.xml.crypto.Data;

/*
 * ��ũ�帮��Ʈ ����
 * ����: http://egloos.zum.com/brogram/v/8969605
 */
public class SingleLinkedList {
	
	Node node;
	Node first;
	
	public SingleLinkedList() {
		super();
		first = null;
	}
	
	// �������� ��� �߰�
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
	
	// ���ϴ� data�� ��� ����
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
	
	// �߰��� ��� ����
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
	 * 2-1. �ߺ� ���ֱ�
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
	 * 2-1. �ߺ� ���ֱ�
	 * ���۰� ���� �� (Runner ������ ���)
	 */
	public void deleteDups2() {
		node = first;
		while(node != null) {
			Node runner = node;
			while(runner.next != null) {
				if(runner.next.data == node.data) {
					runner.next = runner.next.next;
				} else {
					runner = runner.next;
				}
			}
			node = node.next;
		}
	}
	
	/*
	 * 2-2. �ڿ��� k��° ���� ���ϱ�
	 * ����� ��� (���� ����ϴ� ���·� ����)
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
	 * 2-2. �ڿ��� k��° ���� ���ϱ�
	 * ����� ���(Wrapper Ŭ���� ����/�������� ����)
	 */
	public Node printKthToLast2(Node head, int k, int[] idx) {
		if(head == null) return null;
		
		System.out.println(idx[0]);
		Node node = printKthToLast2(head.next, k, idx);
		idx[0] = idx[0]+1;
		if(idx[0] == k) {
			return head;
		}
		return node;
	}
	
	/*
	 * 2-2. �ڿ��� k��° ���� ���ϱ�
	 * ��ȯ�� ���
	 */
	public Node PrintKthToLast3(Node node, int k) {
		
		Node priorRunner = first;
		for(int i=0; i<k; i++) {
			if(priorRunner == null) return null;
			priorRunner = priorRunner.next;
		}
		
		node = first;
		while(priorRunner.next != null) {
			priorRunner = priorRunner.next;
			node = node.next;
		}
		return node;
	}
	
	/*
	 * 2-3. �߰� ��� ����
	 */
	public boolean deleteMidNode(Node node) {
		if(node == null || node.next == null) return false;
		
		Node nextNode = node.next;
		node.next = nextNode.next;
		node.data = nextNode.data;
		
		return true;
	}
}
