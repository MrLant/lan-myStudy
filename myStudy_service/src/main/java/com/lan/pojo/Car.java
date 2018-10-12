package com.lan.pojo;



import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class Car implements Serializable {

    private Integer id;

    private String car_no;

    private String name;

    private Date ctime;

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getCar_no() {
//        return car_no;
//    }
//
//    public void setCar_no(String car_no) {
//        this.car_no = car_no;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Date getCtime() {
//        return ctime;
//    }
//
//    public void setCtime(Date ctime) {
//        this.ctime = ctime;
//    }
}
