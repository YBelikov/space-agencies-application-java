package com.ybelikov.spaceagencies.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Crew {
    @Id
    private long id;
    private int numberOfMembers;
    @OneToOne
    private Mission mission;
}
