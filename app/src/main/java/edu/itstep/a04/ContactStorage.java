package edu.itstep.a04;

import java.util.ArrayList;
import java.util.List;

public class ContactStorage {
    private static List<Contact> contacts = new ArrayList<>();

    public static List<Contact> getAllContacts() {

        contacts.add(new Contact(R.drawable.android, "Ivan", "Ivanov", "066-666", "ivan@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Petr", "Petrov", "077-777", "petr@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Stepan", "Stepanov", "088-888", "stepan@gmail.com"));

        contacts.add(new Contact(R.drawable.android, "Ivan", "Ivanov", "066-666", "ivan@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Petr", "Petrov", "077-777", "petr@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Stepan", "Stepanov", "088-888", "stepan@gmail.com"));

        contacts.add(new Contact(R.drawable.android, "Ivan", "Ivanov", "066-666", "ivan@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Petr", "Petrov", "077-777", "petr@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Stepan", "Stepanov", "088-888", "stepan@gmail.com"));

        contacts.add(new Contact(R.drawable.android, "Ivan", "Ivanov", "066-666", "ivan@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Petr", "Petrov", "077-777", "petr@gmail.com"));
        contacts.add(new Contact(R.drawable.android, "Stepan", "Stepanov", "088-888", "stepan@gmail.com"));

        return contacts;
    }
}
