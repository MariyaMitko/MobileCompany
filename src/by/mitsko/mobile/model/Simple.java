package by.mitsko.mobile.model;

public class Simple extends Tariff {
	private int minInOwnNetCost;
	private int minInOtherNetCost;
	private int smsInAllNetCost;

	public Simple (String title, int cost, int period, int minInOwnNetCost, int minInOtherNetCost, int smsInAllNetCost){
		super (title, cost, period);
		this.minInOtherNetCost = minInOtherNetCost;
		this.minInOwnNetCost = minInOwnNetCost;
		this.smsInAllNetCost = smsInAllNetCost;
	}
    public int getMinInOwnNetCost() {
		return minInOwnNetCost;
	}
	public void setMinInOwnNetCost(int minInOwnNetCost) {
		this.minInOwnNetCost = minInOwnNetCost;
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
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ cost of minute in own net "+getMinInOwnNetCost()+" kop., cost of minute in other nets "+getMinInOtherNetCost()+" kop. and cost of sms "+getSmsInAllNetCost()+" kop." );
		
		
	}
  
}
