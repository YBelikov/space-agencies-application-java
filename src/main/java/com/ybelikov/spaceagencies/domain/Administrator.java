package com.ybelikov.spaceagencies.domain;

import javax.persistence.*;

@Entity

public class Administrator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;

    @OneToOne
    private Agency agency;
}
