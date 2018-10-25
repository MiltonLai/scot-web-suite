package com.rockbb.scot.commons.api.service;

import com.rockbb.scot.commons.api.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "scot-commons")
@RequestMapping(value = "/user")
public interface UserDTOService {

    @RequestMapping(value = "/diagnos", method = RequestMethod.GET)
    String diagnos(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    UserDTO get(@RequestParam(value = "id") String id);

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    List<UserDTO> list();

    @RequestMapping(value = "/count", method = RequestMethod.GET)
    long count();
}