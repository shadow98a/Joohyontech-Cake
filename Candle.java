
public class Candle extends Subject {
	public Candle(int x, int y, int width, int height) {
		components = new Drawable[2];

		components[0] = new Rectangle(x + width / 2, y, 1, 2, "6");
		components[1] = new Rectangle(x, y + 2, width, height - 2, "#");
	}
}
