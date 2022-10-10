package oit.is.z1661.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class JankenController {
  @PostMapping("/janken")
  public String janken() {
    return "sample24.html";
  }
}
