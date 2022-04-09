
public final class Oval extends Shape {
	public Oval(int x, int y, int width, int height, String texture) {
		super(x, y, width, height, texture);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean isOnPoint(int x, int y) {
		// TODO Auto-generated method stub
		return ((float) ((x - (width / 2 + this.x)) * (x - (width / 2 + this.x))) / ((width / 2) * (width / 2)))
				+ ((float) ((y - (height / 2 + this.y)) * (y - (height / 2 + this.y)))
						/ ((height / 2) * (height / 2))) <= 1;
	}

}