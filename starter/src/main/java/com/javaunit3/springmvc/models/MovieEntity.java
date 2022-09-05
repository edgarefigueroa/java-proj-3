package com.javaunit3.springmvc.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies")
public class MovieEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_Id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "maturity_Rating")
    private String maturityRating;

    @Column(name = "genre")
    private String genre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "movie_id")
    private List<VoteEntity> votes;

    public List<VoteEntity> getVotes()
    {
        return votes;
    }

    public void setVotes(List<VoteEntity> votes)
    {
        this.votes = votes;
    }

    public void addVote(VoteEntity vote)
    {
        this.votes.add(vote);
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getMaturityRating()
    {
        return maturityRating;
    }

    public void setMaturityRating(String maturityRating)
    {
        this.maturityRating = maturityRating;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }
}
