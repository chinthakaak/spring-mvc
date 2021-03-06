package com.examples.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ka40215 on 11/13/15.
 */
@Controller
public class AuctionController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC Hello World");
        return "hello";

    }

    @RequestMapping(value = "/home/{name:.+}", method = RequestMethod.GET)
    public ModelAndView home(@PathVariable("name") String name) {

        ModelAndView model = new ModelAndView();
        model.setViewName("home");
        model.addObject("msg", name);

        return model;

    }
}
