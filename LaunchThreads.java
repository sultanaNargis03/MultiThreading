package thread;

public class LaunchThreads extends Thread
{
	LaunchThreads()
	{
		super();
	}
	
	LaunchThreads(String tname)
	{
		super(tname);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Thread started");// main
		
//		LaunchThreads thread1=new LaunchThreads();
//		
//		
//		LaunchThreads thread2=new LaunchThreads();
		
		LaunchThreads thread1=new LaunchThreads("MyThread1");
		
		
		LaunchThreads thread2=new LaunchThreads("MyThread2");
		
		thread1.start();//Thread-0
		thread2.start();//Thread-1
		

	}
	
	public void run()
	{
		System.out.println("Task for new Thread");
	}

}
