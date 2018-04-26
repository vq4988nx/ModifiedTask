package com.jeff.hellowdb.model;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String dayt;

    private String amount;

    private String description;

    private String category;

    public Task(String dayt, String amount, String description, String category) {
        this.dayt = dayt;
        this.amount = amount;
        this.description = description;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", dayt='" + dayt + '\'' +
                ", amount='" + amount + '\'' +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    public String getDayt() {
        return dayt;
    }


    public void setDayt(String dayt) {
        this.dayt = dayt;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    //    private boolean urgent;

//    This is the constructor for the task object
//    public Task(String text, boolean urgent) {
//        this.text = text;
//        this.urgent = urgent;
//    }

//    These are the getters and setters for the task object
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
//
//    public boolean isUrgent() {
//        return urgent;
//    }
//
//    public void setUrgent(boolean urgent) {
//        this.urgent = urgent;
//    }

    public Task() {}


}