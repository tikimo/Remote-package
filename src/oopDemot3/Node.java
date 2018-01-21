package oopDemot3;

class Node<T>{
	private T item;
	private int id;
	//Node parent;
	Node<T> left;
	Node<T> right;
	
	public Node(T item, int id){
		this.item = item;
		this.id = id;
	}
	
	public Node(T item){
		this.item = item;
	}
	
	public T getItem(){
		return item;
	}
	
	public int getId(){
		return id;
	}
	
	/*public int getLevel(){
		int counter = 0;
		while(!parent.equals(root)){
			counter++;
		}
		return counter;
	}*/
}