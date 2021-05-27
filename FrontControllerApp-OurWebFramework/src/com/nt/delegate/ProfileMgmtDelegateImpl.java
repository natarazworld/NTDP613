package com.nt.delegate;

import com.nt.bo.ProfileDetailsBO;
import com.nt.dao.IProfileDAO;
import com.nt.dao.ProfileDAOImpl;
import com.nt.dto.ProfileDetailsDTO;

public class ProfileMgmtDelegateImpl implements IProfileMgmtDelegate {
     private IProfileDAO dao;
	
	public ProfileMgmtDelegateImpl() {
		dao=new ProfileDAOImpl();
	}
	
	@Override
	public ProfileDetailsDTO fetchProfileById(int id)throws Exception {
		//use DAO
		ProfileDetailsBO bo=dao.getProfileById(id);
		//convert  BO class object to DTO class object
		ProfileDetailsDTO dto=new ProfileDetailsDTO();
		dto.setProfileId(bo.getProfileId());
		dto.setProfileName(bo.getProfileName());
		dto.setProfileUrl(bo.getProfileUrl());
		dto.setDOB(bo.getDOB());
		dto.setDOJ(bo.getDOJ());
		return dto;
	}

}
