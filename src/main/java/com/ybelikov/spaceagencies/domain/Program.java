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

    @ManyToMany
    private Set<Agency> agencies;

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

    public Set<Agency> getAgencies_programs() {
        return agencies;
    }

    public void setAgencies_programs(Set<Agency> agencies) {
        this.agencies = agencies;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

}
