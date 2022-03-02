package web;
import java.util.ArrayList;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //web app String only must be @RestsponseBody
class Web{
    @RequestMapping("/")
    String showHome(Model model) {
        String [] data = { "Latte", "Mocha", "Espresso"};
        model.addAttribute("brand", "iCoffee");
        model.addAttribute("products",data);
        return "home";
    }
    @RequestMapping({"/register","/join"})
    String showRegisterPage(Model model,
                String city,
                String code) {
        model.addAttribute("result","False");
        try{
            int k = Integer.valueOf(code);
            if(k % 2 == 0) {
                model.addAttribute("result","Success");
            }
        } catch (Exception e) { }
        return "register"; // register.html
    }
    @RequestMapping("/api/list-staff") @ResponseBody
    ArrayList listStaff(){
        ArrayList a =  new ArrayList();
        a.add("Bill Gates"); a.add("Elon Musk");
        return a;
        }
    @RequestMapping("/show")
    String show(Model m,String number){
        ArrayList a = new ArrayList();
        String type = "";
        try{
            int value = Integer.valueOf(number);
            if(value % 2 == 0) { type = "Even";}
            else                        {type = " ODD";}
            for(int i = 1; i <= value; i++){
                if(value % i == 0) {
                    a.add(i);
                }
            }
        } catch (Exception e) { }
        m.addAttribute("type",type);
        m.addAttribute("result",a);
            return "sample";
        }
    }
