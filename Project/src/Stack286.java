
import java.util.*;
//design a Stack as wrapper yo Vector
public class Stack286 {
	private Vector<Integer> myVec;
	
	//default constructor 
	public Stack286() {
		myVec = new Vector<Integer>(100);
	}
	//constructor that accepts a size
	public Stack286(int size) {
		myVec = new Vector<Integer>(size);
	}
	//isEmpty() returns true if empty otherwise false
	public boolean isEmpty() {
		return myVec.isEmpty();
	}
	//isFull() returns true if full otherwise false 
	public boolean isFull() {
		if(myVec.size() == myVec.capacity())
			return true;
		return false;
	}
	//size retuen the number of elements
	public int size() {
		return myVec.size();
	}
	//push add an element to the end
	public void Push(int a) {
		myVec.add(a);//add adds an elements to the tail (top)
	}
	//Pop removes an element from the tail 
	public int Pop() {
		int temp = myVec.remove(myVec.size()-1);
		return temp;	
	}
	//seek or At returns the elements at an index without removing it
	public int Peek(int ind) {
		return myVec.elementAt(ind);
	}
}