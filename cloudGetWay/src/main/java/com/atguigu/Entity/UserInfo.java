package com.atguigu.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserInfo {

  private long userId;
  private String userName;
  private String userPhone;
  private String userAccount;
  private String userPassword;
  private String userMark;
}
