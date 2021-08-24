package SpringBasic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/basic")
public class BasicController {

    @RequestMapping("/mav")
    public ModelAndView MAV(ModelAndView modelAndView) {
        modelAndView.addObject("mav", "가장 기본적으로 배웠던 방식");
        modelAndView.addObject("data", "데이터는 addObject로 넘긴다");
        modelAndView.setViewName("basic/mav");
        return modelAndView;
    }

    @RequestMapping("/string")
    public String string() {
        return "basic/string";
    }

    @RequestMapping("/model")
    public String model(Model model) {
        model.addAttribute("model", "두번째로 배운 model방식");
        model.addAttribute("data", "MAV와 다른점은 view를 String값으로 바로 전달해준다는 점이다.");
        return "basic/model";
    }

    @RequestMapping("/path/{path}")
    public String path(@PathVariable String path, Model model) {
        model.addAttribute("path", path);
        return "basic/path";
    }

    @RequestMapping(value = "/param", method = RequestMethod.GET)
    public String paramTest(@RequestParam(required = false) String data, Model model) {
        model.addAttribute("data", data);
        return "basic/param";
    }

    @RequestMapping(value = "/paramGet", method = RequestMethod.GET)
    public String paramGet(@RequestParam String data, RedirectAttributes ra) {
        ra.addAttribute("data", data);
        return "redirect:/basic/param";
    }

}
