
public final class Rectangle extends Shape {
	public Rectangle(int x, int y, int width, int height, String texture) {
		super(x, y, width, height, texture);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isOnPoint(int x, int y) {
		// TODO Auto-generated method stub
		return (this.x <= x && x <= this.x + (width - 1)) && (this.y <= y && y <= this.y + (height - 1));
	}

}
