package com.fangxing.pcgame.controller;

import com.fangxing.pcgame.dao.PersonRepository;
import com.fangxing.pcgame.entity.Person;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class PCGameController {

    @Autowired
    private PersonRepository personRepository;

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById (@PathVariable(value = "id") Integer id){

        Optional<Person> result= personRepository.findById(0L);

        Person person=new Person();
        person.setAddress("add");
        person.setName("name");
        Object obj= personRepository.save(person);

        return "hello world";
    }


    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/sendMail", method = RequestMethod.GET)
    public String sendMail (){


        return "hello world";

    }

}
