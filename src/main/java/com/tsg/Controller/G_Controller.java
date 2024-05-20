package com.tsg.Controller;

import java.util.List;

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


    @GetMapping("/homepage")
    public String home(Model model) {

        model.addAttribute("gents_Member", g_Service.getAllGentsMembers());

        return "home";
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

        return "redirect:/homepage";

    }


    @GetMapping("/gents_member/update/{id}")
    public String updateMemberForm(@PathVariable Long id, Model model) {
        G_Member g_Member = g_Service.getGentsMemberById(id);
        model.addAttribute("gents_members", g_Member);
        return "update_member";
    }

    @PostMapping("/gents_members/{id}")
    public String updateMember(@PathVariable("id") Long id, @ModelAttribute("gents_members") G_Member g_member) {
        G_Member currentMember = g_Service.getGentsMemberById(id);
        currentMember.setG_id(g_member.getG_id());
        currentMember.setG_name(g_member.getG_name());
        currentMember.setG_email(g_member.getG_email());
        currentMember.setG_number(g_member.getG_number());
        currentMember.setG_admission_date(g_member.getG_admission_date());

        g_Service.updategentsMember(currentMember);
        return "redirect:/homepage";
    }



}
