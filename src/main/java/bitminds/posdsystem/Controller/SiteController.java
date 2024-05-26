package bitminds.posdsystem.Controller;

import bitminds.posdsystem.Model.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

    @RequestMapping("/")
    public String viewHomePage(Model model) {
        return "hello";
    }

}
