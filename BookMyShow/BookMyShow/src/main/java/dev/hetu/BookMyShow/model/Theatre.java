package dev.hetu.BookMyShow.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import jakarta.persistence.OneToMany;

import java.util.List;


public class Theatre extends BaseModel {
    private String name;
    private String address;
    @OneToMany
    private List<Auditorium> auditoriums;

}
