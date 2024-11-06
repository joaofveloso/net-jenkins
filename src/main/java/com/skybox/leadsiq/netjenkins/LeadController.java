package com.skybox.leadsiq.netjenkins;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/leads")
public class LeadController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewLead() {

        log.info("Lead created");
    }
}
