package linkedList;
public class List {
	private String data;
	private List link;
	public List()
	{
		this.data = null;
		this.link = null;
	}
	public List(String data)
	{
		this.data = data;
		this.link = null;
	}
	public List(String data,List link)
	{
		this.data = data;
		this.link = link;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public List getLink() {
		return link;
	}
	public void setLink(List link) {
		this.link = link;
	}
}
