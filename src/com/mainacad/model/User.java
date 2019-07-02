package com.mainacad.model;

import java.util.Date;

public class User {
  private String login;
  private String password;
  private String firstName;
  private String lastName;
  private Date dateOfBirth;
  private Gender gender;

  public User(String login, String password, String firstName, String lastName, Date dateOfBirth, Gender gender) {
    this.login = login;
    this.password = password;
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
  }

  public User() {
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    User user = (User) o;

    if (!login.equals(user.login)) return false;
    if (!password.equals(user.password)) return false;
    if (!firstName.equals(user.firstName)) return false;
    if (!lastName.equals(user.lastName)) return false;
    if (!dateOfBirth.equals(user.dateOfBirth)) return false;
    return gender == user.gender;
  }

  @Override
  public int hashCode() {
    int result = login.hashCode();
    result = 31 * result + password.hashCode();
    result = 31 * result + firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + dateOfBirth.hashCode();
    result = 31 * result + gender.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName + " " + dateOfBirth;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Date getDateOfBirth() {
    return dateOfBirth;
  }

  public void setDateOfBirth(Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }
}
