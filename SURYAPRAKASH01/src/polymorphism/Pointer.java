package polymorphism;

public class Pointer {
	private float x;
	private float y;

	public Pointer() {
		x = 0.0f;
		y = 0.0f;
	}

	public Pointer(float x) {
		this.x = x;
		this.y = x;
	}

	public Pointer(float x, float y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
