package com.glassbox.webinvoice.shared.entity;

import javax.persistence.*;

import com.google.gwt.user.client.rpc.IsSerializable;


/**
 * The persistent class for the role database table.
 *
 */
@Entity
@Table(name = "role")
public class Role implements IsSerializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Enumerated(value = EnumType.ORDINAL)
    private RoleType id;
    
    private String name;
    
    public Role() {
    }
    
    public RoleType getId() {
        return id;
    }
    
    public void setId(RoleType id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
}
