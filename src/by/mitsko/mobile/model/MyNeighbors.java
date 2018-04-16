package by.mitsko.mobile.model;

public class MyNeighbors extends Tariff {
	private int minInMyRegionCost;
	private int smsInMyRegionCost;
	private int minInOtherRegionCost;
	private int smsInOtherRegionCost;
	
	public MyNeighbors(String title, int cost, int period, int minInMyRegionCost, int  smsInMyRegionCost, int minInOtherRegionCost, int smsInOtherRegionCost  ){
		super (title, cost, period);
		this.minInMyRegionCost = minInMyRegionCost;
		this.minInOtherRegionCost = minInOtherRegionCost;
		this.smsInMyRegionCost = smsInMyRegionCost;
		this.smsInOtherRegionCost = smsInOtherRegionCost;
	}
    
	public int getMinInMyRegionCost() {
		return minInMyRegionCost;
	}

	public void setMinInMyRegionCost(int minInMyRegionCost) {
		this.minInMyRegionCost = minInMyRegionCost;
	}

	public int getSmsInMyRegionCost() {
		return smsInMyRegionCost;
	}

	public void setSmsInMyRegionCost(int smsInMyRegionCost) {
		this.smsInMyRegionCost = smsInMyRegionCost;
	}

	public int getMinInOtherRegionCost() {
		return minInOtherRegionCost;
	}

	public void setMinInOtherRegionCost(int minInOtherRegionCost) {
		this.minInOtherRegionCost = minInOtherRegionCost;
	}

	public int getSmsInOtherRegionCost() {
		return smsInOtherRegionCost;
	}

	public void setSmsInOtherRegionCost(int smsInOtherRegionCost) {
		this.smsInOtherRegionCost = smsInOtherRegionCost;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ cost of minute in home region"+getMinInMyRegionCost()+" kop., cost of sms in home region"+getSmsInMyRegionCost()+" kop., cost of minute in other region"+getMinInOtherRegionCost()+" kop., cost of sms in other region"+getSmsInOtherRegionCost() + "kop.");
		
		
	}

}
