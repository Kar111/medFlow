package com.medflow.controller;

import com.medflow.model.Admin;
import com.medflow.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
public class

MedflowController {
//    @Autowired
//    private final AdminRepository adminRepository;
//
//    public MedflowController(AdminRepository adminRepository) {
//        this.adminRepository = adminRepository;
//    }

    @GetMapping
    public String healthCheck() {

        return "MedFlow is up and running!!!";
    }

//    @GetMapping("imedflow/admin")
//    public String getAdminName( Long id) {
//        return adminRepository.findById(id).get().getFirstName();
//    }
//
//    @PostMapping("imedflow/admin")
//    public void AddAdminName(@RequestParam String firstName) {
//        Admin newAdmin = new Admin(firstName);
//        adminRepository.save(newAdmin);
//    }
}
