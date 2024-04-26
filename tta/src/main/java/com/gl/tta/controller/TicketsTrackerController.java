package com.gl.tta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gl.tta.entity.Ticket;
import com.gl.tta.service.TicketService;

@Controller
@RequestMapping("/admin")
public class TicketsTrackerController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/welcome")
	public String greet() {
		return "Welcome";
	}
	
	@RequestMapping("/list")
	public String listTickets(Model theModel) {
		
		//get tickets from the DB
		List<Ticket> theTickets = ticketService.findAll();
		
		//add the tickets to the spring model
		theModel.addAttribute("tickets", theTickets);
		
		return "admin/list-tickets";		
	}
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		Ticket theTicket = new Ticket();
		
		theModel.addAttribute("ticket", theTicket);
		
		return "admin/ticket-form";
	}
	
	@PostMapping("/save")
	public String saveTicket(
			@ModelAttribute("ticket") Ticket theTicket) {
		
		ticketService.save(theTicket);
		
		return "redirect:/admin/list";
	}
	
	

}
