import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka 1 - 999: ");
        int angka = input.nextInt();

        if (angka < 1 || angka > 999) {
            System.out.println("Angka di luar jangkauan!");
            return;
        }

        int ratusan = angka / 100;
        int sisa = angka % 100;
        int puluhan = sisa / 10;
        int satuan = sisa % 10;

        String tulisan = "";

      
        if (ratusan > 0) {
            switch (ratusan) {
                case 1: tulisan += "One Hundred";
                 break;
                case 2: tulisan += "Two Hundred";
                 break;
                case 3: tulisan += "Three Hundred";
                 break;
                case 4: tulisan += "Four Hundred";
                 break;
                case 5: tulisan += "Five Hundred";
                 break;
                case 6: tulisan += "Six Hundred";
                 break;
                case 7: tulisan += "Seven Hundred";
                 break;
                case 8: tulisan += "Eight Hundred";
                 break;
                case 9: tulisan += "Nine Hundred";
                 break;
            }
        }

     
        if (sisa > 0) {
            if (ratusan > 0) tulisan += " ";

            if (sisa < 10) {
                switch (sisa) {
                    case 1: tulisan += "One";
                     break;
                    case 2: tulisan += "Two";
                     break;
                    case 3: tulisan += "Three";
                     break;
                    case 4: tulisan += "Four";
                     break;
                    case 5: tulisan += "Five";
                     break;
                    case 6: tulisan += "Six";
                     break;
                    case 7: tulisan += "Seven"; 
                     break;
                    case 8: tulisan += "Eight";
                     break;
                    case 9: tulisan += "Nine";
                     break;
                }
            } else if (sisa < 20) {
                switch (sisa) {
                    case 10: tulisan += "Ten"; 
                    	break;
                    case 11: tulisan += "Eleven"; 
                    	break;
                    case 12: tulisan += "Twelve"; 
                    	break;
                    case 13: tulisan += "Thirteen"; 
                    	break;
                    case 14: tulisan += "Fourteen"; 
                    	break;
                    case 15: tulisan += "Fifteen"; 
                    	break;
                    case 16: tulisan += "Sixteen"; 
                    	break;
                    case 17: tulisan += "Seventeen"; 
                    	break;
                    case 18: tulisan += "Eighteen"; 
                    	break;
                    case 19: tulisan += "Nineteen"; 
                    	break;
                }
            } else {
                switch (puluhan) {
                    case 2: tulisan += "Twenty";
                    	break;
                    case 3: tulisan += "Thirty"; 
                    	break;
                    case 4: tulisan += "Forty"; 
                    	break;
                    case 5: tulisan += "Fifty"; 
                    	break;
                    case 6: tulisan += "Sixty"; 
                    	break;
                    case 7: tulisan += "Seventy"; 
                    	break;
                    case 8: tulisan += "Eighty"; 
                    	break;
                    case 9: tulisan += "Ninety"; 
                    	break;
                }

              
                if (satuan > 0) {
                    tulisan += " ";
                    switch (satuan) {
                        case 1: tulisan += "One"; 
                        break;
                        case 2: tulisan += "Two"; 
                        break;
                        case 3: tulisan += "Three"; 
                        break;
                        case 4: tulisan += "Four"; 
                        break;
                        case 5: tulisan += "Five"; 
                        break;
                        case 6: tulisan += "Six"; 
                        break;
                        case 7: tulisan += "Seven"; 
                        break;
                        case 8: tulisan += "Eight"; 
                        break;
                        case 9: tulisan += "Nine";
                        break;
                    }
                }
            }
        }

        System.out.println("Hasil konversi: " + tulisan);
    }
}

