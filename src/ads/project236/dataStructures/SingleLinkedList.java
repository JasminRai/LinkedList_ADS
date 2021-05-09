package ads.project236.dataStructures;

public class SingleLinkedList<T> {
	
	private Node<T> head;
	
	public SingleLinkedList() 
	{
		this.head = null;
	}

	public boolean isEmpty() 
	{
		return this.head == null;
	}
	
	public T get(int index) 
	{
		Node<T> node = nodeAt(index);
		T value = node.value;
		return value;
	}

	private Node<T> nodeAt(int index) 
	{
		Node<T> current = this.head;
		for (int i = 0; i < index; i++) 
		{
			current = current.next;
		}

		return current;
	}
	
	public void add(int index, T value) 
	{
		
		
		if (index == 0 && isEmpty())
		{
			Node<T> node = new Node<T>(value, null);
			node.next = this.head;
			this.head = node;
		} 
		else if( index != 0)
		{
			Node<T> node = new Node<T>(value, null);
			Node<T> pred = nodeAt(index - 1);
//			if(pred == null)
//			{
//				pred = new Node<T> (value, node.next);
//			}
			node.next = pred.next;
			pred.next = node;
		}
	}
	
}
