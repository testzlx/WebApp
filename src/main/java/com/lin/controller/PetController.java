package com.lin.controller;

import com.lin.domain.Pet;
import com.lin.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhanglinxing on 2018/5/12.
 */
@Controller
public class PetController {

    @Resource
    private PetService petService;

    @RequestMapping("/my")
    public String getIndex(Model model,@RequestParam("name")String name){
       // ModelAndView mav = new ModelAndView("my");
        List<Pet> pets = petService.selectPetByName(name);
        //mav.addObject("pet", pets.get(0));
        model.addAttribute("pet",pets.get(0));
        return "my";
    }
}
