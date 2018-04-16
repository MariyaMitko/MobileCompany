package by.mitsko.mobile.model;

public class Super  extends Tariff{
	private int freeMinCount;
	private int freeSMSCount;
	private int minInOtherNetCost;
	private int smsInOtherNetCost;
	
	public Super(String title, int cost, int period, int freeMinCount,  int freeSMSCount, int minInOtherNetCost, int smsInOtherNetCost){
		super (title, cost, period);
		this.freeMinCount = freeMinCount;
		this.freeSMSCount = freeSMSCount;
		this.minInOtherNetCost = minInOtherNetCost;
		this.smsInOtherNetCost = smsInOtherNetCost;
	}
	
	public int getFreeMinCount() {
		return freeMinCount;
	}

	public void setFreeMinCount(int freeMinCount) {
		this.freeMinCount = freeMinCount;
	}

	public int getFreeSMSCount() {
		return freeSMSCount;
	}

	public void setFreeSMSCount(int freeSMSCount) {
		this.freeSMSCount = freeSMSCount;
	}

	public int getMinInOtherNetCost() {
		return minInOtherNetCost;
	}

	public void setMinInOtherNetCost(int minInOtherNetCost) {
		this.minInOtherNetCost = minInOtherNetCost;
	}

	public int getSmsInOtherNetCost() {
		return smsInOtherNetCost;
	}

	public void setSmsInOtherNetCost(int smsInOtherNetCost) {
		this.smsInOtherNetCost = smsInOtherNetCost;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeMinCount()+"free minutes in own net, " +getFreeSMSCount()+"free sms in own net, "+ ", cost of minute in other nets "+getMinInOtherNetCost()+" kop. and cost of sms "+getSmsInOtherNetCost()+" kop.");
		
		
		
	}

}
