package com.spring.microservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@ApiModel(description = "About User model fields")
@Entity(name = "user")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class User {
    @Id
    @GeneratedValue
    private Integer user_id;

    @Size(min = 2, message = "Name should have at least 2 chars")
    @ApiModelProperty(notes = "Name should have at least 2 chars")
    private String user_name;

    private Date birth_date;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User() {
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public User(Integer id, String name, Date birth_date) {
        this.user_id = id;
        this.user_name = name;
        this.birth_date = birth_date;
    }

    public Integer getId() {
        return user_id;
    }

    public void setId(Integer id) {
        this.user_id = id;
    }

    public String getName() {
        return user_name;
    }

    public void setName(String name) {
        this.user_name = name;
    }

    public Date getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(Date birthDate) {
        this.birth_date = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", birth_date=" + birth_date +
                ", posts=" + posts +
                '}';
    }
}
