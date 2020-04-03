import java.util.Scanner;

public class InputOutput{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		String nama;
		int jumlahSks, nilai;
		double IPK;
		
		System.out.print("Masukkan nama anda: ");
		nama = scanner.nextLine();
		System.out.println("Hai, "+nama);
		
		System.out.print("Masukkan jumlah SKS yang sudah diambil: ");
		jumlahSks = scanner.nextInt();
		
		System.out.print("Masukkan Jumlah Nilai Semester ini: ");
		nilai = scanner.nextInt();
		
		IPK = nilai / jumlahSks;
		System.out.print("Nilai IP Anda Semester ini adalah: "+IPK);
	}
}