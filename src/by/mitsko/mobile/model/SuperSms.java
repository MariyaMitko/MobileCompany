package by.mitsko.mobile.model;

public class SuperSms extends Tariff{
    private int freeSMScount;
    
	
    public SuperSms(String title, int cost, int period, int freeSMScount){
    	super (title, cost, period);
    	this.freeSMScount = freeSMScount;
    }
    
	public int getFreeSMScount() {
		return freeSMScount;
	}

	public void setFreeSMScount(int freeSMScount) {
		this.freeSMScount = freeSMScount;
	}

	@Override
	public void Show() {
		System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeSMScount());
	}

}
