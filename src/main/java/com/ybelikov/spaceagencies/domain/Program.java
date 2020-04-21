package com.ybelikov.spaceagencies.domain;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Program {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String target;
    private Date startDate;

    @OneToMany(mappedBy = "program")
    private Set<Agencies_Programs> agencies_programs;

    @OneToMany(mappedBy = "program")
    private Set<Mission> missions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Mission> getMissions() {
        return missions;
    }

    public void setMissions(Set<Mission> missions) {
        this.missions = missions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public Set<Agencies_Programs> getAgencies_programs() {
        return agencies_programs;
    }

    public void setAgencies_programs(Set<Agencies_Programs> agencies_programs) {
        this.agencies_programs = agencies_programs;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
