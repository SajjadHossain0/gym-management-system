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
public class G_updateMemberController {
    private final G_Service g_Service;

    public G_updateMemberController(G_Service g_Service) {
        super();
        this.g_Service = g_Service;
    }

    @GetMapping("/gents_member/update/{id}")
    public String updateMemberForm(@PathVariable Long id, Model model) {
        G_Member g_Member = g_Service.getGentsMemberById(id);
        model.addAttribute("gents_members", g_Member);
        return "update_member";
    }

    @PostMapping("/gents_members/{id}")
    public String updateMember(@PathVariable Long id, @ModelAttribute("gents_members") G_Member g_member) {
        G_Member currentMember = g_Service.getGentsMemberById(id);
        currentMember.setGid(g_member.getGid());
        currentMember.setGname(g_member.getGname());
        currentMember.setGemail(g_member.getGemail());
        currentMember.setGnumber(g_member.getGnumber());
        currentMember.setGadmissiondate(g_member.getGadmissiondate());

        g_Service.updategentsMember(currentMember);
        return "redirect:/homepage";
    }

}
