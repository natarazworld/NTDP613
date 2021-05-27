package com.nt.dao;

import com.nt.bo.ProfileDetailsBO;

public interface IProfileDAO {
    public ProfileDetailsBO  getProfileById(int id)throws Exception;
}
