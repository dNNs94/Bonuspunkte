
public class SwitchCase {

	public static void main(String[] args) {
		
		int monat = 5; // Mai als Beispiel
		String jahreszeit = "";
		switch(monat)
		{
		case 1: case 2: case 12: // 1, 2, 12 Winter
		{
			jahreszeit = "Winter";
			break;
		}
		case 3: case 4: case 5: // 3, 4, 5 Frühling
		{
			jahreszeit = "Frühling";
			break;
		}
		case 6: case 7: case 8: // 6, 7, 8 Sommer
		{
			jahreszeit = "Sommer";
			break;
		}
		case 9: case 10: case 11: // 9, 10, 11 Herbst
		{
			jahreszeit = "Herbst";
			break;
		}
		
		default:
			jahreszeit = "unbekannter Monat";
		
		}

		System.out.println("Im Monat " + monat + " ist " + jahreszeit);
		
	}

}
