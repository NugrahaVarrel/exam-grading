import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);
        int totalSiswa = 0;
        double totalNilaiSiswa = 0;

        while (true) {
            System.out.println("Masukkan nilai siswa : ");
            while (!input.hasNextInt()){
                System.out.println("Input harus berupa angka!");
                input.next();
            }
            int tempNilai = input.nextInt();

            if (tempNilai < 0){
                break;
            }

            totalNilaiSiswa += tempNilai;
            totalSiswa++;

        }

        double rataRataNilaiSiswa = totalNilaiSiswa / totalSiswa;

        char grade;
        if (rataRataNilaiSiswa >= 85){
            grade = 'A';
        } else if (rataRataNilaiSiswa >= 70) {
            grade = 'B';
        } else if (rataRataNilaiSiswa >= 55 ) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Total Nilai Siswa     : "+totalNilaiSiswa);
        System.out.println("Rata-rata nilai Siswa : "+rataRataNilaiSiswa);
        System.out.println("Grade                 : "+grade);
    }
}