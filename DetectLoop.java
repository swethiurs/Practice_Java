package practice;

import java.util.HashSet;
import java.util.LinkedList;

public class DetectLoop {
	
	static Node head;
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
	}
	
    static public void push(int new_data) {
    	Node new_node = new Node(new_data);
    	new_node.next = head;
    	head = new_node;
    }
    
    static boolean detect(Node h) {
    	HashSet<Node> s = new HashSet<Node>();
    	if(h!=null) {
    		if(s.contains(h))
    			return true;
    		
    		s.add(h);
    	}
    	return false;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedList llist = new LinkedList();
        
        
        llist.push(20);
        llist.push(5);
        llist.push(15);
        llist.push(30);
        
       // System.out.println(llist + " ");
       
        
        if(detect(head)) {
        	System.out.println("Loop detected");
        }
        
        else
        	System.out.println("No loop");
	}

}
