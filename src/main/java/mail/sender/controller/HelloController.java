package mail.sender.controller;

import mail.sender.service.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Mail mail;

    @RequestMapping("/")
    public String index() {
        String labels = mail.getLabels();
        return "Greetings from Spring Boot!\n" +  labels;
    }

    @RequestMapping("/send")
    public String sendBasicMail() {
        mail.sendMessageText();
        return "Mail sent";
    }

}