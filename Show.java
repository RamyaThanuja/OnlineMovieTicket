package movieticket;
public class Show {
private double show_time;
private String language;
private float start_time;
private int show_id;
public double getShow_time() {
	return show_time;
}
public void setShow_time(double show_time) {
	this.show_time = show_time;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public float getStart_time() {
	return start_time;
}
public void setStart_time(float start_time) {
	this.start_time = start_time;
}
public int getShow_id() {
	return show_id;
}
public void setShow_id(int show_id) {
	this.show_id = show_id;
}
public Show(double show_time, String language, float start_time, int show_id) {
	super();
	this.show_time = show_time;
	this.language = language;
	this.start_time = start_time;
	this.show_id = show_id;
}
}
