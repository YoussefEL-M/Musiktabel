package com.example.demo.Controller;

// MusikDataController.java
import com.example.demo.Model.MusikData;
import com.example.demo.Repository.MusikRepository;
import com.example.demo.Service.MusikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MusikDataController {

    @Autowired
    MusikRepository musikRepository;

    @Autowired
    MusikService musikService;

    @GetMapping("/musikdata")
    public String getMusikData(Model model) {
        model.addAttribute("musikDataList", musikService.getAll());
        model.addAttribute("minYear", musikService.getMinYear());
        model.addAttribute("maxYear", musikService.getMaxYear());
        model.addAttribute("avgYear", musikService.getAvgYear());

        return "musikdata";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }
    @PostMapping("/create")
    public String createAlbum(
            @RequestParam("artist") String artist,
            @RequestParam("origin") String origin,
            @RequestParam("genre") String genre,
            @RequestParam("albumName") String albumName,
            @RequestParam("year") int year,
            @RequestParam("songs") String songs

    ){
        //lav nyt album
        MusikData musikData= new MusikData(artist,origin,genre,albumName,year,songs);
        //gem nyt album
        musikService.create(musikData);
        return "redirect:/musikdata";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        //slet i repo
        musikService.delete(id);

        //redirect til liste
        return "redirect:/musikdata";
    }

    @GetMapping("/update/{id}")
    public String showUpdate(@PathVariable("id") int id, Model model){
        //find album i database
        MusikData musikData = musikService.findById(id);
        //tilføj album til view model
        model.addAttribute("musikDataList", musikData);
        //vis update siden
        return "update";
    }

    @PostMapping("/update")
    public String updateAlbum(
            @RequestParam("id") int id,
            @RequestParam("artist") String artist,
            @RequestParam("origin") String origin,
            @RequestParam("genre") String genre,
            @RequestParam("albumName") String albumName,
            @RequestParam("year") int year,
            @RequestParam("songs") String songs){
        //lave album
        MusikData musikData= new MusikData(id, artist,origin, genre, albumName, year, songs);

        //opdater repo
        musikService.update(musikData);

        return "redirect:/musikdata";
    }
}

