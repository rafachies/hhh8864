package com.redhat.example.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CompositeKey implements Serializable{

	private static final long serialVersionUID = -274639747888913871L;

	@Column
	private String id1;
	@Column
	private String id2;
	@Column
	private String id3;

	public String getId1() {
		return id1;
	}



	public void setId1(String id1) {
		this.id1 = id1;
	}



	public String getId2() {
		return id2;
	}



	public void setId2(String id2) {
		this.id2 = id2;
	}



	public String getId3() {
		return id3;
	}



	public void setId3(String id3) {
		this.id3 = id3;
	}

	@Override
	public boolean equals(Object obj) {
		if (this instanceof CompositeKey) {
			CompositeKey other = (CompositeKey) obj;
			if (this == other) {
				return true;
			}
			if (this.id1 != other.id1 ) {
				return false;
			}
			if (this.id2 != other.id2 ) {
				return false;
			}
			if (this.id3 != other.id3 ) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
