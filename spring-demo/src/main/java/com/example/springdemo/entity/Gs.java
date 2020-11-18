package com.example.springdemo.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Gs {
    @Id
    private Integer id;
    private String gsname;
    private String gssheng;
    private String gsdz;
    private String gsgw;
    private String gsxz;
}
