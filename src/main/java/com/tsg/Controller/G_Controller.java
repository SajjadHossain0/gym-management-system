package com.tsg.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
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

    // search

    @GetMapping("/gents_member/search")
    public String search(@RequestParam("query") String query, Model model) {
        List<G_Member> searchResults = g_Service.searchMembers(query);
        model.addAttribute("gents_Member", searchResults);
        return "home";
    }


}
