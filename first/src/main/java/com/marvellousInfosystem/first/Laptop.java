package com.marvellousInfosystem.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Laptop
{
    @GetMapping("/LaptopDetails")
    public String DisplayLaptopDetails()
    {
        return "Its core 17 2nd Gen Laptop";
    }
}
