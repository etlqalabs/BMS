package dev.hetu.BookMyShow.model;

import jakarta.persistence.OneToMany;

import java.util.List;

public class City extends BaseModel{
    private String name;
    @OneToMany
    private List<Theatre> theatres;
}
