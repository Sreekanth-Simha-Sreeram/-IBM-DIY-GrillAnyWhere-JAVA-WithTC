package com.grill.dao;

import com.grill.models.GrillBer;
import com.grill.models.Renter;

public interface RenterDao {
	
	boolean signUp(Renter renter);
	boolean signIn(String renterName,String password);
	boolean addGrill(GrillBer grillber);
	GrillBer getGrillsById(int grillId);
	boolean updateGrill(GrillBer grillBer);
	boolean deleteGrill(int grillId);
}
