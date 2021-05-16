package ads.project236.dataStructures;

public class SingleLinkedListInt {
	
	private NodeInt head;
	public SingleLinkedListInt() 
	{
		this.head = null;
	}
	
	public boolean isEmpty() 
	{
		return this.head == null;
	}
	
	public int get(int index) 
	{
		NodeInt node = nodeAt(index);
		int value = node.value;
	return value;
	}
	
	private NodeInt nodeAt(int index) 
	{
		NodeInt current = this.head;
			for (int i = 0; i < index; i++) 
			{
				current = current.next;
	}
		return current;
	}
	
	public void add(int index, int e) 
	{
		if (index == 0) 
		{
			this.head = new NodeInt(e, this.head);
		} 
		else 
		{
			NodeInt pred = nodeAt(index - 1);
			pred.next = new NodeInt(e, pred.next);
		}
	}
	
	public int remove(int index)
	{
		NodeInt currnode = nodeAt(index);
		NodeInt prevnode = nodeAt(index - 1);
		prevnode.next = currnode.next;
		int temporary = currnode.value;
	    currnode = null;
	    return temporary;
	}
	
	public boolean contains(int element)
	{
		NodeInt node = this.head;
		
		while (node != null)
		{
			if (node.value == element)
			{
				return true;
			}
			node = node.next;
		}
		return false;
	}
	
}
