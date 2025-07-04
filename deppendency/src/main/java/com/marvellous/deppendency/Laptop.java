package com.marvellous.deppendency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    //Field Injection
    @Autowired
    Harddisk hobj;
    @Autowired
    RAM robj;

    @GetMapping("/LaptopDetails")
    public String LaptopInformation()
    {
        String h = hobj.GetHarddisk();
        String r = robj.GetRAM();

        String data = "Laptop Configuration : "+h+ "&" +r;

        return data;
    }
}
