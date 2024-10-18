package org.example.model;

import java.util.UUID;

public class Reader {
    private UUID id;
    private String name;
    private String surname;
    private String phone;

    public Reader() {
        this.id = UUID.randomUUID();
    }

    public Reader(String name, String surname, String phone) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
