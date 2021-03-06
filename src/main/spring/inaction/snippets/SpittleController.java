package com.habuma.spitter.mvc;

import com.habuma.spitter.service.SpitterService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
@RequestMapping("/spittles") //<co id="co_spittlesRequestMapping"/> 
public class SpittleController {
    private SpitterService spitterService;

    @Inject
    public SpittleController(SpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET) //<co id="co_requestMapping_getSpittleMethod"/>
    public String getSpittle(@PathVariable("id") long id,
                             Model model) {
        model.addAttribute(spitterService.getSpittleById(id));
        return "spittles/view";
    }
}
