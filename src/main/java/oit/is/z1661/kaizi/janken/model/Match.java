package oit.is.z1661.kaizi.janken.model;

public class Match {
  int id, user1, user2;
  String user1Hand, user2Hand;

  public Match(int user21, int user22, String user21Hand, String user22Hand) {
    this.user1 = user21;
    this.user2 = user22;
    this.user1Hand = user21Hand;
    this.user2Hand = user22Hand;
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

  public String getUser2Hand() {
    return user2Hand;
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

  public void setUser2Hand(String user2Hand) {
    this.user2Hand = user2Hand;
  }

}
