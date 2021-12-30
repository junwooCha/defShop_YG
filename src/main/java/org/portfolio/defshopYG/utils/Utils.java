package org.portfolio.defshopYG.utils;

import org.portfolio.defshopYG.login.model.UserEntity;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Utils {

    public static void displayView(String title, String page
            , HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        req.setAttribute("title", title);
        req.setAttribute("page", page);
        disForward(req, res, "layout");
    }

    public static void disForward(HttpServletRequest req, HttpServletResponse res, String jsp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/" + jsp + ".jsp").forward(req, res);
    }


    public static int getParameterInt(HttpServletRequest req, String key) {
        String val = req.getParameter(key);
        return parseStringToInt(val, 0);
    }

    public static int getParameterInt(HttpServletRequest req, String key, int defVal) {
        String val = req.getParameter(key);
        return parseStringToInt(val, defVal);
    }

    public static int parseStringToInt(String val, int defVal) {
        try {
            return Integer.parseInt(val);
        } catch (Exception e) {}
        return defVal;
    }

    public static UserEntity getLoginUser(HttpServletRequest req) {
        HttpSession hs = req.getSession();
        return (UserEntity) hs.getAttribute("loginUser");
    }

    public static int getLoginUserPk(HttpServletRequest req) {
        UserEntity loginUser = getLoginUser(req);
        if(loginUser == null) { return 0; }
        return loginUser.getIuser();
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
