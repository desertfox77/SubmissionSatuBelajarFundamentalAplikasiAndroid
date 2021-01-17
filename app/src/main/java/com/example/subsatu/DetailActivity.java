package com.example.subsatu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.subsatu.model.Data;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailActivity extends AppCompatActivity {
    CircleImageView avatar;
    TextView username, name, company, location, repository, follower, following;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        Data data = intent.getParcelableExtra("position");
        avatar = findViewById(R.id.Avatar);
        username = findViewById(R.id.username);
        name = findViewById(R.id.name);
        company = findViewById(R.id.company);
        location = findViewById(R.id.location);
        repository = findViewById(R.id.repository);
        follower = findViewById(R.id.follower);
        following = findViewById(R.id.following);

        if (data != null) {
            avatar.setImageResource(data.getAvatar1());
        }
        username.setText(String.format("Username: %s", data.getUsername1()));
        name.setText(String.format("Name: %s",data.getName1()));
        company.setText(String.format("Company: %s",data.getCompany1()));
        location.setText(String.format("Location: %s",data.getLocation1()));
        repository.setText(String.format("Repository: %s", data.getRepository1()));
        follower.setText(String.format("Follower: %s", data.getFollower1()));
        following.setText(String.format("Following: %s", data.getFollowing1()));



    }

    public void goBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
