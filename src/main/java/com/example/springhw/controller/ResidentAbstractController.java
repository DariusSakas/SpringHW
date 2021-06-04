package com.example.springhw.controller;

import com.example.springhw.model.Owner;
import com.example.springhw.model.Resident;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
//@RequestMapping("/api")
/**
 * Kodel extendinant abstract class, neextendinasi "/api" @RequestMapping ir adresas lieka be jo?
 */
public abstract class ResidentAbstractController {

    @GetMapping(value = "/{pathVariable:.+}")
    public abstract List<? extends Resident> getResidents(@PathVariable("pathVariable") String pathVariable);

}
