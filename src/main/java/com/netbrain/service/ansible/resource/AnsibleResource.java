package com.netbrain.service.ansible.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/asb")
public class AnsibleResource {


    @GetMapping("/{taskName}")
    public String getTask(@PathVariable("taskName") final String taskName) {
        return "hello " + taskName;
    }

    @GetMapping("/start-task/{taskName}")
    public String startTask(@PathVariable("taskName") final String taskName) {

        return "hello " + taskName;
    }

}
