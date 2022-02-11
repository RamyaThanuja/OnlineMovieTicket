package movieticket;

import java.sql.Blob;

public class Movie {
	private int movie_id;
	private String movie_name;
	private int duration;
	private Blob image;
	public int getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	public Movie(int movie_id, String movie_name, int duration, Blob image) {
		super();
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.duration = duration;
		this.image = image;
	}
}
