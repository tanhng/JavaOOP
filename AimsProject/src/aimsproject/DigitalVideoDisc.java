package aimsproject;

public class DigitalVideoDisc {
	public String title;
	public String category;
	private String directory;
	private int length;
	private float cost;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDirectory() {
		return directory;
	}
	public void setDirectory(String directory) {
		this.directory = directory;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title, String category, String directory, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.directory = directory;
		this.length = length;
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title=title;
	}
	public DigitalVideoDisc(String title,String category) {
		this(title);
		this.category=category;
	}
	public DigitalVideoDisc(String title,String category,int length) {
		this(title,category);
		this.length=length;
	}
	public DigitalVideoDisc(String title,String category,int length, float cost) {
		this(title,category,length);
		this.cost=cost;
	}
}
