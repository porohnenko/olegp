package com.android.olegp.gallerydemo;

import android.Manifest;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class GalleryActivity extends AppCompatActivity implements View.OnClickListener {

    public static final int MY_REQUEST = 5;
    ImageView img;
    Uri uri;
    SharedPreferences pref;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MY_REQUEST) {
            if (resultCode == RESULT_OK) {
                uri = data.getData();
                img.setImageURI(uri);
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        img = (ImageView) findViewById(R.id.imageView);
        img.setOnClickListener(this);

        int MY_PERMISSIONS_REQUEST = 10;
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, MY_PERMISSIONS_REQUEST);
        }

        pref = getSharedPreferences("gallery_pref", MODE_PRIVATE);
        if (pref.getString("image_path", "") != null) {
            uri = Uri.parse(pref.getString("image_path", ""));

            img.setImageURI(uri);

            SharedPreferences.Editor editor = pref.edit();
            editor.putString("image_path", uri.toString());
            editor.apply();
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent, MY_REQUEST);

    }
}
