public abstract class Subject implements Drawable {
	protected Drawable[] components;

	public final String DrawPoint(int x, int y) {
		String texture = " ";
		for (Drawable component : components) {
			texture = component.DrawPoint(x, y);
			if (!texture.equals(" ")) {
				break;
			}
		}

		return texture;
	}
}
