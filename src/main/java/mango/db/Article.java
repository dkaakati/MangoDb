package mango.db;

import java.util.ArrayList;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.*;

@Entity
public class Article {
	@Id
	private ObjectId id;
	private String name;
	private int stars;
	private ArrayList<Person> buyers;

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public String getBuyers() {
		String res = "";
		for (Person p : this.buyers) {
			res += p.toString()+"\n";
		}
		return res;
	}

	public void setBuyers(ArrayList<Person> buyers) {
		this.buyers = buyers;
	}

}
