package org.portfolio.defshopYG.user;

import org.portfolio.defshopYG.user.model.UserEntity;
import org.portfolio.defshopYG.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired //필요한 메소드 자동찾기
    private UserService service;

    @GetMapping("/login")
    public String login(Model model){
        return Utils.layoutView(model,"로그인", "/user/login");
    }

    @PostMapping("/login")
    public String loginProc(Model model, RedirectAttributes reAttr, UserEntity entity){
        int result = service.login(entity);
        switch (result) {
            case 1://로그인 성공
                return "redirect:/page/main";
            case 0://로그인 실패
                model.addAttribute("loginerrmsg", "로그인 실패");
                break;
        }
        return login(model);
    }

    @GetMapping("/logout")
    public String logout(HttpSession hs){
        hs.invalidate();
        return "redirect:/page/main";
    }

    @GetMapping("/join")
    public String join(Model model){
        return Utils.layoutView(model, "회원가입", "/user/join");
    }

    @PostMapping("/join")
    public String joinProc(RedirectAttributes reAttr, UserEntity entity){
        int result = service.joinUser(entity);
        if (result == 0){
            reAttr.addFlashAttribute("err", "회원가입 실패");
            return "redirect:/user/join";
        }
        return "redirect:/user/login";
    }




}