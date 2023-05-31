package edu.itstep.a04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;

import edu.itstep.a04.databinding.ActivityFullInfoBinding;

public class FullInfoActivity extends AppCompatActivity {
    private ActivityFullInfoBinding binding;
    private Button btnApply;

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

        btnApply = (Button)findViewById(R.id.btnApply);
        btnApply.setOnClickListener(this::onApplyHandler);
    }

    private void onApplyHandler(View view) {
        Toast.makeText(this, "position = " + getIntent().getSerializableExtra("position"), Toast.LENGTH_SHORT).show();

        String fname = binding.etFirstName.getText().toString();
        String lname = binding.etLastName.getText().toString();
        String email = binding.etEmail.getText().toString();
        String phone = binding.etPhone.getText().toString();

        Contact contact = new Contact(-1,fname, lname, email, phone);
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("contact", contact);
        intent.putExtra("position", getIntent().getSerializableExtra("position"));
        startActivity(intent);
    }
}