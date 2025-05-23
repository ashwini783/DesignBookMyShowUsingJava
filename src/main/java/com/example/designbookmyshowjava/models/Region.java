package com.example.designbookmyshowjava.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Setter
@Getter
@Entity
public class Region extends BaseModel {
    private String name;
    @OneToMany
    @JoinColumn(name="region_id")
    private List<Theatre> theatreList;
}
