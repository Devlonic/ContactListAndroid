package edu.itstep.a04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvContacts;
    private List<Contact> contacts;
    private ContactAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvContacts = findViewById(R.id.lvContacts);
        contacts = ContactStorage.getAllContacts();
        adapter = new ContactAdapter(this, R.layout.item_contact, contacts);
        lvContacts.setAdapter(adapter);
        lvContacts.setOnItemClickListener(this::showFullInfoContact);
        lvContacts.setOnItemLongClickListener(this::deleteContact);

        Intent i = getIntent();
        if(i.getSerializableExtra("contact") != null) {
            Contact contact = (Contact) getIntent().getSerializableExtra("contact");
            int position = (int)getIntent().getSerializableExtra("position");
            Contact contactToEdit = contacts.get(position);

            contactToEdit.setEmail(contact.getEmail());
            contactToEdit.setFirstName(contact.getFirstName());
            contactToEdit.setLastName(contact.getLastName());
            contactToEdit.setPhone(contact.getPhone());

            adapter.notifyDataSetChanged();
            Toast.makeText(this, "edited", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean deleteContact(AdapterView<?> adapterView, View view, int position, long l) {
        contacts.remove(position);
        adapter.notifyDataSetChanged();
        Toast.makeText(this, "deleted", Toast.LENGTH_SHORT).show();
        return true;
    }

    private void showFullInfoContact(AdapterView<?> adapterView, View view, int position, long id) {
        Contact contact = contacts.get(position);
        Intent intent = new Intent(this, FullInfoActivity.class);
        intent.putExtra("contact", contact);
        intent.putExtra("position", position);
        startActivity(intent);
    }
}