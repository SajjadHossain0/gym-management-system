package com.tsg.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	

}
