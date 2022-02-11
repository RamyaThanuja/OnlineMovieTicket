package movieticket;
public class Seats {
private int no_of_seats;
private int seat_no;
private int seat_id;
public int getNo_of_seats() {
	return no_of_seats;
}
public void setNo_of_seats(int no_of_seats) {
	this.no_of_seats = no_of_seats;
}
public int getSeat_no() {
	return seat_no;
}
public void setSeat_no(int seat_no) {
	this.seat_no = seat_no;
}
public int getSeat_id() {
	return seat_id;
}
public void setSeat_id(int seat_id) {
	this.seat_id = seat_id;
}
public Seats(int no_of_seats, int seat_no, int seat_id) {
	super();
	this.no_of_seats = no_of_seats;
	this.seat_no = seat_no;
	this.seat_id = seat_id;
}

}
