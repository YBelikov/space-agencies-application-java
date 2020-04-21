package com.ybelikov.spaceagencies.domain;
import  java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity

public class Agency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String name;
    private Date establishmentDate;

    @OneToMany(mappedBy = "agency")
    private Set<Program> programs;

    public Agency() {}


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
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


}
