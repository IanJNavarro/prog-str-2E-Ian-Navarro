package com.example.practicaexamen.model;

public class Contacto {
    private String name;
    private String phone;
    private String parent;

    public Contacto() {

    }

    public Contacto(String name, String phone, String parent) {
        this.name = name;
        this.phone = phone;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contacto: ");
        sb.append(name);
        sb.append(", Telefono: ").append(phone);
        sb.append(", Parentesco: ").append(parent);
        return sb.toString();
    }
}
