package com.tsg.Controller;

import com.tsg.Services.G_Service;
import com.tsg.Services.G_paymentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class G_deletePaymentController {
    private final G_paymentService g_paymentService;

    public G_deletePaymentController(G_paymentService gPaymentService) {
        g_paymentService = gPaymentService;
    }


    @GetMapping("/gents_member_payment/{pid}")
    public String deletePayment(@PathVariable Long pid) {

        g_paymentService.deletePaymentInfoById(pid);
        return "redirect:/payment_page";
    }
}
