package hust.soict.ictglobal.aims.media;

public class DigitalVideoDisc extends Media {
	private String directory;
	private int length;
	
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

	public DigitalVideoDisc(String title, String category) {
		super(title, category);
	}

	public DigitalVideoDisc(String title) {
		super(title);
	}
	
	public DigitalVideoDisc(String title,String category,int length) {
		this(title,category);
		this.length=length;
	}

	public boolean search(String title) {
		System.out.println(title);
		String[] wordsplit=title.split(" " );
		int count=0;
		for(String temp:wordsplit) {
			System.out.println(temp);
			if(this.getTitle().contains(temp)) {
				count++;
			}
			else break;
		}
		if (count==wordsplit.length) {
			return true;
		}
		return false;
	}
}
