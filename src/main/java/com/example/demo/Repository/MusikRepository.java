package com.example.demo.Repository;

// MusikRepository.java
import com.example.demo.Model.MusikData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MusikRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;
    public List<MusikData> getMusikData() {
        String sql = "SELECT * FROM MusikData";
        RowMapper<MusikData> rowMapper = new BeanPropertyRowMapper<>(MusikData.class);

        return jdbcTemplate.query(sql,rowMapper);
    }
/*
    public int getMinYear(){
        String sql = "SELECT MIN(year) FROM music.data";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    public int getMaxYear(){
        String sql = "SELECT MAX(year) FROM music.data";
        return jdbcTemplate.queryForObject(sql,Integer.class);
    }

    public double getAvgYear(){
        String sql = "SELECT AVG(year) FROM music.data";
        return jdbcTemplate.queryForObject(sql, Double.class);
    }*/


}

