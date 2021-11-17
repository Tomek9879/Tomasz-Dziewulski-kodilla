package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;
import javax.persistence.*;

@NamedQuery(
        name = "Employee.LastName",
        query = "From Employee Where lastName like :lastname"
)

@Entity
@Table(name = "Employees")
public class Employee {

  private int id;
  private String firstName;
  private String lastName;
  private Company company;

  @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER )
  @JoinColumn(name = "Company_Id")
  public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee(){

  }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name ="Employee_Id",unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name="FirstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @NotNull
    @Column(name="LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
