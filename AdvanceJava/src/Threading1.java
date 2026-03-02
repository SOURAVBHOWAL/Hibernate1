import java.util.Scanner;

class D1 extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class D2 extends Thread{
	public void run() {
		for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}

class D3 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}

	class D4 implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=65;i<=75;i++) {
				System.out.println((char)i);
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		
		}
}
public class Threading1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("num1");
		int n1=sc.nextInt();
		Runnable r1=()->{for(int i=1;i<=10;i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			
		};
		Runnable r2=()->{for(int i=65;i<=75;i++) {
			System.out.println((char)i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			
		};
//		d1.start();
//		d2.start();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}
