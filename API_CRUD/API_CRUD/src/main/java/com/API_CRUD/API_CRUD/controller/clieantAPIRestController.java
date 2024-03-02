package com.API_CRUD.API_CRUD.controller;

import com.API_CRUD.API_CRUD.model.clientModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clieantINFO")
public class clieantAPIRestController {
    clientModel clientModel;

    @GetMapping("{clientID}")

    public clientModel getclieantData(String clientID)
    {
        return  clientModel;
                //return ("emp01","Suraj","USA","20102010");
    }
    @PostMapping
    public String creatClient(@RequestBody clientModel clientModel){
        this.clientModel= clientModel;
        return "welcome";
    }
    @PutMapping
    public String updatecreatedClient(@RequestBody clientModel clientModel){
        this.clientModel= clientModel;
        return "update the values";
    }
    @DeleteMapping("{clientID}")
    public String deleteClient(String clientID){
        this.clientModel= null;
        return "deleted the values";
    }


}
