import java.util.Scanner;

public class Latihan1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("[0. Minggu, 1. Senin, 2. Selasa, 3. Rabu, 4. Kamis, 5. jumat, 6. Sabtu]");
		System.out.print("Sekarang adalah hari: ");
		int hari = sc.nextInt();

		switch (hari){
		case 0:
			System.out.println("lusa adalah hari selasa");
			break;
		case 1:
			System.out.println("Lusa adalah hari rabu");
			break;
		case 2:
			System.out.println("lusa adalah hari kamis");
			break;
		case 3:
			System.out.println("lusa adalah hari jumat");
			break;
		case 4:
			System.out.println("Lusa adalah hari Sabtu");
			break;
		case 5:
			System.out.println("Lusa adalah hari Minggu");
			break;
		case 6:
			System.out.println("Lusa adalah hari Senin");
			break;
		default:
			System.out.println("Tidak valid harinya bang!!");
		}


	}
}