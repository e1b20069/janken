package oit.is.z1661.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JankenController {
  @GetMapping("/janken")
  public String sample21() {
    return "janken.html";
  }
}
