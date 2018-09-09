package com.employee.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.model.Employee;

import org.springframework.ui.ModelMap;

@Controller
public class EmployeeController{
 
   @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");

      return "hello";
   }
   
   @RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("addEmployee", "command", new Employee());
   }
   
   @RequestMapping(value = "/insertEmployee", method = RequestMethod.POST)
   public String addStudent(@ModelAttribute("SpringWeb") Employee employee, 
   ModelMap model) {
	   
	   // KIRANMAI - Perform your DB operations to into database using hibernate
	   
      model.addAttribute("name", employee.getName());
      model.addAttribute("address", employee.getAddress());
      model.addAttribute("department", employee.getDepartment());
      model.addAttribute("salary", employee.getSalary());
      model.addAttribute("location", employee.getLocation());
      
      return "addEmployeeResponse";
   }
   
   @ModelAttribute("locationList")
   public Map<String, String> getLocationList() {
      Map<String, String> locationList = new HashMap<String, String>();
      locationList.put("India", "India");
      locationList.put("United States", "United States");
      locationList.put("China", "China");
      locationList.put("Singapore", "Singapore");
      locationList.put("Malaysia", "Malaysia");
      return locationList;
   }
   
   @ModelAttribute("departmentList")
   public Map<String, String> getDepartmentList() {
      Map<String, String> departmentList = new HashMap<String, String>();
      departmentList.put("HR", "HR");
      departmentList.put("Finance", "Finance");
      return departmentList;
   }

   @RequestMapping(value = "/", method = RequestMethod.GET)
   public String index() {
       return "index";
   }
   
   @RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
   public String listEmployee(ModelMap model) {
      model.addAttribute("message", "Replace it with your object");

      return "listEmployee";
   }
   
}