/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.shared.model;

import com.google.gwt.view.client.ProvidesKey;
import java.util.Date;

/**
 *
 * @author msushil
 */
public class ClientInfo implements Comparable<ClientInfo> {
    
    private static int nextId = 0;
    private String address;
    private int age;
    private Date birthday;
    private String firstName;
    private final int id;
    private String lastName;
    
    public ClientInfo() {
      this.id = nextId;
      nextId++;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        ClientInfo.nextId = nextId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    /**
     * The key provider that provides the unique ID of a contact.
     */
    public static final ProvidesKey<ClientInfo> KEY_PROVIDER = new ProvidesKey<ClientInfo>() {
        @Override
        public Object getKey(ClientInfo item) {
            return item == null ? null : item.getId();
        }
    };
    
    public int compareTo(ClientInfo o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        /**
     * @return the unique ID of the contact
     */
    public int getId() {
      return this.id;
    }
    
}
