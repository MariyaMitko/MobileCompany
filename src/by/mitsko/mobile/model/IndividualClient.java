package by.mitsko.mobile.model;

public class IndividualClient implements Client{
    private String name;
    private String surname;
    private static String prefics = "+37521";
    private String phoneNumber;
    


	private String tariff;
    
    public IndividualClient(String name, String surname, String phoneNumber, String tariff){
  	   this.name = name;
  	   this.surname = surname;
  	   this.phoneNumber = phoneNumber;
  	   this.tariff = tariff;
    }
 	
    public String getTariff() {
		return tariff;
	}

    public static String getPrefics() {
		return prefics;
	}

	public static void setPrefics(String prefics) {
		IndividualClient.prefics = prefics;
	}
	public void setTariff(String tariff) {
		this.tariff = tariff;
	}


	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public void Show() {
		System.out.println(getName()+" "+getSurname()+", " +getPrefics().concat(getPhoneNumber())+ ", tariff: " + getTariff());
		
	}

}
