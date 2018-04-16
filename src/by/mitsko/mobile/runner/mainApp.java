package by.mitsko.mobile.runner;

import by.mitsko.mobile.logic.Bonus;
import by.mitsko.mobile.logic.ClientManager;
import by.mitsko.mobile.logic.Manager;
import by.mitsko.mobile.model.Base;
import by.mitsko.mobile.model.Client;
import by.mitsko.mobile.model.CorporateClient;
import by.mitsko.mobile.model.IndividualClient;
import by.mitsko.mobile.model.Internet;
import by.mitsko.mobile.model.Simple;
import by.mitsko.mobile.model.Tariff;

public class mainApp {

	public static void main(String[] args) {
		Tariff base = new Base("Base", 3, 30, 20, 10);
        Tariff simple = new Simple ("Simple", 5, 30, 15, 20, 10);
        Tariff internet = new Internet ("Internet1000", 8, 30, 1000, 20);
        Tariff internet2 = new Internet ("InternetU", 5, 1, 10000, 20);
        Manager mn = new Manager("Ivan Petrov");
              
        mn.CreateTariffList(base);
        mn.CreateTariffList(simple);
        mn.CreateTariffList(internet);
        mn.CreateTariffList(internet2);
        mn.showInfoAbuttariffs();
        
        mn.TariffListSortByCost();
        mn.showInfoAbuttariffs();
        
        Bonus.ShowBonus(10);
        Bonus.ShowBonus(10, 20);
        
        Client cl1 = new IndividualClient ("Anna", "Gromova", "8975643", "Base");
        Client cl2 =  new IndividualClient ("Oleg", "Ivanov", "7448934", "Internet1000");
        Client cl3 = new CorporateClient("Olga", "Pomanova", "9005050", "Simple", "MobileCompany");
        ClientManager clmn = new ClientManager ("Irina Petrova");
        
        
        clmn.CreateClientList(cl1);
        clmn.CreateClientList(cl2);
        clmn.CreateClientList(cl3);
        clmn.ShowInfoAboutClients();
        
        mn.FindByCost();
	}

}
