package oit.is.z1661.kaizi.janken.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JankenController {

  /**
   * @param name
   * @param model
   * @return
   */
  @PostMapping("/janken")
  public String janken(@RequestParam String name, ModelMap model) {

    model.addAttribute("nameResult", name);
    return "janken.html";
  }

  @GetMapping("/jankengame?hand=Gu")
  public String jankengame() {

    System.out.println("あなたの手 Gu");
    System.out.println("相手の手 Gu");
    System.out.println("draw");
    return "janken.html";
  }
}
