package com.ybelikov.spaceagencies.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Crew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numberOfMembers;
    @OneToMany
    private Set<Astronaut> astronauts;
    @OneToOne
    private Mission mission;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberOfMembers() {
        return numberOfMembers;
    }

    public void setNumberOfMembers(int numberOfMembers) {
        this.numberOfMembers = numberOfMembers;
    }

    public Set<Astronaut> getAstronauts() {
        return astronauts;
    }

    public void setAstronauts(Set<Astronaut> astronauts) {
        this.astronauts = astronauts;
    }

    public Mission getMission() {
        return mission;
    }

    public void setMission(Mission mission) {
        this.mission = mission;
    }


}
