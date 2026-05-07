package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;     

@Entity   
@Data
public class Orders {              

    @Id   
    @GeneratedValue(strategy = GenerationType.IDENTITY)         
    private Long id;

    @ManyToOne
    private User user;

    private double totalAmount;

    public Long getId() {    
        return id;
    } 

    public void setId(Long id) {
        this.id = id;  
    }

    public User getUser() {
        return user;  
    }

    public void setUser(User user) {
        this.user = user;
    }    

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}