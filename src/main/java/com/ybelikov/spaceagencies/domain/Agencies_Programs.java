package com.ybelikov.spaceagencies.domain;

import javax.persistence.*;

@Entity

public class Agencies_Programs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Agency agency;
    private Program program
}
