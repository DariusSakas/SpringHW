package com.example.springhw.controller;

import com.example.springhw.model.Resident;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@AllArgsConstructor
public abstract class ResidentAbstractController {

    @GetMapping(value = "/{q:.+}")
    abstract <T extends Resident> List<T> getResidents(@PathVariable("q") String q);

}
