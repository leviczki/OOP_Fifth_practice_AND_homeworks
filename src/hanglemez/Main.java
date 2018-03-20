package hanglemez;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Hány elemű legyen a hanglemez tömb?");
		Hanglemez[] HLArr = new Hanglemez[Integer.parseInt(input.nextLine())];
		
		for(int i = 0; i < HLArr.length; i++) {
			System.out.println("Kérem az előadót, a címet és a hosszt (perc) enterrel elválasztva.");
			HLArr[i] = new Hanglemez(input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine()));
		}
		
		System.out.println("Leghosszabb lemez: " + leghosszabbInfo(HLArr) );
		
		System.out.println("Adjon meg egy előadót és megmondom milyen lemezei vannak.");
		eloadoLemezei(HLArr, input.nextLine());
		
		input.close();
	}
	
	public static String leghosszabbInfo(Hanglemez[] x) {
		int index = 0;
		for(int i = 0; i < x.length; i++) {
			if(x[index].getHossz() < x[i].getHossz())
				index = i;
		}
		
		return x[index].getInfo();
	}
	
	public static void eloadoLemezei(Hanglemez[] x, String eloado) {
		for(int i = 0; i < x.length; i++) {
			if(x[i].eloadoEgyezes(eloado))
				System.out.println(x[i].getInfo());
		}
	}
}
