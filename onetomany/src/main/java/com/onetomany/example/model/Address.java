package com.onetomany.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.transaction.Transactional;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Transactional
@NoArgsConstructor
@Table(name="address")
public class Address {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long addressId;
	private String city;
	private String addressType;
	
//	@OneToOne(mappedBy = "address")
//	private Employee employee;
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	public Address() {
		
	}
	public Address(long addressId, String city, String addressType) {
		this.addressId = addressId;
		this.city = city;
		this.addressType = addressType;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", addressType=" + addressType + "]";
	}
	
	
	
}
