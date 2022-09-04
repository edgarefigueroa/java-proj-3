package com.javaunit3.springmvc;

import javax.persistence.*;

@Entity
@Table(name="votes")
public class VoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "voter_name")
    private String voterName;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setVoterName(String voterName) {
        this.voterName = voterName;
    }

    public String getVoterName() {
        return voterName;
    }
}
