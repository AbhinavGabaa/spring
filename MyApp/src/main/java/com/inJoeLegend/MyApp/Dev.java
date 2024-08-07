package com.inJoeLegend.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
@Autowired
    private Computer comp;
    public void build()
    {
        System.out.println("Working on Spring boot");
        comp.compile();
    }

}
