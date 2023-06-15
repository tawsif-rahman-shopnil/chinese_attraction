package com.tohasheikh.chineseattractions;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes3.dex */
public class ItemLayoutActivity extends AppCompatActivity {
    private LinearLayout itemContainer;
    private ScrollView scrollView;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        this.scrollView = (ScrollView) findViewById(R.id.scrollView);
        this.itemContainer = (LinearLayout) findViewById(R.id.itemContainer);
        addItem("The Great Wall of China", "Stretching over 13,000 miles across China, the Great Wall is not merely a testament to architectural prowess but a symbol of China's enduring spirit.", R.drawable.it1, R.drawable.it1);
        addItem("The Forbidden City", "Located in the heart of Beijing, the Forbidden City is a grandiose symbol of imperial power.", R.drawable.it2, R.drawable.it2);
        addItem("Terracotta Army", "Discovered in 1974 near the city of Xi'an, the Terracotta Army is a stunning archaeological find.", R.drawable.it3, R.drawable.it3);
        addItem("The Bund, Shanghai", "Flanking the western bank of the Huangpu River, the Bund in Shanghai is a vivid showcase of colonial-era architecture.", R.drawable.it4, R.drawable.it4);
        addItem("Li River, Guilin", "The Li River is the lifeblood of Guilin, a place renowned for its ethereal landscapes.", R.drawable.it5, R.drawable.it5);
        addItem("Zhangjiajie National Forest Park", "Located in Hunan Province, the Zhangjiajie National Forest Park is a marvel of nature.", R.drawable.it6, R.drawable.it6);
        addItem("Mount Huangshan", "Mount Huangshan, or Yellow Mountain, is one of China's iconic natural spectacles.", R.drawable.it7, R.drawable.it7);
        addItem("Potala Palace, Tibet", "Standing high on the Red Hill of Lhasa, the Potala Palace is the spiritual heart of Tibet.", R.drawable.it8, R.drawable.it8);
        addItem("Jiuzhaigou Valley", "Nestled high in the mountains of Sichuan Province, Jiuzhaigou Valley is a nature lover's dream.", R.drawable.it9, R.drawable.it9);
        addItem("The Summer Palace, Beijing", "The Summer Palace in Beijing is a masterpiece of Chinese landscape garden design.", R.drawable.it10, R.drawable.it10);
        addItem("Yellow River", "Known as the 'Mother River' of China, the Yellow River is the cradle of Chinese civilization.", R.drawable.it11, R.drawable.it11);
        addItem("Leshan Giant Buddha", "Carved into a cliff in the Sichuan Province, the Leshan Giant Buddha is the largest stone Buddha statue in the world.", R.drawable.it12, R.drawable.it12);
        addItem("West Lake, Hangzhou", "Enshrined in poetry and paintings, the West Lake is the romantic heart of Hangzhou.", R.drawable.it13, R.drawable.it13);
        addItem("Yangtze River", "The Yangtze River, the longest in Asia and third longest in the world, has been the lifeline of China for millennia.", R.drawable.it14, R.drawable.it14);
        addItem("Mount Everest, Tibet", "The iconic Mount Everest needs little introduction. Known as Qomolangma to Tibetans, it is the highest peak in the world.", R.drawable.it15, R.drawable.it15);
    }

    private void addItem(final String title, final String description, int thumbnailResId, final int imageResId) {
        LayoutInflater inflater = LayoutInflater.from(this);
        View itemLayout = inflater.inflate(R.layout.item_layout, (ViewGroup) this.itemContainer, false);
        ImageView itemThumbnail = (ImageView) itemLayout.findViewById(R.id.itemThumbnail);
        TextView itemTitle = (TextView) itemLayout.findViewById(R.id.itemTitle);
        itemTitle.setText(title);
        itemThumbnail.setImageResource(thumbnailResId);
        itemLayout.setOnClickListener(new View.OnClickListener() { // from class: com.tohasheikh.chineseattractions.ItemLayoutActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View v) {
                ItemLayoutActivity.this.openDetailPage(title, description, imageResId);
            }
        });
        this.itemContainer.addView(itemLayout);
    }

    public void openDetailPage(String title, String description, int imageResId) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("imageResId", imageResId);
        startActivity(intent);
    }
}
