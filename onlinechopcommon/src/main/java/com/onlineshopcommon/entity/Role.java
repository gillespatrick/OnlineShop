package com.onlineshopcommon.entity;

import java.util.Objects;
import javax.persistence.*;


/**
 *
 * @author gilles
 */
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length = 40, nullable = false, unique = true)
    private String name;
    
    @Column(length = 150)
    private String description;

    public Role() {
    }

    public Role( String name, String description) {
       
        this.name = name;
        this.description = description;
    }

    public Role(Integer id) {
        this.id = id;
    }
    
    
    
    

    @Override
    public String toString() {
        return this.name;
    }
    
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Role other = (Role) obj;
        return Objects.equals(this.id, other.id);
    }
    
    

}
