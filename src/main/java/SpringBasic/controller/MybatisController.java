package SpringBasic.controller;

import SpringBasic.mybatis.domain.MybatisDomain;
import SpringBasic.mybatis.service.MybatisService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/mybatis")
public class MybatisController {

    private final MybatisService mybatisService;

    public MybatisController(MybatisService mybatisService) {
        this.mybatisService = mybatisService;
    }

    @RequestMapping("/main")
    public String main(@ModelAttribute("table") MybatisDomain mybatisDomain, Model model) {
        List<MybatisDomain> table = mybatisService.selectAll(mybatisDomain);
        model.addAttribute("table",table);
        return "/mybatis/main";
    }

    @RequestMapping("/selectOne")
    public String selectOne(@RequestParam long id, RedirectAttributes ra) {
        MybatisDomain result = mybatisService.selectOne(id);
        ra.addAttribute("result", result);
        return "redirect:/mybatis/main";
    }

    @RequestMapping("/saveData")
    public String saveData(@ModelAttribute("data") MybatisDomain mybatisDomain) {
        mybatisService.saveData(mybatisDomain);
        return "redirect:/mybatis/main";
    }

    @RequestMapping("/updateData")
    public String updateData(@RequestParam(name = "email") String email,
                             @RequestParam(name = "password") String password) {
        mybatisService.updateData(email, password);
        return "redirect:/mybatis/main";
    }

    @RequestMapping("/deleteData")
    public String updateData(@RequestParam(name = "email") String email) {
        mybatisService.deleteData(email);
        return "redirect:/mybatis/main";
    }

}
