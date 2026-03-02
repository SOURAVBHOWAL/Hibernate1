
class Demo6 implements Runnable{
	int i=0;
	@Override
	 
	synchronized public void run() {
		for(int j=0;j<500;j++) {
			show();
//			try {
////				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		
		
	}

	private void show() {
		
		i++;
	}
	
}

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		Demo6 d1=new Demo6();
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d1);
//		t1.start();//async
		
//		Thread.sleep(900);
//		System.out.println(d1.i);//prints 0
		
		t1.start();
		t2.start();
		try {
			t1.join();
			// used to stop thread and synchronize code //sync
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(d1.i);//prints 500;

	}

}
