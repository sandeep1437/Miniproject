package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Employee;
import com.model.LoginDetails;
import com.service.EmployeeService;
import com.service.LoginService;
import com.validator.LoginValidator;

@Controller
public class AppController {

	@Autowired
	private LoginValidator loginValidator;

	@Autowired
	private LoginDetails logindetails;
	
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/")
	public ModelAndView login() {

		ModelAndView modelAndView = new ModelAndView("loginPage");
		modelAndView.addObject("empModel", logindetails);

		return modelAndView;

	}

	@PostMapping(value = "login")
	public ModelAndView saveLogin(@ModelAttribute("empModel") LoginDetails loginDetails, BindingResult bindingResult) {
		loginValidator.validate(loginDetails, bindingResult);
		loginValidator.loginValidate(loginDetails, bindingResult);
		ModelAndView modelAndView = null;
		if (bindingResult.hasErrors()) {
			modelAndView = new ModelAndView("loginPage");
		} else {
			modelAndView = new ModelAndView("redirect:/home");
		}
		return modelAndView;

	}
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee() {

		Employee employee = new Employee();
		ModelAndView modelAndView = new ModelAndView("AddEmployee");
		modelAndView.addObject("employeeModel", employee);
		return modelAndView;

	}
	
	@RequestMapping(value = "/saveEmployee")
	public ModelAndView saveEmployee(@ModelAttribute("employeeModel")Employee employee, BindingResult result) {
		
		
		ModelAndView modelAndView = null;

		if (result.hasErrors()) {
			modelAndView = new ModelAndView("AddEmployee");
		}

		else {
			
			employeeService.addEmployee(employee);
			modelAndView = new ModelAndView("redirect:/home");
		}

		return modelAndView;

	}


	@RequestMapping("/home")
	public ModelAndView home() {

		ModelAndView modelAndView = new ModelAndView("HomePage");
        List<Employee> listofEmployees = employeeService.getAllEmployee();
        modelAndView.addObject("listEmployee", listofEmployees);
		return modelAndView;

	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(@ModelAttribute("employeeModel1")Employee employee) {
		
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			System.out.println(employee.getEmail());
			System.out.println(employee.getDesignation());
			System.out.println(employee.getExperience());
		
		employeeService.update(employee);
		ModelAndView modelAndView = new ModelAndView("redirect:/home");
		return modelAndView;

	}
	
	 @GetMapping("/updateForm")
	    public String showFormForUpdate(@RequestParam("employeeId") int Id, Model model)  {
		 	System.out.println(Id);
	        Employee employee = employeeService.readById(Id);
	       model.addAttribute("employeeModel1", employee);
	        return "EditPage";
	    }
	

	 
	 @GetMapping("/delete")
	    public String deleteCustomer(@RequestParam("employeeId") int id)  {
	       employeeService.delete(id);
	        return "redirect:/home";
	    }
	 @RequestMapping("/SearchByDesignation")
		public ModelAndView searchBydesignation(@RequestParam("design")String designation) {

			ModelAndView modelAndView = new ModelAndView("HomePage");
	        List<Employee> listofEmployees = employeeService.readByDesignation(designation);
	        modelAndView.addObject("listEmployee", listofEmployees);
			return modelAndView;

		}
	 @RequestMapping("/addAdmin")
		public ModelAndView addAdmin() {
			LoginDetails loginDetails = new LoginDetails();
			ModelAndView modelAndView = new ModelAndView("AddAdmin");
			modelAndView.addObject("loginModel",loginDetails);
			return modelAndView;
		}
	 @PostMapping(value = "/saveAdmin")
		public ModelAndView saveAdmin(@ModelAttribute("loginModel")LoginDetails loginDetails ) {
			
			loginService.addUser(loginDetails);
			ModelAndView modelAndView = new ModelAndView("redirect:/home");
			return modelAndView;	

		}
	 @RequestMapping(value="/logout")
	 public ModelAndView logout() {
		 ModelAndView modelAndView = new ModelAndView("redirect:/");
		 return modelAndView;
	 }
}
