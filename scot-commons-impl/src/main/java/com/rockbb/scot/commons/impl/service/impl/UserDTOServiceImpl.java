package com.rockbb.scot.commons.impl.service.impl;

import com.rockbb.scot.commons.api.dto.UserDTO;
import com.rockbb.scot.commons.api.service.UserDTOService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserDTOServiceImpl implements UserDTOService {
    @Value("${spring.cloud.client.hostname}")
    String ipAddress;
    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String applicationName;

    @Override
    @RequestMapping(value = "/diagnos",method = RequestMethod.GET)
    public String diagnos(@RequestParam String name) {
        return ipAddress+":"+port+":"+applicationName+": " + name;
    }

    @Override
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public UserDTO get(@RequestParam String id) {
        return new UserDTO().initialize("3utowired5nnotation9ean0osterocessor", "system");
    }

    @Override
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserDTO> list() {
        return new ArrayList<>();
    }

    @Override
    @RequestMapping(value = "/count",method = RequestMethod.GET)
    public long count() {
        return 99;
    }
}
