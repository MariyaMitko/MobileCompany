package by.mitsko.mobile.model;

public class Internet extends Tariff{
	private int freeTrafficCount;
	private int otherTrafficCost;
	
	public Internet(String title, int cost, int period,  int freeTrafficCount, int otherTrafficCost ){
		super (title, cost, period);
		this.freeTrafficCount = freeTrafficCount;
		this.otherTrafficCost = otherTrafficCost;
	}
	
	public int getFreeTrafficCount() {
		return freeTrafficCount;
	}

	public void setFreeTrafficCount(int freeTrafficCount) {
		this.freeTrafficCount = freeTrafficCount;
	}

	public int getOtherTrafficCost() {
		return otherTrafficCost;
	}

	public void setOtherTrafficCost(int otherTrafficCost) {
		this.otherTrafficCost = otherTrafficCost;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeTrafficCount()+" free megabytes and other traffic for "+ getOtherTrafficCost()+" kop.");
		
	}
	

}
