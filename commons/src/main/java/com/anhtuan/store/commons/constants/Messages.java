package com.anhtuan.store.commons.constants;

public interface Messages {
   String REGISTER_SUCCESS = "%s has been registered.";
   interface User{
      String USER_NOT_FOUND = "User not found";
      String EMAIL_INVALID = "Email is invalid";
      String USER_NAME_REQUIRED = "User name is required.";
      String PASSWORD_REQUIRED = "Password is required.";
      String RE_PASSWORD_REQUIRED = "Re-password is required.";
      String PASSWORD_CONFIRMATION_MATCH_REQUIRED = "The Re-enter Password you entered do not match.";
      String EMAIL = "Email";
      String USER = "User";
   }

}