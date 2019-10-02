package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton imageButton_refresh = (ImageButton) findViewById(R.id.imageButton_refresh);
        imageButton_refresh.setOnClickListener(this);
    }

    @Override

    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.imageButton_refresh:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Обновление данных")
                        .setMessage("Данные обновляются")
                        .setCancelable(false)
                        .setNegativeButton("ОК",
                                new DialogInterface.OnClickListener()
                                {
                                    public void onClick(DialogInterface dialog, int id)
                                    {
                                        dialog.cancel();
                                    }
                                });
                AlertDialog alert = builder.create();
                alert.show();

        }

    }
}
