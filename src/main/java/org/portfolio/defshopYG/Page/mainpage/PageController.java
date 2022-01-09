package org.portfolio.defshopYG.Page.mainpage;

import org.portfolio.defshopYG.user.UserService;
import org.portfolio.defshopYG.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/page")
public class PageController {

    @GetMapping("/main")
    public String mainPage(Model model){
        return Utils.layoutView(model,"메인페이지", "/page/main");
    }


    @GetMapping("/domabamlist")
    public void domabamList(){
    }

    @GetMapping("/goodslist")
    public void goodsList(){
    }

    @GetMapping("/event")
    public void eventList(){
    }

}

