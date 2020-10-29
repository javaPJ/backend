package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class TeamDB {
    @Id
    @Column
    private String name;
    @Column
    private String code;
    @Column
    private String profile;
    @Column
    private String property;
}
