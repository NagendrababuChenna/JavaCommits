package core.collection;

public class Box {
	
	private int width;
	private int hight;
	private int weight;
	
		
	
	public Box(int width, int hight, int weight) {
		this.width = width;
		this.hight = hight;
		this.weight = weight;
	}

	
	@Override
	public String toString() {
		return "Box [width=" + width + ", hight=" + hight + ", weight="
				+ weight + "]";
	}
	
	

}
