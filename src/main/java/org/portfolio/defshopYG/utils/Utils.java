package org.portfolio.defshopYG.utils;

import org.portfolio.defshopYG.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Component
public class Utils {

    @Autowired
    private HttpSession session;

    public int getLoginUserPk() {
        return getLoginUser() == null ? 0 : getLoginUser().getIuser();
    }

    public UserEntity getLoginUser() {
        return (UserEntity) session.getAttribute(Const.LOGIN_USER);
    }

    public static String layoutView(Model model, String title, String page){
        model.addAttribute("title", title);
        model.addAttribute("page", page);
        return "layout";
    }


    public static String replaceStr(String str){
        return str.replace("<","&lt")
                .replace(">", "&gt")
                .replace(".", "&#46")
                .replace("'","&#39");
    }


    //id 뒷자리 4번째부터 *로치환
    public static String subString(String str){
        return str.substring(0, 4) + str.substring(4, str.length()).replaceAll("\\S", "*");
    }
}
