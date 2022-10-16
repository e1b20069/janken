package oit.is.z1661.kaizi.janken.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1661.kaizi.janken.model.Janken;
import oit.is.z1661.kaizi.janken.model.Entry;

@Controller
public class JankenController {
  @Autowired
  private Entry room;

  @GetMapping("/janken")
  public String janken(ModelMap model, Principal prin) {
    String loginUser = prin.getName();
    String name = prin.getName();
    model.addAttribute("Name", name);
    this.room.addUser(loginUser);
    model.addAttribute("room", this.room);

    return "janken.html";
  }

  @PostMapping("/janken")
  public String janken(@RequestParam String name, ModelMap model) {
    model.addAttribute("Name", name);
    return "janken.html";
  }

  @GetMapping("/jankengame")
  public String lec02(@RequestParam String hand, ModelMap model) {
    String userhand = hand;
    String cpuhand = "Gu";
    Janken janken = new Janken(userhand, cpuhand);
    model.addAttribute("userhand", userhand);
    model.addAttribute("cpuhand", janken.getCpuHand());
    model.addAttribute("kekka", janken.getKekka());

    return "janken.html";
  }
}
