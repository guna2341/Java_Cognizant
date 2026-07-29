package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Map<String, String> getAccount(@PathVariable("number") String accountNumber) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("number", accountNumber);
        map.put("type", "savings");
        map.put("balance", "23003");
        return map;
    }

}
