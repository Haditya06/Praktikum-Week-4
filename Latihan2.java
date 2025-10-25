import java.util.Scanner;

public class Latihan2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Opsi : [1. Januari, 2. Februari, 3. Maret, 4. April, 5. Mei, 6. Juni, 7. Juli, 8. Agustus, 9. September, 10. Oktober, 11. November, 12. Desember]");
		
		System.out.print("Bulan Sekarang     : ");		
		int bulanSekarang = input.nextInt();
		System.out.print("Tahun Sekarang     : ");
		int tahunSekarang = input.nextInt();
		System.out.print("Jumlah bulan target: ");
		int target = input.nextInt();

		int tb = bulanSekarang + target;
		int tt = tahunSekarang + (tb - 1)/12;
		int baru = (tb -1)%12+1;

		String namaBulan = "";
		switch (baru){
		case 1:
			namaBulan = "Januari";
			break;
		case 2:
			namaBulan = "Februari";
			break;
		case 3:
			namaBulan = "Maret";
			break;
		case 4:
			namaBulan = "April";
			break;
		case 5:
			namaBulan = "Mei";
			break;
		case 6:
			namaBulan = "Juni";
			break;
		case 7:
			namaBulan = "Juli";
			break;
		case 8:
			namaBulan = "Agustus";
			break;
		case 9:
			namaBulan = "September";
			break;
		case 10:
			namaBulan = "Oktober";
			break;
		case 11:
			namaBulan = "November";
			break;
		case 12:
			namaBulan = "Desember";
			break;

		}

		System.out.println("Sekarang adalah bulan ke-" + bulanSekarang + " tahun " + tahunSekarang);
		System.out.println(target + " bulan lagi adalah bulan " + namaBulan +" tahun " + tt);

	

	}
}