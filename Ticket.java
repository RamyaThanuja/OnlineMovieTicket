package movieticket;
public class Ticket {
private int show_id;
private int show_date;
private int ticket_no;
private int seat_no;
private double price;
public int getShow_id() {
	return show_id;
}
public void setShow_id(int show_id) {
	this.show_id = show_id;
}
public int getShow_date() {
	return show_date;
}
public void setShow_date(int show_date) {
	this.show_date = show_date;
}
public int getTicket_no() {
	return ticket_no;
}
public void setTicket_no(int ticket_no) {
	this.ticket_no = ticket_no;
}
public int getSeat_no() {
	return seat_no;
}
public void setSeat_no(int seat_no) {
	this.seat_no = seat_no;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public Ticket(int show_id, int show_date, int ticket_no, int seat_no, double price) {
	super();
	this.show_id = show_id;
	this.show_date = show_date;
	this.ticket_no = ticket_no;
	this.seat_no = seat_no;
	this.price = price;
}

}
