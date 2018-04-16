package by.mitsko.mobile.model;

public class CorporateClient extends IndividualClient{
	
    private String organization;
    
    
    public CorporateClient(String name, String surname, String phoneNumber,  String tariff, String organization){
    	super (name, surname, phoneNumber, tariff);
  	    this.organization = organization;
  	   
    }
         
	public String getOrganization() {
		return organization;
	}


	public void setOrganization(String organization) {
		this.organization = organization;
	}


	@Override
	public void Show() {
		System.out.println(getName()+" "+getSurname()+", " +getPhoneNumber() + ", tariff: " + getTariff()+ ", organization: "+getOrganization());
		
	}

}
