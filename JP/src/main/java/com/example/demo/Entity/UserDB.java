package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class UserDB {
    @Id
    @Column(nullable = false, unique = true)
    private Long id;
    @Column
    private String name;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String teams;

    Date regDate;

    public void setRegDate(Date date) {
        regDate = date;
    }
    public Long getId(){
        return id;
    }
}
