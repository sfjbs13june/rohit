package com.rohit.db.controller;

import com.rohit.db.model.Message;
import com.rohit.db.repository.MessageDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/message")
public class MessageController {

    @Autowired
    MessageDataRepository messageDataRepository;

    @GetMapping(value = "/read")
    public @ResponseBody
    Iterable<Message> getAll() {
        return messageDataRepository.findAll();
    }

    @PostMapping(value = "/create")
    public @ResponseBody
    String store(@RequestBody final Message message) {
        messageDataRepository.save(message);
        return "saved";
    }
}
