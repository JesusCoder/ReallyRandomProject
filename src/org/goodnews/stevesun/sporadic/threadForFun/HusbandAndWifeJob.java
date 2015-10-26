package org.goodnews.stevesun.sporadic.threadForFun;

/**
 * @author jiahuan
 *
 */
public class HusbandAndWifeJob implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		for(int i = 0; i < 10; i++){
			makeWithdrawl(10);
			if(bankAccount.getBalance() < 0){
				System.out.println("Overdrawn!!!");	
			}
		}
	}

	private BankAccount bankAccount = new BankAccount();

	private synchronized void makeWithdrawl(int amount){
		if(bankAccount.getBalance() >= amount){
			System.out.println(Thread.currentThread().getName() + " is about to withdraw:");
			try {
				System.out.println(Thread.currentThread().getName() + " is going to sleep.");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " woke up.");
			bankAccount.withdraw(amount);
			System.out.println(Thread.currentThread().getName() + " finished withdrawl.");
		}
		else {
			System.out.println("Sorry, not enough balance for " + Thread.currentThread().getName());
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HusbandAndWifeJob husbandAndWifeJob = new HusbandAndWifeJob();
		Thread husband = new Thread(husbandAndWifeJob);
		Thread wife = new Thread(husbandAndWifeJob);
		husband.setName("Steve Sun");
		wife.setName("Steve's wife");
		husband.start();
		wife.start();
		System.out.println("Program ended.\n\n\n\n\n\n");
	}

}

class BankAccount{
	private int balance = 100;

	public int getBalance(){
		return balance;
	}

	public void withdraw(int withdrawAmount){
		balance = balance - withdrawAmount;
	}
}