package eugenehenneberry.cs.lewisu.finalproject;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import eugenehenneberry.cs.lewisu.finalproject1.R;

public class DetailActivity extends AppCompatActivity {

    // Variable Declaration.
    private Password password;
    private EditText nameField;
    private EditText websiteField;
    private EditText emailField;
    private EditText passField;
    private Spinner passCategory;
    private Button saveButton;
    private Button genBtn;
    private String userId;
    private String reference;
    private FirebaseDatabase mFirebaseDatabase;
    private DatabaseReference mDatabaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // Locates the name field and starts the Listener.
        nameField = findViewById(R.id.name_editText);
        nameField.addTextChangedListener(new NameListener());

        // Locates the name field and starts the Listener.
        websiteField = findViewById(R.id.website_editText);
        websiteField.addTextChangedListener(new WebsiteListener());

        // Locates the name field and starts the Listener.
        emailField = findViewById(R.id.email_textEdit);
        emailField.addTextChangedListener(new EmailListener());

        // Locates the name field and starts the Listener.
        passField = findViewById(R.id.password_editText);
        passField.addTextChangedListener(new PasswordListener());

        // Locates the name field and starts the Listener.
        passCategory = findViewById(R.id.password_category);
        passCategory.setOnItemSelectedListener(new CategorySelection());

        // Locates the name field and starts the Listener.
        saveButton = findViewById(R.id.save_button);
        saveButton.setOnClickListener(new SaveButtonClick());

        userId = getIntent().getStringExtra("uid");

        password = new Password(userId);

        mFirebaseDatabase = FirebaseDatabase.getInstance();
        reference = getIntent().getStringExtra("reference");

        if (reference != null){
            mDatabaseReference = mFirebaseDatabase.getReference().child("password").child(reference);
            ValueEventListener passwordListener = new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    password = snapshot.getValue(Password.class);
                    setUi();
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {

                }
            };
            mDatabaseReference.addValueEventListener(passwordListener);
        }else {
            saveButton.setOnClickListener(new SaveButtonClick());
            mFirebaseDatabase = FirebaseDatabase.getInstance();
            mDatabaseReference = mFirebaseDatabase.getReference("password");
        }
    }



    // Creates a listener for when text is entered into the edit text.
    private class NameListener implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            password.setPassName(s.toString());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    // Creates a listener for when text is entered into the edit text.
    private class WebsiteListener implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            password.setPassUrl(s.toString());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    // Creates a listener for when text is entered into the edit text.
    private class EmailListener implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            password.setPassLogin(s.toString());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    // Creates a listener for when text is entered into the edit text.
    private class PasswordListener implements TextWatcher{

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

            password.setPassword(s.toString());

        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    // Creates the listener when a selection is made in the spinner.
    private class CategorySelection implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            if (password != null)
                password.setPassCategory(position);

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
    // Creates the onClick listener for the save button
    private class SaveButtonClick implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            mDatabaseReference.push().setValue(password);
            finish();
        }
    }
    // Onclick listener when a password entry is updated.
    private class SaveButtonClickUpdate implements View.OnClickListener{

        @Override
        public void onClick(View v) {

            mDatabaseReference.setValue(password);
            finish();

        }
    }

    // Sets all the information for the UI
    private void setUi(){
        if (password != null){
            nameField.setText(password.getPassName());
            websiteField.setText(password.getPassUrl());
            emailField.setText(password.getPassLogin());
            passField.setText(password.getPassword());
            passCategory.setSelection(password.getPassCategory());
            saveButton.setText(R.string.update);
            saveButton.setOnClickListener(new SaveButtonClickUpdate());

        }
    }

    // Creates the Delete option.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.delete_menu, menu);
        return true;
    }

    // Sets what happens if the delete option is selected.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.delete){
            mDatabaseReference.removeValue();
            finish();
        }else{
            return super.onOptionsItemSelected(item);
        }
        return true;

    }


}
