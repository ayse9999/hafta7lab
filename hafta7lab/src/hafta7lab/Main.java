package hafta7lab;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   String  isim, soyisim;
		double saat,wage;
		long tc;
		Scanner input =new Scanner(System.in);
		System.out.println("adinizi giriniz");
	    isim = input.next();
	    System.out.println("soyisminizi giriniz");
	    soyisim = input.next();
	    System.out.println("tc'nizi giriniz");
	    tc = input.nextLong();
	    System.out.println(" kac saat :");
	    saat = input.nextDouble();
	    System.out.println("saatlik ucret:");
	    wage = input.nextDouble();
		HourlyEmployee e=new HourlyEmployee(isim,soyisim,tc,saat,wage);
		Employee p= new Employee(isim,soyisim,tc);
		System.out.println(e.write());
		
	}

}
