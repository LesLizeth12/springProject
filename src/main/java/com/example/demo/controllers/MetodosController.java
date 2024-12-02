package com.example.demo.controllers;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Persona;


@Controller
@RequestMapping("/MetodosController")
public class MetodosController {
	
	/*
	public String Metodo1() {
		return "Vista1";
	}
	*/
	
	@GetMapping(value="/Metodo1")
	public String Metodo1(){
		return "Vista1";
	}
	
	@GetMapping(value="/Metodo2")
	public ModelAndView Metodo2(){
		ModelAndView mav=new ModelAndView("Vista2");
		mav.addObject("p",getPersonas());
		return mav;
	}
	
	@GetMapping(value="/Metodo3")
	public ModelAndView Metodo3(@RequestParam(name="nombre") String nombre){
		ModelAndView mav=new ModelAndView("Vista3");
		mav.addObject("nombre",nombre);
		return mav;
	}
	
	@GetMapping(value="/Metodo4/{nombre}")
	public ModelAndView Metodo4(@PathVariable(name="nombre") String nombre){
		ModelAndView mav=new ModelAndView("Vista4");
		mav.addObject("nombre",nombre);
		return mav;
	}
	
	/*
	@GetMapping(value="/Metodo2")
	public ModelAndView Metodo2(){
		return new ModelAndView("Vista2");
	}
	*/
	
	private List<Persona> getPersonas(){
		List<Persona> p=new ArrayList<Persona>();
		p.add(new Persona("Juan","987654321"));
		p.add(new Persona("Pedro","932564674"));
		p.add(new Persona("Miguel","965271345"));
		p.add(new Persona("Luis","986547893"));
		p.add(new Persona("Raul","977456356"));
		return p;
	}
}
