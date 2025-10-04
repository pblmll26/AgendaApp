// src/org/ulpgc/is1/model/Group.java
package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
    private String name;
    private final List<Contact> contacts = new ArrayList<>();

    public Group(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    // Firmas según el diagrama (implementación mínima)
    public void addContact(Contact contact) {
        if (contact != null && !contacts.contains(contact)) contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> getContacts() {
        return Collections.unmodifiableList(contacts);
    }
}

