
public abstract class Shape implements Drawable {
	protected final int x;
	protected final int y;
	protected final int width;
	protected final int height;
	protected final String texture;

	public Shape(int x, int y, int width, int height, String texture) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.texture = texture;
	}

	protected abstract boolean isOnPoint(int x, int y);

	public final String DrawPoint(int x, int y) {
		return isOnPoint(x, y) ? texture : " ";
	}
}
