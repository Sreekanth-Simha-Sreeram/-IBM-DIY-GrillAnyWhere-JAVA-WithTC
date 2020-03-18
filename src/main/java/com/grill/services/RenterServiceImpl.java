package com.grill.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.grill.dao.RenterDao;
import com.grill.models.GrillBer;
import com.grill.models.Renter;
@Component
@Service("RenterService")
public class RenterServiceImpl implements RenterService {
	@Autowired
	RenterDao renterDao;
	
	@Transactional
	public boolean signUp(Renter renter) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean signIn(String renterName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean addGrill(GrillBer grillber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public GrillBer getGrillsById(int grillId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public boolean updateGrill(GrillBer grillBer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional
	public boolean deleteGrill(int grillId) {
		// TODO Auto-generated method stub
		return false;
	}

}
