package com.qac.services;

import javax.annotation.ManagedBean;
import javax.enterprise.context.ApplicationScoped;

@ManagedBean(value = "carousel")
@ApplicationScoped
public class CarouselService {
	 
    private final static String[] headers;
     
    private final static String[] descriptions;
    
    static {
        headers = new String[10];
        headers[0] = "Pre- Porousware!";
        headers[1] = "Which Gnome are you?";
        headers[2] = "New Gnomes Winter Collection";
         
        descriptions = new String[10];
        descriptions[0] = "Porousware now on demand!";
        descriptions[1] = "Take this quiz to find out which gnome are you!";
        descriptions[2] = "The eagerly awaited winter collection is finally in.";
    }
}
