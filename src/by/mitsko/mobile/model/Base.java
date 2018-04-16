package by.mitsko.mobile.model;

public class Base extends Tariff{
	private int minInAllNetCost;
	private int smsInAllNetCost;
	
	public Base (String title, int cost, int period, int minInAllNetCost, int smsInAllNetCost){
		super (title, cost, period);
		this.minInAllNetCost = minInAllNetCost;
		this.smsInAllNetCost = smsInAllNetCost;
	}
	
	public int getMinInAllNetCost() {
		return minInAllNetCost;
	}

    public void setMinInAllNetCost(int minInAllNetCost) {
		this.minInAllNetCost = minInAllNetCost;
	}

	public int getSmsInAllNetCost() {
		return smsInAllNetCost;
	}

	public void setSmsInAllNetCost(int smsInAllNetCost) {
		this.smsInAllNetCost = smsInAllNetCost;
	}


	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ cost of minute "+getMinInAllNetCost()+"kop. and cost of sms "+getSmsInAllNetCost() +" kop." );
		
	}

}
