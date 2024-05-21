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


    @GetMapping("/gents_member/{id}")
    public String deleteMember(@PathVariable Long id) {

        g_Service.deleteGentsMemberById(id);
        return "redirect:/homepage";
    }



}
