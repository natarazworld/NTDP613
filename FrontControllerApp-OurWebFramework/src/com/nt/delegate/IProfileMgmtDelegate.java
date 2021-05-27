package com.nt.delegate;

import com.nt.dto.ProfileDetailsDTO;

public interface IProfileMgmtDelegate {
   public ProfileDetailsDTO   fetchProfileById(int id)throws Exception;
}
