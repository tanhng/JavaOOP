package hust.soict.ictglobal.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
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


	public DigitalVideoDisc(String title) {
		super(title);
	}
	

	public boolean search(String title)
	{
		int check = 0;
		String split_title[] = title.split(" ", 0);
            
		
		for(String ti: split_title)
		{
			if(this.getTitle().contains(ti))
			{
				check += 1;
			}
			else
			{
				break;
			}
		}
		
		if(check == split_title.length)
		{
			return true;
		}
		
		return false;
	}

	@Override
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		
	}
}
