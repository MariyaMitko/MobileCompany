package by.mitsko.mobile.model;

public class InternetDay extends Tariff{
	private int freeDayTrafficCount;
	private int otherTrafficCost;
	
	public InternetDay(String title, int cost, int period,  int freeDayTrafficCount, int otherTrafficCost ){
		super (title, cost, period);
		this.freeDayTrafficCount = freeDayTrafficCount;
		this.otherTrafficCost = otherTrafficCost;
}


	public int getFreeDayTrafficCount() {
		return freeDayTrafficCount;
	}


	public void setFreeDayTrafficCount(int freeDayTrafficCount) {
		this.freeDayTrafficCount = freeDayTrafficCount;
	}


	public int getOtherTrafficCost() {
		return otherTrafficCost;
	}


	public void setOtherTrafficCost(int otherTrafficCost) {
		this.otherTrafficCost = otherTrafficCost;
	}


	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeDayTrafficCount()+" free megabytes for day period and other traffic for"+ getOtherTrafficCost()+"kop.");
		
	}	
	}