package edu.mum.cs544;

import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "students")
public class Students {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;
  @Column(name = "name", nullable = true)
  private String name;
  @Column(name = "email", nullable = true)
  private String email;
  @Column(name = "password", nullable = true)
  private String password;

  public Students() {
  }

  public Students(Integer id, String name, String email, String password) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getPassword() {
    return password;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}