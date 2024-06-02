package com.tsg.Controller;

import java.time.LocalDate;
import java.util.List;

import com.tsg.Entities.G_memberPayment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.tsg.Entities.G_Member;
import com.tsg.Services.G_Service;

@Controller
public class G_Controller {
    private final G_Service g_Service;

    public G_Controller(G_Service g_Service) {
        super();
        this.g_Service = g_Service;
    }


    @GetMapping("/third-space-gym/homepage")
    public String home(Model model) {

        model.addAttribute("gents_Member", g_Service.getAllGentsMembers());

        return "home";
    }

    // search

    @GetMapping("/gents_member/search")
    public String search(@RequestParam("query") String query, Model model) {
        List<G_Member> searchResults = g_Service.searchMembers(query);
        model.addAttribute("gents_Member", searchResults);
        return "home";
    }


    // View payments
    @GetMapping("/gents_member/{id}/payments")
    public String viewPayments(@PathVariable Long id, Model model) {
        G_Member member = g_Service.getGentsMemberById(id);
        List<G_memberPayment> payments = g_Service.findByGpid(member.getGid());
        model.addAttribute("member", member);
        model.addAttribute("payments", payments);
        return "payments";
    }

    // Add payment
    @PostMapping("/gents_member/{id}/add_payment")
    public String addPayment(@PathVariable Long id, @RequestParam String gname, @RequestParam int gamount, @RequestParam String gpaymentmonth, Model model) {
        G_Member member = g_Service.getGentsMemberById(id);
        G_memberPayment payment = new G_memberPayment();
        payment.setGname(gname);
        payment.setGamount(gamount);
        payment.setGpaymentmonth(gpaymentmonth);
        payment.setGpaymentdate(LocalDate.now());
        payment.setgMember(member);
        payment.setGpid(member.getGid());
        g_Service.savePayment(payment);
        return "redirect:/gents_member/" + id + "/payments";
    }
    

}
