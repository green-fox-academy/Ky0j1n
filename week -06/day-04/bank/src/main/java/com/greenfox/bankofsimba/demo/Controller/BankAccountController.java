package com.greenfox.bankofsimba.demo.Controller;

import com.greenfox.bankofsimba.demo.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class BankAccountController {
        private List<BankAccount> bankAccountList = new ArrayList<>();

        public BankAccountController() {

            bankAccountList.add(new BankAccount("Simba" ,2000D, "lion"));
            bankAccountList.add(new BankAccount("Timon" ,5040D, "meerkat"));
            bankAccountList.add(new BankAccount("Pumba" ,2300D, "boar"));
            bankAccountList.add(new BankAccount("Scar" ,3567D, "lion"));
            bankAccountList.add(new BankAccount("Nala" ,4000D, "lion"));
        }

    @RequestMapping( path = "/show" , method = RequestMethod.GET)
    public String showAccount(Model model) {
       model.addAttribute("bankAccountList" , bankAccountList);
       return "index";
    }

    @RequestMapping ( path = "/text", method = RequestMethod.GET)
    public String text(Model model) {
       String text= "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
       model.addAttribute("text", text);
       return "text";
    }

    @RequestMapping ( path = "/table", method = RequestMethod.GET)
    public String tableShow(Model model) {
              model.addAttribute("bankAccountList", bankAccountList);
       return "table";
    }
}
