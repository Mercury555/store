//package net.store.controller;
//
//import net.store.domain.Customer;
//import net.store.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/admin")
//public class AdminController {
//
//    @Autowired
//    private CustomerService customerService;
//
//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @GetMapping("/admin")
//    public String getAllCustomers(Model model){
//        model.addAttribute("allCustomers", customerService.findAll());
//        return "/admin";
//    }
//
//    @PostMapping("/addCustomer")
//    public String addCustomer(@ModelAttribute("customerForm")Customer customerForm){
//        Customer customer = customerForm;
//        return "redirect:/admin";
//    }
//
//    @PostMapping("/updateCustomer")
//    public String updateCustomer(@ModelAttribute("updCustomer")Customer updCustomer){
//        Customer customer = new Customer();
//        customer.setUsername(updCustomer.getUsername());
//        customer.setEmail(updCustomer.getEmail());
//        customer.setPassword(bCryptPasswordEncoder.encode(updCustomer.getPassword()));
//        customer.setFirstName(updCustomer.getFirstName());
//        customer.setSecondName(updCustomer.getSecondName());
//        customer.setOrderList(updCustomer.getOrderList());
//        customerService.saveCustomer(customer);
//        return "redirect:/admin";
//    }
//
//    @RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
//    public String deleteCustomer(@PathVariable("id") Long id){
//        customerService.deleteCustomerById(id);
//        return "redirect:/admin";
//    }
//
//    @PostMapping("/findCustomer")
//    public String findCustomer(@RequestParam long id){
//        customerService.findCustomerById(id);
//        return "redirect:/admin";
//    }
//
//}
