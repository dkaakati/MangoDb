package mango.db;

import java.net.UnknownHostException;
import java.util.ArrayList;

import com.google.code.morphia.Datastore;
import com.google.code.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws UnknownHostException {
		Morphia morphia = new Morphia();
		Mongo mongo = new Mongo();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");

		// Personne 1
		/*
		 Person p = new Person(); p.setName("Tintin");
		 
		 Address address = new Address(); address.setStreet(
		 "123 rue Marguerite Yourcenar"); address.setCity("Rennes");
		 address.setPostCode("35 136"); address.setCountry("France"); // set
		 address p.setAddress(address); // Save the POJO ds.save(p);
		 
		 //Personne 2 Person p2 = new Person(); p2.setName("Tountoun");
		 
		 Address address2 = new Address(); address2.setStreet(
		 "9 chasse de la blanchisserie"); address2.setCity("Valognes");
		 address2.setPostCode("50 700"); address2.setCountry("France"); // set
		 address p2.setAddress(address2); // Save the POJO ds.save(p2);
		
		// Personne 3
		Person p3 = new Person();
		p3.setName("Tantan");

		Address address3 = new Address();
		address3.setStreet("2 rue des roseaux");
		address3.setCity("Vignoc");
		address3.setPostCode("35 630");
		address3.setCountry("France");
		// set address
		p3.setAddress(address3);
		// Save the POJO
		ds.save(p3);

		// Personne 3
		Person p4 = new Person();
		p4.setName("Tenten");
		// set address
		p4.setAddress(address3);
		// Save the POJO
		ds.save(p4);

		ArrayList<Person> ap = new ArrayList<Person>();
		ap.add(p3);
		Article article = new Article();
		article.setName("Livre");
		article.setStars(5);
		article.setBuyers(ap);
		ds.save(article);

		ArrayList<Person> ap2 = new ArrayList<Person>();
		ap2.add(p4);
		Article article2 = new Article();
		article2.setName("CD Black M");
		article2.setStars(1);
		article2.setBuyers(ap2);
		ds.save(article2);
	 	*/
		for (Person e : ds.find(Person.class)) {
			System.out.println("*****************Person*********************");
			System.out.println(e.getName());
			System.out.println(e.getAddress());
		}

		for (Article a : ds.find(Article.class)) {
			System.out.println("*****************Article*********************");
			System.out.println(a.getName());
			System.out.println(a.getBuyers());
		}
		

	}
}
