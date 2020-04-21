package com.ybelikov.spaceagencies.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Mission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Date start;
    private Date end;

    @OneToOne
    private Crew crew;

    @ManyToOne
    private Program program;

}
