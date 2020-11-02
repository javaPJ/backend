package com.example.demo.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class PropertyDB {
    @Id
    @GeneratedValue
    @Column(nullable = false, unique = true)
    private Long idx;
    @Column
    private String title;
    @Column
    private String contents;
    @Column
    private String s_date;
    @Column
    private String f_date;
    @Column
    private String color;
    @Column
    private String c_date;
}
