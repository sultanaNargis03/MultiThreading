package thread;

public class LaunchThread2 implements Runnable
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LaunchThread2 tr=new LaunchThread2();
		
		Thread thread1=new Thread(new LaunchThread2());
		
		Thread thread2=new Thread(()->System.out.println("Task for Thread 2"));
		//New - Runnable - Running - Dead - Wait - sleep - blocked
//		Thread thread1=new Thread(tr);
//		Thread thread2=new Thread(tr);
		
		thread1.start();
		//thread1.start();
		thread2.start();
	}
	
	public void run()
	{
		System.out.println("Task defined for threads");
	}
	

}
