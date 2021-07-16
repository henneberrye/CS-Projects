package eugenehenneberry.cs.lewisu.finalproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

import java.util.Arrays;

import eugenehenneberry.cs.lewisu.finalproject1.R;

public class MainActivity extends AppCompatActivity implements PasswordAdapter.PasswordAdapterOnClickHandler {

    // Variable Declaration.
    private final static int LOGIN = 1;
    private PasswordAdapter mPasswordAdapter;
    private FirebaseDatabase mDatabase;
    private Query mQuery;
    private RecyclerView mRecyclerView;
    private FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mFireAuthListener;
    private String mUserId;
    private FirebaseRecyclerAdapter<Password, PasswordAdapter.PassHolder> mListAdapter;
    private Object mSharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        //Finds and sets the RecyclerView
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Finds, sets, and tell the floating action button where to point to.
        FloatingActionButton floatingActionButton = findViewById(R.id.fab);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("uid", mUserId);
                startActivity(intent);
            }
        });

        mSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);


        // Initializes Firebase.
        FirebaseApp.initializeApp(this);
        mFirebaseAuth = FirebaseAuth.getInstance();

        // Loop to see if the person logging in is a new user.
        FirebaseUser newUser = mFirebaseAuth.getCurrentUser();
        if (newUser != null) {
            mUserId = newUser.getUid();
        }

        // Sets the Password Adapter.
        setPasswordAdapter();

         // Checks to see if the user is a new user if they are not
        // directs the user to log in.
        mFireAuthListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {

                FirebaseUser newUser = firebaseAuth.getCurrentUser();
                if (newUser != null) {
                    mUserId = newUser.getUid();
                } else {
                    startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder()
                            .setIsSmartLockEnabled(false)
                            .setTheme(R.style.Theme_FinalProject1)
                            .setAvailableProviders(Arrays.asList(
                                    new AuthUI.IdpConfig.EmailBuilder().build()))
                            .build(), LOGIN);
                }
            }
        };

    }

    @Override
    public void onClick(int position) {
        Intent detailIntent = new Intent(this, DetailActivity.class);
        detailIntent.putExtra("uid", mUserId);
        DatabaseReference reference = mPasswordAdapter.getRef(position);
        String id = reference.getKey();
        detailIntent.putExtra("reference", id);
        startActivity(detailIntent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mFirebaseAuth.addAuthStateListener(mFireAuthListener);
        mPasswordAdapter.startListening();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mFirebaseAuth.removeAuthStateListener(mFireAuthListener);
        mPasswordAdapter.stopListening();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_options, menu);
        getMenuInflater().inflate(R.menu.sign_out_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.sign_out) {
            AuthUI.getInstance().signOut(this);
            return true;
        } else if (item.getItemId() == R.id.new_settings) {
            Intent startSettings = new Intent(this, SettingsActivity.class);
            startActivity(startSettings);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == LOGIN) {
            if (requestCode == RESULT_OK) {
                FirebaseUser newUser = mFirebaseAuth.getCurrentUser();
                if (newUser != null) {
                    mUserId = newUser.getUid();
                    setPasswordAdapter();
                }
            }
            if (resultCode == RESULT_CANCELED) {
                finish();
            }
        }
    }

    private void setPasswordAdapter() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        Query newQuery = firebaseDatabase.getReference().child("password").orderByChild("uid").equalTo(mUserId);
        FirebaseRecyclerOptions<Password> options = new FirebaseRecyclerOptions.Builder<Password>()
                .setQuery(newQuery, Password.class).build();
        mPasswordAdapter = new PasswordAdapter(options, this);
        mRecyclerView.setAdapter(mPasswordAdapter);

    }
}


