import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){this.data=data;}
}
class List{
	private Node first;

	public void add(int data){ //Insertion order
		addLast(data); //add(size(),data)
	}
	public void add(int index, int data){
		Node n1=new Node(data);
		if(index==0){
			n1.next=first;
			first=n1;
		}else{
			int count=0;
			Node temp=first;
			while(count<index-1){
				count++;
				temp=temp.next;
			}
			n1.next=temp.next;
			temp.next=n1;
		}
	}
	public void addLast(int data){
		add(size(),data);
	}
	public void addFirst(int data){
		add(0,data);		
	}
	public void removeLast(){
		remove(0);
	}
	public void removeFirst(){
		remove(size()-1);
	}
	public void remove(int index){
		if(!isEmpty() && index>=0 && index<size()){
			if(index==0){
				first=first.next;
			}else{
				int count=0;
				Node temp=first;
				while(count<index-1){
					count++;
					temp=temp.next;
				}
				temp.next=temp.next.next;
			}
		}
	}
	public int get(int index){
		//
		return -1;
	}
	public void printList(){
		System.out.print("[");
		Node temp=first;
		while(temp!=null){
			System.out.print(temp.data+", ");
			temp=temp.next;
		}
		System.out.println(isEmpty() ?"empty]":"\b\b]");
	}
	public int size(){
		Node temp=first;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	public boolean isEmpty(){
		return first==null;
	}
	public void clear(){
		first=null;
	}
	public int search(int data){
		Node temp=first;
		int index=0;
		while(temp!=null){
			if(temp.data==data){
				return index;
			}
			index++;
			temp=temp.next;
		}
		return -1;
	}
	public int[] toArray(){
		int[] tempDataArray=new int[size()];
		Node temp=first;
		for (int i = 0; i < tempDataArray.length; i++)	{
			tempDataArray[i]=temp.data;
			temp=temp.next;
		}
		return tempDataArray;
	}
}
class Demo{
	public static void main(String args[]){
		List intList=new List();
		intList.add(100); //add(data)-->Insertion order[Queue]
		intList.add(200);
		intList.add(300);
		intList.add(400);
		intList.add(500);
		intList.printList();//[100, 200, 300, 400, 500]
		
		intList.remove(2);
		intList.printList();//[100, 200, 400, 500]
		
		intList.remove(0);
		intList.printList();//[200, 400, 500]

		intList.remove(intList.size()-1);
		intList.printList();//[200, 400]
		
		intList.removeFirst();
		intList.printList();//[400]
		
		intList.removeLast();
		intList.printList();//[empty]
	}
}
