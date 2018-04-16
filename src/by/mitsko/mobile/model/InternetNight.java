package by.mitsko.mobile.model;

public class InternetNight extends Tariff{
	private int freeNightTrafficCount;
	private int otherTrafficCost;
	
	public InternetNight(String title, int cost, int period,  int freeNightTrafficCount, int otherTrafficCost ){
		super (title, cost, period);
		this.freeNightTrafficCount = freeNightTrafficCount;
		this.otherTrafficCost = otherTrafficCost;
}
    
	public int getFreeNightTrafficCount() {
		return freeNightTrafficCount;
	}

	public void setFreeNightTrafficCount(int freeNightTrafficCount) {
		this.freeNightTrafficCount = freeNightTrafficCount;
	}

	public int getOtherTrafficCost() {
		return otherTrafficCost;
	}

	public void setOtherTrafficCost(int otherTrafficCost) {
		this.otherTrafficCost = otherTrafficCost;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeNightTrafficCount()+" free megabytes for night period and other traffic for"+ getOtherTrafficCost()+"kop.");
		
		
	}

}
