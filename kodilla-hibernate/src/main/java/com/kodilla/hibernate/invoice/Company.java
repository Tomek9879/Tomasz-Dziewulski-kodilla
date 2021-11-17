package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;

@NamedNativeQuery(
        name ="Company.SerchCompany",
        query="Select * From Companies where left(Company_Name,3) like :ssds",
        resultClass=Company.class
)
//@NamedQuery(
//  name = "Company.SerchCompany",
//  query = " From Company where id>316"
//)
@Entity
@Table(name="Companies")
public final class Company {

    private int id;
    private String name;

    public Company(){

    }

    public Company( String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="Company_Id",unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name="Company_Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
