package com.tnsif.tasks;

//Hospital management system

class Patient {
    int id;
    String name;
    String disease;

    Patient(int id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    void display() {
        System.out.println(id + " " + name + " " + disease);
    }
}

public class Hospital {
    public static void main(String[] args) {

        Patient p1 = new Patient(1, "Ashu", "Fever");
        Patient p2 = new Patient(2, "Ravi", "Cold");

        p1.display();
        p2.display();

        
        
    }
}