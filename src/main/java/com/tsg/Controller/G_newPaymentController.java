package com.tsg.Controller;

import com.tsg.Entities.G_Member;
import com.tsg.Entities.G_memberPayment;
import com.tsg.Services.G_paymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class G_newPaymentController {
    private final G_paymentService g_paymentService;

    public G_newPaymentController(G_paymentService g_paymentService) {
        super();
        this.g_paymentService = g_paymentService;
    }


    @GetMapping("/gents_member/new_payment")
    public String newPaymentForm(Model model) {

        G_memberPayment g_memberPayment = new G_memberPayment();
        model.addAttribute("newPaymentForm", g_memberPayment);

        return "new_payment";
    }

    @PostMapping("/new_members_payments")
    public String new_payment(@ModelAttribute("newPaymentForm") G_memberPayment g_memberPayment) {

        g_paymentService.saveGentsPayments(g_memberPayment);

        return "redirect:/payment_list_page";

    }


}
