package com.grill.test;

import static org.junit.Assert.assertEquals;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.grill.models.AddOn;
import com.grill.models.GrillBer;
import com.grill.models.User;
import com.grill.services.RenterService;
import com.grill.services.UserService;



public class TestFunctional {
	@Test
	public void testGetGrillsById() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("grill-application.xml");
	GrillBer grillBer=new GrillBer();
grillBer.setGrillId(12);
grillBer.setGrillType("charcoal grill");
	
	RenterService renterservice=(RenterService) context.getBean("RenterService");
	GrillBer  getGrillsfromdb =renterservice.getGrillsById(grillBer.getGrillId());
	assertEquals(1,getGrillsfromdb);
}
	
	@Test
	public void testDeleteGrill() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("grill-application.xml");
		GrillBer grillBer=new GrillBer();
		grillBer.setGrillId(12);
		grillBer.setGrillType("charcoal grill");
		RenterService renterservice=(RenterService) context.getBean("RenterService");
	boolean deletedGrillsfromdb =renterservice.deleteGrill(grillBer.getGrillId());
	assertEquals(1,deletedGrillsfromdb);
	}
	
	@Test
	public void testUpdateGrill() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("grill-application.xml");
		GrillBer grillBer=new GrillBer();
		grillBer.setGrillId(12);
		grillBer.setGrillType("charcoal grill");
		RenterService renterservice=(RenterService) context.getBean("RenterService");
	boolean UpdateGrillsTodb =renterservice.updateGrill(grillBer);
	assertEquals(1,UpdateGrillsTodb);
	}
	
	@Test
	public void testAddGrill() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("grill-application.xml");
		GrillBer grillBer=new GrillBer();
		grillBer.setGrillId(12);
		grillBer.setGrillType("charcoal grill");
		RenterService renterservice=(RenterService) context.getBean("RenterService");
	boolean AddGrillsTodb =renterservice.addGrill(grillBer);
	assertEquals(1,AddGrillsTodb);
	}
	
	//	
	@Test
	public void testBookGrill() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("grill-application.xml");
		GrillBer grillBer=new GrillBer();
		User user=new User();
	
		
		UserService userservice=(UserService) context.getBean("UserService");
	boolean bookedGrills =userservice.bookGrill(user, grillBer.getGrillType(),AddOn.chairs);
	assertEquals(1,bookedGrills);
	}
}
