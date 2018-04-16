package by.mitsko.mobile.model;

public class Standart extends Tariff{
	private int freeMinCount;
	private int minInOtherNetCost;
	private int smsInAllNetCost;
	
	public Standart(String title, int cost, int period, int freeMinCount,  int minInOtherNetCost, int smsInAllNetCost){
		super (title, cost, period);
		this.freeMinCount = freeMinCount;
		this.minInOtherNetCost = minInOtherNetCost;
		this.smsInAllNetCost = smsInAllNetCost;
	}
    public int getFreeMinCount() {
		return freeMinCount;
	}
    public void setFreeMinCount(int freeMinCount) {
		this.freeMinCount = freeMinCount;
	}
   
	public int getMinInOtherNetCost() {
		return minInOtherNetCost;
	}

	public void setMinInOtherNetCost(int minInOtherNetCost) {
		this.minInOtherNetCost = minInOtherNetCost;
	}

	public int getSmsInAllNetCost() {
		return smsInAllNetCost;
	}

	public void setSmsInAllNetCost(int smsInAllNetCost) {
		this.smsInAllNetCost = smsInAllNetCost;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeMinCount()+"free minutes in own net, " + ", cost of minute in other nets "+getMinInOtherNetCost()+" kop. and cost of sms "+getSmsInAllNetCost()+" kop." );
		
		
	}

}
