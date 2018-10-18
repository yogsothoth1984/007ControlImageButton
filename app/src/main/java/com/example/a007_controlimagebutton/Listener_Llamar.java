package com.example.a007_controlimagebutton;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Listener_Llamar implements View.OnClickListener {
    private MainActivity contextMain;
    private TextView textView;
    private ImageButton imageButton;

    public Listener_Llamar(MainActivity contextMain) {
        this.contextMain = contextMain;
    }

    @Override
    public void onClick(View v) {
        textView = contextMain.findViewById(R.id.textView);
        textView.setText("Llamando");

        imageButton = contextMain.findViewById(R.id.imageButton);
        //cambio el icono por una foto
        imageButton.setImageResource(R.drawable.mujer);
    }
}
