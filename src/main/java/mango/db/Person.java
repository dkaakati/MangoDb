package mango.db;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.*;

@Entity
public class Person {
	@Id
	private ObjectId id;
	private String name;
	private Address address;

	
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

	public void setAddress(Address address) {
		this.address = address;
		
	}
	
	public String getAddress() {
		return this.address.toString();
		
	}
	
	public String toString(){
		return ("Person : " + this.name);
	}
	
	
}
