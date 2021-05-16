package ads.project236.dataStructures;

public class Stack <T> {
	
	@SuppressWarnings("rawtypes")
	private Node[] stackArr ;
	private int top;
	private T val;
	
	public Stack() 
	{
		this.stackArr = new Node[10];
		this.top = -1;
	}

	public boolean isEmpty() 
	{
		return this.top == -1;
	}
	
	
	public void push(T element)
	{
		Node<T> node = new Node<T>(element, null);
		this.stackArr [top + 1] = node;			
		this.top++;
	}
	
	@SuppressWarnings("unchecked")
	public T pop()
	{
		if(isEmpty())
		{
			return null;
		}
		this.val = (T) this.stackArr[this.top].value;
		this.stackArr[top] = null;
		this.top--;
		return this.val;
		
	}
	

}
