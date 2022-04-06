package com.dbspring.db_assignment6.controllers;

import com.dbspring.db_assignment6.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CustomerController {
    @GetMapping("/view")
    public ModelAndView allCustomersView(){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Tudor","Bucharest","Romania"));
        customers.add(new Customer(2,"Andrei","Constanta","Romania"));
        customers.add(new Customer(3,"Ion","Bucharest","Romania"));
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView CustomersById(@RequestParam Integer id){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"Tudor","Bucharest","Romania"));
        customers.add(new Customer(2,"Andrei","Constanta","Romania"));
        customers.add(new Customer(3,"Ion","Bucharest","Romania"));
        for(Customer customer: customers){
            if(customer.getId() != id)
                customers.remove(customer);
        }
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{username}")
    public ModelAndView CustomersByUsername(@RequestParam String username){
        List<Customer> customers = new ArrayList<>();

        for(Customer customer: customers){
            if(customer.getUsername() != username)
                customers.remove(customer);
        }
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{country}")
    public ModelAndView CustomersByCountry(@RequestParam String country){
        List<Customer> customers = new ArrayList<>();

        for(Customer customer: customers){
            if(customer.getCountry() != country)
                customers.remove(customer);
        }
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
    @GetMapping("/{city}")
    public ModelAndView CustomersByCity(@RequestParam String city){
        List<Customer> customers = new ArrayList<>();
        for(Customer customer: customers){
            if(customer.getCity() != city)
                customers.remove(customer);
        }
        ModelAndView modelAndView = new ModelAndView("view-page");
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }
}