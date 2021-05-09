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
		Node<T> node = new Node<T>(value, null);
		
		if (index == 0 && isEmpty())
		{
			node.next = this.head;
			this.head = node;
		} 
		else if( index != 0)
		{
			Node<T> pred = nodeAt(index - 1);

			node.next = pred.next;
			pred.next = node;
		}
	}
	
}
