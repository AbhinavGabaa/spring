package com.abhinav.SpringJDBC.repo;

import com.abhinav.SpringJDBC.model.Alien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlienRepository {
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }
    @Autowired
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Alien alien){
        String sql = " insert into alien(id, name tech) value(?,?,?)";
        template.update(sql,alien.getId(),alien.getName(), alien.getTech());

    }
    public List<Alien> findAll(){
        return new ArrayList<Alien>();
    }
}
