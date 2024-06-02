package com.tsg.Controller;

import com.tsg.Entities.G_Member;
import com.tsg.Services.G_Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class G_deleteMemberController {
    private final G_Service g_Service;

    public G_deleteMemberController(G_Service g_Service) {
        super();
        this.g_Service = g_Service;
    }

    @GetMapping("/gents_member/{id}")
    public String deleteMember(@PathVariable Long id) {

        g_Service.deleteGentsMemberById(id);
        return "redirect:/third-space-gym/homepage";
    }
}
