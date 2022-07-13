package linkedList;
public class Stack {
	List top;
	Stack()
	{
		top=null;
	}
	
	public void push(String data)
	{
		List newList = new List(data);
		if(top==null)
		{
			top = newList;
		}
		else
		{
			top.setLink(newList);
			top = top.getLink();
		}
	}
	public void pop()
	{
		List prev;
		if(top.getData() == null)
		{
			System.out.println("empty");
		}
		else
		{
			prev = top;
			top = top.getLink();
			prev = null;
			System.gc();
		}
	}
	public void showList()
	{
		List head = top;
		while(head!=null)
		{
			System.out.println(head.getData()+" ");
			head = head.getLink();
		}
	}
}
