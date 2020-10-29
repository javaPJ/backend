package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Property")
public class PropertyDB {
    @Id
    @Column
    private Long id;
    @Column(nullable = false, unique = true, length = 30)
    private String team;
    @Column(nullable = false, unique = true, length = 50)
    private String s_date;
    @Column(nullable = false, unique = true, length = 50)
    private String f_date;
    @Column(nullable = false, unique = true, length = 30)
    private String title;
    @Column(nullable = false, unique = true, length = 30)
    private String contents;
    @Column(nullable = false, unique = true, length = 30)
    private String date;
    @Column
    private Long index;
}
