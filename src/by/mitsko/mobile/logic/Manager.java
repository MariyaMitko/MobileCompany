package by.mitsko.mobile.logic;

import by.mitsko.mobile.model.Tariff;

public class Manager {
	private String nameMan;
	private  Tariff[] tariffs;
	private int tariffsCount;

	public Manager(String nameMan) {
		this.nameMan = nameMan;
	}

	public String getNameMan() {
		return nameMan;
	}

	public void setNameMan(String nameMan) {
		this.nameMan = nameMan;
	}

	public Tariff[] getTariffs() {
		return tariffs;
	}

	public void setTariffs(Tariff[] tariffs) {
		this.tariffs = tariffs;
	}

	public int getTariffsCount() {
		return tariffsCount;
	}

	public void setTariffsCount(int tariffsCount) {
		this.tariffsCount = tariffsCount;
	}

	public void CreateTariffList(Tariff tariff) {
		if (this.tariffs != null) {
			if (tariffsCount < tariffs.length) {
				addTariff(tariff);
			} else {
				newTariffList();
				addTariff(tariff);
			}
		} else {
			tariffs = new Tariff[4];
			addTariff(tariff);
		}
	}

	private void addTariff(Tariff tariff) {
		tariffs[tariffsCount] = tariff;
		tariffsCount++;
	}

	public void newTariffList() {
		Tariff[] tariffs = new Tariff[this.tariffs.length + 1];
		for (int i = 0; i < this.tariffs.length; i++) {
			tariffs[i] = this.tariffs[i];
		}
	}

	public  void showInfoAbuttariffs() {
		System.out.println("=============List of tariffs=============");
		if (this.tariffs != null) {
			for (Tariff tf : tariffs) {
				tf.Show();
			}
		}
	}

	public void TariffListSortByCost() {
		for (int i = this.tariffs.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tariffs[j].getCost() > tariffs[j + 1].getCost()) {
					Tariff tmp = tariffs[j];
					tariffs[j] = tariffs[j + 1];
					tariffs[j + 1] = tmp;
				}
			}
		}
	}
     public void FindByCost(){
    	 System.out.println("=============Selection of tariffs=============");
    	 for (int i = 0; i < this.tariffs.length; i++) {
 				if(tariffs[i].getCost()>4 && tariffs[i].getCost()<7){
 				System.out.println(tariffs[i].getTitle());
 			}
     }
}
}