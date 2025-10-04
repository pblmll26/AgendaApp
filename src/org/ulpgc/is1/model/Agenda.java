// src/org/ulpgc/is1/model/Agenda.java
package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {
    private final List<Contact> contactList = new ArrayList<>();
    private final List<Group> groupList = new ArrayList<>();

    // Firmas según el diagrama (implementación mínima)
    public void addPerson(Person person) {
        if (person != null && !contactList.contains(person)) contactList.add(person);
    }

    public void addCompany(Company company) {
        if (company != null && !contactList.contains(company)) contactList.add(company);
    }

    public void addGroup(Group group) {
        if (group != null && !groupList.contains(group)) groupList.add(group);
    }

    public List<Contact> getContactList() {
        return Collections.unmodifiableList(contactList);
    }

    public List<Group> getGroupList() {
        return Collections.unmodifiableList(groupList);
    }
}
