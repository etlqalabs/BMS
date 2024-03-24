package dev.hetu.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "ACTOR")
public class Actor extends BaseModel{
private String name;
@ManyToMany
private List<Movie> movies;
}