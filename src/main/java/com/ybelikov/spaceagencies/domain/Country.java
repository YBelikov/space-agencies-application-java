package com.ybelikov.spaceagencies.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double area;
    private String mainland;

    @OneToMany
    private Set<Astronaut> astronauts;

    @OneToOne
    private Agency agency;


}
