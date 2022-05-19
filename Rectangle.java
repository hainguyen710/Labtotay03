package labTotayEx3;

public class Rectangle {
	private int width;
	private int height;

	public Rectangle() {
		this.width=5;
		this.height=3;
		
		
	}
	public Rectangle(int width,int height) {
		this.width=width;
		this.height=height;
		

	}
	
	public int getWidth() {
		return this.width;
		
	}
	public void setWidth(int value) {
          this.width=value;
	}
	public int getHeight() {
		return this.height;
	}
	public void setHeight(int value) {
		this.height=value;
	}
	public void display() {
		for(int i = 0 ; i < height; i++) {
			for(int j = 0 ; j<width; j ++) {
				System.out.println(j);
			}
			System.out.println(i);
		}			
		}
	
	public int getArea(int answer) {
	return	answer=width*height;
	}
	
	public int getPerimeter(int perimeter) {
		return perimeter=(width+height)*2;
	}
	
	}


