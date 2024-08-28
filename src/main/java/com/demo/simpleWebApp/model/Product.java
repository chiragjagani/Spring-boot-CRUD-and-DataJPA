package com.demo.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;


@Data
@Component
@Entity
public class Product {

    @Id
    private int pid;
    private String pname;
    private int pprice;

    public Product() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Product(int pid, String pname, int pprice) {
        this.pid = pid;
        this.pname = pname;
        this.pprice = pprice;
    }
}
