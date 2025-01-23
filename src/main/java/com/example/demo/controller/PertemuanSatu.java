package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PertemuanSatu {

    @GetMapping("/hello")
    public String sayHello(){
        return "Halo nama saya Muhammad Farhan Rosidi\n" +
                "Umur saya 23 tahun\n" +
                "Saya Pria\n" +
                "Asal Surabaya\n" +
                "Motivasi saya mengikuti bootcamp adalah ingin mendapatkan pekerjaan remote dan menjadi mentor di pinus pintar";
    }
}