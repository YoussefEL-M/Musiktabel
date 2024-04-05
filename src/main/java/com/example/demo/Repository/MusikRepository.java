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

    public int getMinYear(){
        String sql = "SELECT MIN(year) FROM musikdata";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public int getMaxYear(){
        String sql = "SELECT MAX(year) FROM musikdata";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public double getAvgYear(){
        String sql = "SELECT ROUND(AVG(year)) FROM musikdata";
        return jdbcTemplate.queryForObject(sql, Double.class);
    }

    public void create(MusikData musikData){
        final String INSERT_SQL="INSERT INTO musikdata (artist, origin, genre, albumName, songs, year) VALUES (?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(INSERT_SQL, musikData.getArtist(), musikData.getOrigin(), musikData.getGenre(), musikData.getAlbumName(), musikData.getSongs(),musikData.getYear());
    }
    public void delete(int id){
        //slette sql
        final String DELETE_BY_ID_SQL="DELETE FROM musikdata WHERE id = ?";
        //kald af JdbcTemplate med parameter
        jdbcTemplate.update(DELETE_BY_ID_SQL,id);
    }

    public MusikData findById(int id){
        //find SQL
        final String FIND_BY_ID_SQL = "SELECT * FROM musikdata WHERE id = ?";
        //Definer en rowmapper som oversætter databaserække til album
        RowMapper<MusikData> rowMapper = new BeanPropertyRowMapper<>(MusikData.class);
        //returner query-resultat fra JdbcTemplate
        return jdbcTemplate.queryForObject(FIND_BY_ID_SQL, rowMapper, id);
    }

    public void update(MusikData musikData){
        //update sql
        final String UPDATE_SQL = "UPDATE musikdata SET artist = ?, origin = ?, genre = ?, albumName = ?, songs = ?, year = ? WHERE id = ?";
        jdbcTemplate.update(UPDATE_SQL, musikData.getArtist(), musikData.getOrigin(), musikData.getGenre(), musikData.getAlbumName(), musikData.getSongs(), musikData.getYear(), musikData.getId());
    }
}

