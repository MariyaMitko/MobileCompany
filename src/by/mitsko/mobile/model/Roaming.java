package by.mitsko.mobile.model;

public class Roaming  extends Tariff{
	private int minInRoamingCost;
	private int smsInRoamingCost;
	private int trafficRoamingCost;
	
	public Roaming (String title, int cost, int period, int minInRoamingCost, int smsInRoamingCost, int trafficRoamingCost){
		super (title, cost, period);
		this.minInRoamingCost = minInRoamingCost;
		this.smsInRoamingCost = smsInRoamingCost;
		this.trafficRoamingCost = trafficRoamingCost;
}
    
	public int getMinInRoamingCost() {
		return minInRoamingCost;
	}

	public void setMinInRoamingCost(int minInRoamingCost) {
		this.minInRoamingCost = minInRoamingCost;
	}
    public int getSmsInRoamingCost() {
		return smsInRoamingCost;
	}

	public void setSmsInRoamingCost(int smsInRoamingCost) {
		this.smsInRoamingCost = smsInRoamingCost;
	}

	public int getTrafficRoamingCost() {
		return trafficRoamingCost;
	}

	public void setTrafficRoamingCost(int trafficRoamingCost) {
		this.trafficRoamingCost = trafficRoamingCost;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ cost of minute in roaming"+getMinInRoamingCost()+" kop., cost of sms in roaming "+getSmsInRoamingCost()+" kop. ang cost of megabye in roaming "+ getTrafficRoamingCost()+" kop.");
	}
		
	}
