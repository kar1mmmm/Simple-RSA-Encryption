import java.util.Scanner;

public class HamdiProgramCouple{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int e = 7, n = 26;

        System.out.print("Masukkan teks: ");
        String plaintext = input.nextLine().toUpperCase().replaceAll("[^A-Z]", "");
        String ciphertext = "";

        for (char karakter : plaintext.toCharArray()) {
            int m = karakter - 'A';
            int c = (int) (Math.pow(m, e) % n);
            ciphertext += (char) (c + 'A');
        }

        System.out.println("Hasil Enkripsi: " + ciphertext);
        input.close();
    }
}