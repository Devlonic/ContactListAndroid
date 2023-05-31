package edu.itstep.a04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import edu.itstep.a04.databinding.ActivityFullInfoBinding;

public class FullInfoActivity extends AppCompatActivity {
    private ActivityFullInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFullInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Contact contact = (Contact) getIntent().getSerializableExtra("contact");

        binding.ivLogo.setImageResource(contact.getAvatar());
        binding.etFirstName.setText(contact.getFirstName());
        binding.etLastName.setText(contact.getLastName());
        binding.etEmail.setText(contact.getEmail());
        binding.etPhone.setText(contact.getPhone());
    }
}