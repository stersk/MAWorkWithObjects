package com.mainacad;

import com.mainacad.model.Gender;
import com.mainacad.model.User;
import com.mainacad.service.UserGenerationService;

public class ApplicationRunner {
  public static void main(String[] args) {
    User user = new User();
    user.setLogin("ss");
    user.setPassword("1234");
    user.setFirstName("name");
    user.setLastName("second");
    user.setDateOfBirth(UserGenerationService.getDate(2000,2,21));
    user.setGender(Gender.MALE);

    User secondUser = new User("secondUser", "password", "Second", "User", UserGenerationService.getDate(2002, 5, 2), Gender.MALE);

    System.out.println(user);
    System.out.println(user.equals(secondUser));
  }
}
