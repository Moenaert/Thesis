package com.thesis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DashboardController {


    @GetMapping("/bids")    // website om bid topic te displayen (indexTemp.html): http://localhost:9091/bids
    public String returnBids() {
        return "bidDashboard";
    }

    @GetMapping("/accounts")    // website om account topic te displayen (indexTemp.html): http://localhost:9091/accounts
    public String returnAccounts() {
        return "accountDashboard";
    }

    @GetMapping("/views")    // website om account topic te displayen (indexTemp.html): http://localhost:9091/views
    public String returnViews() {
        return "viewDashboard";
    }
}
