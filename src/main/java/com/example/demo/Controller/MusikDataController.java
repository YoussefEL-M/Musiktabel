package com.example.demo.Controller;

// MusikDataController.java
import com.example.demo.Repository.MusikRepository;
import com.example.demo.Service.MusikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusikDataController {

    @Autowired
    MusikService musikService;

    @GetMapping("/musikdata")
    public String getMusikData(Model model) {
        model.addAttribute("musikDataList", musikService.getAll());
        return "musikdata";
    }
}

