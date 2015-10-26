package org.goodnews.stevesun.sporadic.threadForFun;

/** This is a cool and small program to show that threads don't run in the order that you can control, it's all scheduled by the thing called
 * Thread Scheduler.*/

public class ThreadIsCool implements Runnable{

	public static void main(String [] args){
		ThreadIsCool threadIsCool = new ThreadIsCool();
		Thread jb = new Thread(threadIsCool);
		Thread cmt = new Thread(threadIsCool);
		Thread qwy = new Thread(threadIsCool);
		jb.setName("jiang bei");
		cmt.setName("cheng meng ting");
		qwy.setName("qiang wen yun");
		System.out.println("Now the three threads kick off:");
		jb.start();
		cmt.start();
		qwy.start();
		System.out.println("Program ended.");//even this one does NOT always end in the last step! Interesting!
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 5; i++){
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running!");
		}
	}
	
}
