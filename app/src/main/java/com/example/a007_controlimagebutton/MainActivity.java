package com.example.a007_controlimagebutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Listener_Llamar listener_llamar;
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButton = findViewById(R.id.imageButton);
        textView = findViewById(R.id.textView);
        //Creo el objeto listener(la clase para poder usarlo)
        listener_llamar = new Listener_Llamar(this);
        imageButton.setOnClickListener(listener_llamar);
    }
}
   /*En la carpeta res/mipmap-mdpi/
(guardamos la imagen con el tamaño original)

En la carpeta res/mipmap-hdpi/
(guardamos la imagen con el tamaño del 150% con respecto al de la carpeta mipmap-mdpi)

En la carpeta res/mipmap-xhdpi/
(guardamos la imagen con el tamaño del 200% con respecto al de la carpeta mipmap-mdpi)

En la carpeta res/mipmap-xxhdpi/
(guardamos la imagen con el tamaño del 300% con respecto al de la carpeta mipmap-mdpi)

En la carpeta res/mipmap-xxxhdpi/
(guardamos la imagen con el tamaño del 400% con respecto al de la carpeta mipmap-mdpi)*/