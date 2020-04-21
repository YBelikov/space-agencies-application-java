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
    private boolean isRobotic;

    @OneToOne
    private Crew crew;

    @ManyToOne
    private Program program;

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

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public boolean isRobotic() {
        return isRobotic;
    }

    public void setRobotic(boolean robotic) {
        isRobotic = robotic;
    }

    public Crew getCrew() {
        return crew;
    }

    public void setCrew(Crew crew) {
        this.crew = crew;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}
