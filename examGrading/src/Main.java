//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        int [] nilaiSiswa = {85,70,60,90,65};
        int totalNilaiSiswa = 0;
        for (int i :nilaiSiswa) {
            totalNilaiSiswa += i;
        }

        double rataRataNilaiSiswa = totalNilaiSiswa / nilaiSiswa.length;
        System.out.println(+totalNilaiSiswa);
        System.out.println(+rataRataNilaiSiswa);

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

        System.out.println("Rata-rata nilai Siswa : "+rataRataNilaiSiswa);
        System.out.println("Grade : "+grade);
    }
}