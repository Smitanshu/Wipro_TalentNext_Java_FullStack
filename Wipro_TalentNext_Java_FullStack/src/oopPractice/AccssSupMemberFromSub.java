package oopPractice;


class sup{
	int  money;
	private int pocketMoney;
	void fill(int money, int pocketMoney) {
		this.money=money;
		this.pocketMoney=pocketMoney;
	}
	public  int  getPocketMoney() {
		return pocketMoney;
	}
}
class sub extends sup{
	int total ;
	void sum() {
		total=money + getPocketMoney();
		System.out.println(" Total :"+ total);
		
	}
	
}

public class AccssSupMemberFromSub {

	public static void main(String[] args) {
		
		sub subObj1=new sub();
		subObj1.fill(10,20);
		subObj1.sum();
		
		
		
	}

}
