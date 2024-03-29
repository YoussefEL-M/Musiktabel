package com.example.demo.Service;

import com.example.demo.Model.MusikData;
import com.example.demo.Repository.MusikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusikService {
    @Autowired
    MusikRepository musikRepository;

    public List<MusikData> getAll() {
        return musikRepository.getMusikData();
    }

}
