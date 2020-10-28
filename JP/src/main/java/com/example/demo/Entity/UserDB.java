package com.example.demo.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;

@Entity
@Data
public class UserDB {
    @Id
    @Column
    private Long id;
}
