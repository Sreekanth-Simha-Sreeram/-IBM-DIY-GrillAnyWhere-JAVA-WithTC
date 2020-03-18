package com.grill.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GrillBer")
public class GrillBer {
	
	 @Id
	   @Column(name="grillId")
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
	int grillId;
	 
	 @Column(name="grillType")
	String grillType;
	 
	public int getGrillId() {
		return grillId;
	}
	public void setGrillId(int grillId) {
		this.grillId = grillId;
	}
	public String getGrillType() {
		return grillType;
	}
	public void setGrillType(String grillType) {
		this.grillType = grillType;
	}
}
