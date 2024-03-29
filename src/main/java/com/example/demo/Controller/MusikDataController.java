package com.example.demo.Controller;

// MusikDataController.java
import com.example.demo.Repository.MusikRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MusikDataController {

    private final MusikRepository musikRepository;

    public MusikDataController(MusikRepository musikRepository) {
        this.musikRepository = musikRepository;
    }

    @GetMapping("/musikdata")
    public String getMusikData(Model model) {
        model.addAttribute("musikDataList", musikRepository.getMusikData());
        return "musikdata";
    }
}

