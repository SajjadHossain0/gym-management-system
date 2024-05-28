package com.tsg.Controller;

import com.tsg.Services.G_paymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class G_paymentController {
    private final G_paymentService g_paymentService;

    public G_paymentController(G_paymentService g_paymentService) {
        super();
        this.g_paymentService = g_paymentService;
    }

    @GetMapping("/gents_member/payment")
    public String gentsPayment(Model model) {

        model.addAttribute("new_payment", g_paymentService.getAllGentsMembersPayment());

        return "payment_list_page";
    }


}
