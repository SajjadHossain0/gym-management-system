package com.tsg.Controller;

import com.tsg.Entities.G_Member;
import com.tsg.Services.G_Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class G_addMemberController {
    private final G_Service g_Service;

    public G_addMemberController(G_Service g_Service) {
        super();
        this.g_Service = g_Service;
    }


    @GetMapping("/gents_member/add_new")
    public String addMemberForm(Model model) {

        G_Member g_Member = new G_Member();
        model.addAttribute("addMemberForm", g_Member);

        return "add_member";
    }

    @PostMapping("/gents_members")
    public String add_new_member(@ModelAttribute("addMemberForm") G_Member g_Member) {

        g_Service.saveGentsMember(g_Member);

        return "redirect:/third-space-gym/homepage";

    }


}
