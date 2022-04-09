
public final class Cake extends Subject {
	private static final int WIDTH_OF_CANDLE = 1;

	private final int x;
	private final int y;
	private final int width;
	private final int height;
	private final int numberOfCandles;
	private final int numberOfBreads;
	private final float widthOfTopBread;
	private final int heightOfLevel;

	public Cake(int x, int y, int width, int height, int numberOfCandles, int numberOfBreads) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.numberOfCandles = numberOfCandles;
		this.numberOfBreads = numberOfBreads;
		components = new Drawable[numberOfCandles + numberOfBreads];
		widthOfTopBread = (float) width / numberOfBreads;
		final boolean isCandleExists = numberOfCandles > 0;
		final boolean isBreadExists = numberOfBreads > 0;
		heightOfLevel = (int) ((height - ((!isCandleExists && isBreadExists ? ((float) width / 2) / 2 : 0)
				+ (isBreadExists ? ((float) width / 2) / 2 : 0))) / ((isCandleExists ? 1 : 0) + numberOfBreads));

		setCandles();
		setBreads();
	}

	private void setCandles() {
		final float distanceBetweenCandles = (widthOfTopBread - (numberOfCandles * WIDTH_OF_CANDLE))
				/ (numberOfCandles + 1);

		final int startOfTopBread = (width - (int) widthOfTopBread) / 2;
		for (int index = 0; index < numberOfCandles; index++) {
			components[index] = new Candle((int) (startOfTopBread + distanceBetweenCandles
					+ index * (WIDTH_OF_CANDLE + distanceBetweenCandles)), 0, WIDTH_OF_CANDLE, heightOfLevel);
		}
	}

	private void setBreads() {
		int widthOfCurrentBread;
		final boolean isCandleExists = numberOfCandles > 0;
		for (int index = 0; index < numberOfBreads; index++) {
			widthOfCurrentBread = (int) ((1 + index) * widthOfTopBread);
			components[numberOfCandles + index] = new Bread(x + ((width - widthOfCurrentBread) / 2),
					y + (isCandleExists ? heightOfLevel : (width / 2) / 2) + index * heightOfLevel, widthOfCurrentBread,
					heightOfLevel);
		}
	}
}