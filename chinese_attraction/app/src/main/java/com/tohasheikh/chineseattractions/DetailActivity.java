package com.tohasheikh.chineseattractions;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes3.dex */
public class DetailActivity extends AppCompatActivity {
    private Button backButton;
    private String description;
    private int imageResId;
    private TextView itemDescription;
    private ImageView itemImage;
    private RatingBar ratingBar;
    private String title;
    private TextView topBar;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        this.itemImage = (ImageView) findViewById(R.id.itemImage);
        this.topBar = (TextView) findViewById(R.id.topBar);
        this.itemDescription = (TextView) findViewById(R.id.itemDescription);
        this.backButton = (Button) findViewById(R.id.backButton);
        this.ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        Intent intent = getIntent();
        if (intent != null) {
            this.title = intent.getStringExtra("title");
            this.description = intent.getStringExtra("description");
            this.imageResId = intent.getIntExtra("imageResId", 0);
        }
        this.itemImage.setImageResource(this.imageResId);
        this.topBar.setText(this.title);
        this.itemDescription.setText(this.description);
        this.backButton.setOnClickListener(new View.OnClickListener() { // from class: com.tohasheikh.chineseattractions.DetailActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                DetailActivity.this.onBackPressed();
            }
        });
        float rating = getRatingFromSharedPreferences(this.title);
        this.ratingBar.setRating(rating);
        this.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() { // from class: com.tohasheikh.chineseattractions.DetailActivity.2
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public void onRatingChanged(RatingBar ratingBar, float rating2, boolean fromUser) {
                DetailActivity detailActivity = DetailActivity.this;
                detailActivity.saveRatingToSharedPreferences(detailActivity.title, rating2);
            }
        });
    }

    private float getRatingFromSharedPreferences(String title) {
        SharedPreferences sharedPreferences = getSharedPreferences("ratings", 0);
        return sharedPreferences.getFloat(title, 0.0f);
    }

    public void saveRatingToSharedPreferences(String title, float rating) {
        SharedPreferences sharedPreferences = getSharedPreferences("ratings", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat(title, rating);
        editor.apply();
    }
}
