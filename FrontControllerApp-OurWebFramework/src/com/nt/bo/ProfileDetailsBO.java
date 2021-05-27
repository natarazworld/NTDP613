package com.nt.bo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ProfileDetailsBO {
   private  int profileId;
   private  String profileName;
   private  String  profileUrl;
   private  LocalDateTime DOB,DOJ;
   
}
