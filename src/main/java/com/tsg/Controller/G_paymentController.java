package com.tsg.Controller;

<<<<<<< HEAD
=======
import com.tsg.Entities.G_Member;
import com.tsg.Services.G_Service;
>>>>>>> origin/master
import com.tsg.Services.G_paymentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> origin/master

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

<<<<<<< HEAD
        return "payment_list_page";
=======
        return "payment_page";
>>>>>>> origin/master
    }


}
