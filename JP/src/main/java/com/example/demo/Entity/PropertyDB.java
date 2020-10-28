package com.example.demo.Entity;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class PropertyDB {
    @Id
    @Column
    private Long id;
    @Column
    private String team;
    @Column
    private String s_date;
    @Column
    private String f_date;
    @Column
    private String title;
    @Column
    private String contents;
    @Column
    private String date;
    @Column
    private Long index;
}
