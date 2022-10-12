package oit.is.z1661.kaizi.janken.model;

public class Janken {
  String hand;
  String cpuhand;
  String kekka;

  public Janken(String hand, String cpuhand) {
    this.hand = hand;
    this.cpuhand = cpuhand;
    makegame(hand, cpuhand);
  }

  public void makegame(String hand, String cpuhand) {
    if ((hand.equals("Gu") && cpuhand.equals("Gu")) || (hand.equals("Tyoki") && cpuhand.equals("Tyoki"))
        || (hand.equals("Pa") && cpuhand.equals("Pa"))) {
      this.kekka = "Draw";
    } else if ((hand.equals("Gu") && cpuhand.equals("Tyoki")) || (hand.equals("Tyoki") && cpuhand.equals("Pa"))
        || (hand.equals("Pa") && cpuhand.equals("Gu"))) {
      this.kekka = "You Win!";
    } else {
      this.kekka = "CPU Win!";
    }
  }

  public String getCpuHand() {
    return this.cpuhand;
  }

  public String getKekka() {
    return this.kekka;
  }

}
