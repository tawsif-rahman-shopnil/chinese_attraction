package com.tohasheikh.chineseattractions;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;

/* loaded from: classes3.dex */
public class LandingActivity extends AppCompatActivity {
    private TextView appTitle;
    private ImageView backgroundImage;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        this.backgroundImage = (ImageView) findViewById(R.id.backgroundImage);
        this.appTitle = (TextView) findViewById(R.id.appTitle);
        this.backgroundImage.setOnClickListener(new View.OnClickListener() { // from class: com.tohasheikh.chineseattractions.LandingActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                LandingActivity.this.openListPage();
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: com.tohasheikh.chineseattractions.LandingActivity.2
            @Override // java.lang.Runnable
            public void run() {
                LandingActivity.this.openListPage();
            }
        }, (long) PathInterpolatorCompat.MAX_NUM_POINTS);
    }

    public void openListPage() {
        Intent intent = new Intent(this, ItemLayoutActivity.class);
        startActivity(intent);
        finish();
    }
}
