package com.ybelikov.spaceagencies.domain;
import  java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity

public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private Date establishmentDate;
    @ManyToMany
    private Set<Program> programs;

    @OneToOne
    private Administrator administrator;

    public Agency() {}


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public Set<Program> getPrograms() {
        return programs;
    }

    public void setPrograms(Set<Program> programs) {
        this.programs = programs;
    }
}
