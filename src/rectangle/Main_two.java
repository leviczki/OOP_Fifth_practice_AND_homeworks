package rectangle;

public class Main_two {
	public static void main(String[] args) {
		
		Rectangle[] arr = new Rectangle[10];
		
		for(int i = 0; i < 10; i++) {
			//(felsőhatár-alsóhatár+1)+alsóhatár
			int a = (int)(Math.random() * 9) + 2;
			int b = (int)(Math.random() * 9) + 2;
			
			//if(a != b)
				arr[i] = new Rectangle(a, b);
			/*else
				arr[i] = new Rectangle(a);*/
		}
		/////
		System.out.println("1) Összes téglalap: \n"+ arrInfo(arr));
		/////
		System.out.println("2) Legkisebb területű: "+ minArea(arr));
		/////
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("3) Kérem az a és b oldalt enterrel elválasztva.");
		
		Rectangle x = new Rectangle(input.nextInt(), input.nextInt());
		
		int count = 0;
		for(int i = 0; i < arr.length; i++)
			if(arr[i].getArea() < x.getArea())
				count++;
		
		System.out.println("3) Ettől kisebb téglalapok száma: "+count+" db.");
		
		/////
		String egyezo = "nincs egyező";
		
		for(int i = 0; i < arr.length && egyezo.equals("nincs egyező"); i++) {
			if(arr[i].getA() == x.getA())
				if(arr[i].getB() == x.getB())
					egyezo = ""+i;
		}
		
		System.out.println("4) Egyező oldalú indexe: "+egyezo+".");
		
		
		input.close();
	}
	
	public static String arrInfo(Rectangle[] arr) {
		String osszes = "";
		for(int i = 0; i < arr.length; i++) {
			osszes += "[" + i + "] " + arr[i].getInfo() + "\n";
		}
		return osszes;
	}
	
	public static String minArea(Rectangle[] arr) {
		int index = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i].getArea() < arr[index].getArea())
				index = i;
		}
		
		return arr[index].getInfo();
	}
	
}
