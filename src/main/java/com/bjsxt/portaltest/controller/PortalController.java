package com.bjsxt.portaltest.controller;


import com.bjsxt.portaltest.service.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {
    @Autowired
    private PortalService portalService;
    @GetMapping("/sp")
    public String savePortal(){
        return portalService.savePortal();
    }

}
