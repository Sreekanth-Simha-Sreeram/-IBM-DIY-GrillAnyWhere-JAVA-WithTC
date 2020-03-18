package com.grill.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.grill.models.GrillBer;
import com.grill.models.Renter;
@Component
public class RenterDaoImpl implements RenterDao {

	@Autowired
	SessionFactory sessionfactory;
	
	public boolean signUp(Renter renter) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean signIn(String renterName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean addGrill(GrillBer grillber) {
		// TODO Auto-generated method stub
		return false;
	}

	public GrillBer getGrillsById(int grillId) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean updateGrill(GrillBer grillBer) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteGrill(int grillId) {
		// TODO Auto-generated method stub
		return false;
	}

}
