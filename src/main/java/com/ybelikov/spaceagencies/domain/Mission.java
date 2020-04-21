package com.ybelikov.spaceagencies.domain;

import javax.persistence.*;

@Entity
public class Mission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @ManyToOne
    private Program program;

}
