package oit.is.z1661.kaizi.janken.model;

public class MatchInfo {
  int id, user1, user2;
  String user1Hand;
  boolean isActive;

  public MatchInfo(int user21, int user22, String user21Hand) {
    this.user1 = user21;
    this.user2 = user22;
    this.user1Hand = user21Hand;
    this.isActive = true;
  }

  public int getId() {
    return id;
  }

  public int getUser1() {
    return user1;
  }

  public int getUser2() {
    return user2;
  }

  public String getUser1Hand() {
    return user1Hand;
  }

  public boolean getisActive() {
    return isActive;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setUser1(int user1) {
    this.user1 = user1;
  }

  public void setUser2(int user2) {
    this.user2 = user2;
  }

  public void setUser1Hand(String user1Hand) {
    this.user1Hand = user1Hand;
  }

  public void setisActive(boolean isActive) {
    this.isActive = isActive;
  }
}
