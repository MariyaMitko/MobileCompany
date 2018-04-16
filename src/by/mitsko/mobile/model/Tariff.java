package by.mitsko.mobile.model;

public abstract  class Tariff {
	 private String title;
     private int cost;
     private int period;
     
     public Tariff(String title, int cost, int period){
   	  this.title = title;
   	  this.cost = cost;
   	  this.period = period;
   	}

	 public String getTitle() {
		return title;
	}

	 public void setTitle(String title) {
		this.title = title;
	}

	 public int getCost() {
		return cost;
	}

	 public void setCost(int cost) {
		this.cost = cost;
	}

	 public int getPeriod() {
		return period;
	}
	
    public void setPeriod(int period) {
		this.period = period;
	}
    
    public abstract void Show();
     
}
