package abstracts;

public class Three extends One{
	private float width, height;

	public Three() {
		this.width = 5.0f;
		this.height = 2.0f;
	}

	public Three(float width, float height) {
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		area=width*height;		
	}

}
