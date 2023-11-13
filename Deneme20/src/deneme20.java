import java.util.Scanner;

public class deneme20 {

	public static void main(String[] args) {
		// Faiz Hesabı
		//Kullanıcıya faizle beraber ne kadar parası olacağı
		//bilgisini veren program
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bankamıza hoşgeldiniz. Faiz oranı: 0.06)");
		
			
		System.out.println("Vadeli hesabınıza yatırmak\n"
				+ "istediğiniz tutar:  ");
		double tutar = scanner.nextDouble();
		
		System.out.println("Kaç yıl vadeli hesabınızda tutacaksınız:");
		double yil = scanner.nextDouble();
		double faiz_Orani = 0.06;
		
		for(int i= 1 ; i<=yil; i++) {
		double toplam =(tutar*i*faiz_Orani)+tutar;
		System.out.println(i +". yıl sonunda paranız: "+ toplam);
		
		}
		
			
	scanner.close();

	}

}
