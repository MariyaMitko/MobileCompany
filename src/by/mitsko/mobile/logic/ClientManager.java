package by.mitsko.mobile.logic;

import by.mitsko.mobile.model.Client;
import by.mitsko.mobile.model.Tariff;

     public class ClientManager {
	    private String nameClMan;
	    private Client [] clients;
	    private int clientsCount;
	    
	    public ClientManager(String nameClMan){
			 this.nameClMan  = nameClMan;
	    }
	    
		public String getNameClMan() {
			return nameClMan;
		}
		public void setNameClMan(String nameClMan) {
			this.nameClMan = nameClMan;
		}
		public Client[] getClients() {
			return clients;
		}
		public void setClients(Client[] clients) {
			clients = clients;
		}
		public int getClientsCount() {
			return clientsCount;
		}
		public void setClientsCount(int clientsCount) {
			this.clientsCount = clientsCount;
		}
		public void CreateClientList(Client client) {
			if (this.clients != null) {
				if (clientsCount < clients.length) {
					addClient(client);
				} else {
					newClientList();
					addClient(client);
				}
			} else {
				clients = new Client[3];
				addClient(client);
			}
		}

		private void addClient(Client client) {
			clients[clientsCount] = client;
			clientsCount++;
		}

		public void newClientList() {
			Client[] client = new Client[this.clients.length + 1];
			for (int i = 0; i < this.clients.length; i++) {
				clients[i] = this.clients[i];
			}
		}
		public void ShowInfoAboutClients(){
			System.out.println("=============List of clients=============");
			System.out.println("Count of clients: "+getClientsCount());
			if (this.clients != null) {
				for (Client cl : clients) {
					cl.Show();
				}
			}
}
     }
