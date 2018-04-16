package by.mitsko.mobile.model;

public class MessagersPlus extends Tariff{
		private int freeTrafficForMesCount;
		private int otherTrafficCost;
		
		public MessagersPlus(String title, int cost, int period,  int freeTrafficForMesCount, int otherTrafficCost ){
			super (title, cost, period);
			this.freeTrafficForMesCount = freeTrafficForMesCount;
			this.otherTrafficCost = otherTrafficCost;
}
        
		public int getFreeTrafficForMesCount() {
			return freeTrafficForMesCount;
		}

		public void setFreeTrafficForMesCount(int freeTrafficForMesCount) {
			this.freeTrafficForMesCount = freeTrafficForMesCount;
		}

		public int getOtherTrafficCost() {
			return otherTrafficCost;
		}

		public void setOtherTrafficCost(int otherTrafficCost) {
			this.otherTrafficCost = otherTrafficCost;
		}

		@Override
		public void Show() {
			System.out.println("Tariff: "+getTitle()+" for "+getCost()+" roubles for "+getPeriod()+" days, includ "+getFreeTrafficForMesCount()+" free megabytes for messagers and other traffic for"+ getOtherTrafficCost()+"kop.");
			
		}
		}
