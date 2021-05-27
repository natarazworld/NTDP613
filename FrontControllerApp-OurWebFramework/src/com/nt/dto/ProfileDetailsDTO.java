package com.nt.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ProfileDetailsDTO  implements Serializable {
   private  int profileId;
   private  String profileName;
   private  String  profileUrl;
   private  LocalDateTime DOB,DOJ;
   
}
