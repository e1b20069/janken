package oit.is.z1661.kaizi.janken.controller;

import java.security.Principal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import oit.is.z1661.kaizi.janken.model.Janken;
import oit.is.z1661.kaizi.janken.model.Match;
import oit.is.z1661.kaizi.janken.model.User;
import oit.is.z1661.kaizi.janken.model.UserMapper;
import oit.is.z1661.kaizi.janken.model.MatchMapper;

@Controller
public class JankenController {

  @Autowired
  UserMapper userMapper;

  @Autowired
  MatchMapper matchMapper;

  @GetMapping("/janken")
  public String janken(ModelMap model, Principal prin) {
    String name = prin.getName();
    ArrayList<User> users = userMapper.selectAllUser();
    ArrayList<Match> matches = matchMapper.selectAllMatch();
    model.addAttribute("Name", name);
    model.addAttribute("users", users);
    model.addAttribute("matches", matches);

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

  @GetMapping("/match")
  public String match(@RequestParam Integer id, ModelMap model, Principal prin) {
    String name = prin.getName();
    User loginuser = userMapper.selectByname(name);
    User eUser = userMapper.selectByid(id);

    model.addAttribute("loginuser", loginuser);
    model.addAttribute("eUser", eUser);

    return "match.html";
  }

  @GetMapping("/fight")
  public String fight(@RequestParam Integer id, @RequestParam String hand, ModelMap model, Principal prin) {
    String name = prin.getName();
    User loginuser = userMapper.selectByname(name);
    User eUser = userMapper.selectByid(id);
    String userhand = hand;
    String cpuhand = "Gu";
    Janken janken = new Janken(userhand, cpuhand);

    model.addAttribute("loginuser", loginuser);
    model.addAttribute("eUser", eUser);
    model.addAttribute("userhand", userhand);
    model.addAttribute("cpuhand", janken.getCpuHand());
    model.addAttribute("kekka", janken.getKekka());

    Match insertMatch = new Match(loginuser.getId(), id, userhand, cpuhand);

    matchMapper.insertMatch(insertMatch);

    return "match.html";
  }
}
