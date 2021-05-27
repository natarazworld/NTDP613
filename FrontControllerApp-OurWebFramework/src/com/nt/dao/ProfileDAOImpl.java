package com.nt.dao;

import java.time.LocalDateTime;

import com.nt.bo.ProfileDetailsBO;

public class ProfileDAOImpl implements IProfileDAO {

	@Override
	public ProfileDetailsBO getProfileById(int id) throws Exception {
		ProfileDetailsBO bo=null;
		 if(id==1001) {
			 //actually we should collect from Db s/w to put into BO class object
			 bo=new ProfileDetailsBO();
			 bo.setProfileId(1001);
			 bo.setProfileName("Rajesh");
			 bo.setProfileUrl("https://fb.com/profiels/rajesh");
			 bo.setDOB(LocalDateTime.of(1990,12,23,12,56));
			 bo.setDOJ(LocalDateTime.of(2010,12,23,12,56));
		 }
		 else if (id==1002) {
			 //actually we should collect from Db s/w to put into BO class object
			 bo=new ProfileDetailsBO();
			 bo.setProfileId(1002);
			 bo.setProfileName("anil");
			 bo.setProfileUrl("https://fb.com/profiels/anil");
			 bo.setDOB(LocalDateTime.of(1980,12,23,12,56));
			 bo.setDOJ(LocalDateTime.of(2011,12,23,12,56));
		 }
		 else
			 throw new  IllegalArgumentException("invalid  Account");
	
		return bo;
	}

}
