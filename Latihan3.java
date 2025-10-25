import java.util.Scanner;

public class Latihan3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Info Sekarang Tanggal");

		System.out.print("tanggal : ");
		int tanggal = input.nextInt();
		System.out.print("Bulan : ");
		int bulan = input.nextInt();
		System.out.print("Tahun : ");
		int tahun = input.nextInt();

		int tggLusa = tanggal + 2;
		int bLusa = bulan;
		int tLusa = tahun;
		String namaBulan = "";

		int jumlahHari = 0;
		switch(bulan){
		case 1:
			jumlahHari = 31;
			break;
		case 2:
			if (tahun % 4 == 0 && tahun %  100 !=0){
				jumlahHari = 29;
			}else if(tahun % 400 == 0 && tahun % 100 == 0){ 
				jumlahHari = 29;
			}else {
				jumlahHari = 28;
			}
			break;
		case 3:
			jumlahHari = 31;
			break;
		case 4:
			jumlahHari = 30;
			break;
		case 5:
			jumlahHari = 31;
			break;
		case 6:
			jumlahHari = 30;
			break;
		case 7:
			jumlahHari = 31;
			break;
		case 8:
			jumlahHari = 31;
			break;
		case 9:
			jumlahHari = 30;
			break;
		case 10:
			jumlahHari = 31;
			break;
		case 11:
			jumlahHari = 30;
			break;
		case 12:
			jumlahHari = 31;
			break;
		default:
			System.out.println("Bulan Tidak Valid Bang!!");

		}

	 	if(tggLusa > jumlahHari){
	 		tggLusa = tLusa - jumlahHari;
	 		bLusa = bLusa + 1;
	 	}if(bLusa > 12 && tggLusa > 0){
	 		bLusa = 1;
	 		tLusa = tLusa + 1;
	 		}
	 	switch (bLusa){
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
		default:
			System.out.print("Bulan Tidak Sahh!!");
	 	}
	 	System.out.println("Lusa Tanggal " + tggLusa + " " + namaBulan + " " + tLusa);


	}
}
