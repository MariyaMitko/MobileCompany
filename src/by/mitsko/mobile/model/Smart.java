package by.mitsko.mobile.model;

public class Smart  extends Tariff{
	private int freeMinCount;
	private int minInOtherNetCost;
	private int smsInAllNetCost;
	private int freeTrafficCount;
	
	public Smart(String title, int cost, int period, int freeMinCount,  int minInOtherNetCost, int smsInAllNetCost, int freeTrafficCount){
		super (title, cost, period);
		this.freeMinCount = freeMinCount;
		this.minInOtherNetCost = minInOtherNetCost;
		this.smsInAllNetCost = smsInAllNetCost;
        this.freeTrafficCount = freeTrafficCount;
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

	public int getFreeTrafficCount() {
		return freeTrafficCount;
	}

	public void setFreeTrafficCount(int freeTrafficCount) {
		this.freeTrafficCount = freeTrafficCount;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeMinCount()+"free minutes in own net, " + ", cost of minute in other nets "+getMinInOtherNetCost()+"  kop., cost of sms "+getSmsInAllNetCost()+" kop. and " + getFreeTrafficCount()+" megabytes of free traffic" );
		
		
	}
}