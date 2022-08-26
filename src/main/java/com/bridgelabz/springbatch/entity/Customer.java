package com.bridgelabz.springbatch.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table
public class Customer {
    @Id

    private Long candidateId;
    private String cicId;
    private String fullName;
    private String email;
    private String mobileNum;
    private String hireDate;
    private String degree;
    private Double aggrPer;
    private String city;
    private String state;
    private String preferredJobLocation;
    private String status;
    private String passedOutYear;
    private String creatorUser;
    private String candidateStatus;

}
