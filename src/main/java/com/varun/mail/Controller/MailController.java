package com.varun.mail.Controller;

import com.varun.mail.Model.MailStructure;
import com.varun.mail.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
public class MailController {

    @Autowired
    MailService mailService;

    @PostMapping("/send/{mail}")
    public MailStructure sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
        mailService.sendMail(mail,mailStructure);
        return mailStructure;

    }
}
