package projek;
	import java.util.Scanner;
	import java.util.Random;

	public class MathQuiz {

		public static void main(String args[]) {
			
			int question=1;
			int point=0;
			
			while(question<=10) {
			Scanner s = new Scanner(System.in);
			Random r = new Random();
			
			int i= r.nextInt(3);
			int a = r.nextInt(100);
			int b = r.nextInt(100); 
			
			int array[] = new int[4];
			array[0]=a+b;
			array[1]=a-b;
			array[2]=a*b;
			array[3]=a/b;
			
			String array_user[] = new String[4];
			array_user[0]="+";
			array_user[1]="-";
			array_user[2]="*";
			array_user[3]="/";
			
			System.out.println(question+") "+a +" " +array_user[i] +" "+ b + " = ");
			int user = s.nextInt();
			if (user==array[i]) {
				point+=10;
				System.out.println("true");
				System.out.println("point : "+point);
				System.out.println();
			}
			else {
				if(point>=10) {
					point-=10;
				}
				System.out.println("false");
				System.out.println("point : "+point);
				System.out.println("the true answers is "+array[i]);
				System.out.println();
			}
			question++;
		}
			if(point==100) {
			System.out.println("Anda mendapatkan nilai A+");
			}
			if(point==90) {
				System.out.println("Anda mendapatkan nilai A");
			}
			if(point>=80) {
				System.out.println("Anda mendapatkan nilai B");
			}
			if(point>=70) {
				System.out.println("Anda mendapatkan nilai C");
			}
			if(point<70) {
				System.out.println("Anda tidak naik kelas");
			}
		}
		
	}