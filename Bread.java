
public class Bread extends Subject {
	public Bread(int x, int y, int width, int height) {
		components = new Drawable[3];

		components[0] = new Oval(x, y - ((width / 2) / 2), width, width / 2, ":");
		components[1] = new Rectangle(x, y, width, height, "|");
		components[2] = new Oval(x, y + (height - ((width / 2) / 2)), width, width / 2, "|");
	}

}
