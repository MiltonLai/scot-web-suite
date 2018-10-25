package com.rockbb.scot.web.controller;

import com.rockbb.scot.commons.api.dto.UserDTO;
import com.rockbb.scot.commons.api.service.UserDTOService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Resource
    private UserDTOService userDTOService;

    @RequestMapping(value = "/test1",method = RequestMethod.GET)
    public String test1(@RequestParam String name){
        logger.debug("/test1");
        return userDTOService.diagnos(name);
    }

    @RequestMapping(value = "/test11",method = RequestMethod.GET, produces = "application/json")
    public String test11(@RequestParam String name){
        return userDTOService.diagnos(name);
    }

    @RequestMapping(value = "/test2",method = RequestMethod.GET)
    public UserDTO test2(@RequestParam String id){
        return userDTOService.get(id);
    }

    @RequestMapping(value = "/test21",method = RequestMethod.GET, produces = "application/json")
    public UserDTO test21(@RequestParam String id){
        return userDTOService.get(id);
    }

    @RequestMapping(value = "/test3",method = RequestMethod.GET)
    public List<UserDTO> users(@RequestParam String id){
        return userDTOService.list();
    }

    @RequestMapping(value = "/test4",method = RequestMethod.GET)
    public long users(){
        return userDTOService.count();
    }

    @GetMapping("/session")
    public String session(HttpSession session) {
        return session.getId();
    }
}
