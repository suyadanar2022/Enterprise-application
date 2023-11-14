package edu.mum.cs544;

import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "teachers")
public class Teachers {

  @Id
  @Column(name = "id", nullable = false)
  private Integer id;
  @Column(name = "name", nullable = true)
  private String name;
}