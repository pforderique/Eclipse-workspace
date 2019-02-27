package ticketPractice;

public class Transactions {
	private int numOfTickets;
	Ticket[] ticketList;
	
	public Transactions(int numOfTickets) {
		this.numOfTickets = numOfTickets;
		ticketList = new Ticket[this.numOfTickets];
		fillTicketList();
	}
	private void fillTicketList() {
		for(int i = 0; i < numOfTickets;i++) {
			ticketList[i] = new Ticket("n/a",i+1,(i+1)*10);
		}
	}
	private void fillTicketList(double price) {
		for(int i = 0; i < numOfTickets;i++) {
			ticketList[i] = new Ticket("n/a",i+(int)price,(i+price)*10);
		}
	}
}
