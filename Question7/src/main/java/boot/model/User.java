package boot.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//entity anotasyonu veritabaninda tablo olusturulmasini saglar
@Entity(name="t_user")//veritabaninda olusacak tablonun ismi "t_user" 'dir
public class User implements Serializable{
	
	@Id// tablodaki user instance i icin id saglanmistir
	@GeneratedValue(strategy=GenerationType.AUTO)//id otamatik olarak bir bir artirilir.
	private int id;
	private String name;
	private String surname;
	private String address;

	
	public User(){}
	
	public User(String name, String surname, String address) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", surname=" + surname + ", address=" + address
				+  "]";
	}	
	
}
