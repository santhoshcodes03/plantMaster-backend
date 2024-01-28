package com.keydraftproject.plant.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class DrillingInputModel {

    @Id
//    @GeneratedValue
    private Long id;
    private Date date;

    private String vendorName;

    private String plantName;

    private Long noOfHoles;

    private Long feetPerHole;

    private String drillingType;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private Double rate;

    private Long totalFeet;

    private Long total;

    private Long advance;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName;
    }

    public Long getNoOfHoles() {
        return noOfHoles;
    }

    public void setNoOfHoles(Long noOfHoles) {
        this.noOfHoles = noOfHoles;
    }

    public Long getFeetPerHole() {
        return feetPerHole;
    }

    public void setFeetPerHole(Long feetPerHole) {
        this.feetPerHole = feetPerHole;
    }

    public String getDrillingType() {
        return drillingType;
    }

    public void setDrillingType(String drillingType) {
        this.drillingType = drillingType;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Long getTotalFeet() {
        return totalFeet;
    }

    public void setTotalFeet(Long totalFeet) {
        this.totalFeet = totalFeet;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getAdvance() {
        return advance;
    }

    public void setAdvance(Long advance) {
        this.advance = advance;
    }
}
