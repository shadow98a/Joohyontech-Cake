import java.util.Scanner;

public class Baker {
	private static final int HEIGHT_OF_CONSOLE=82;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("����ũ�� ���� �� �� �����ðھ��?");
		final int numberOfBreads = scanner.nextInt();
		System.out.println("����ũ�� �ʸ� �� �� �����ðھ��?");
		final int numberOfCandles = scanner.nextInt();
		scanner.close();
		scanner=null;

		Drawable cake = new Cake(0, 0, HEIGHT_OF_CONSOLE, HEIGHT_OF_CONSOLE, numberOfCandles, numberOfBreads);
		for (int y = 0; y < HEIGHT_OF_CONSOLE; y += 2) {
			for (int x = 0; x < HEIGHT_OF_CONSOLE; x++) {
				System.out.print(cake.DrawPoint(x, y));
			}
			System.out.println();
		}
		
		cake=null;
	}
}
