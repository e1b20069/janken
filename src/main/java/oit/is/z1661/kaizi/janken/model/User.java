package oit.is.z1661.kaizi.janken.model;

public class User {
  int id;
  String userName;

  public User() {

  }

  public User(int id2, String name2) {
    this.id = id2;
    this.userName = name2;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
