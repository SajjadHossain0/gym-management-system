package com.tsg.Controller;

import com.tsg.Entities.G_Member;
import com.tsg.Services.G_Service;
import com.tsg.Services.G_paymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

        return "payment_page";
    }


}
