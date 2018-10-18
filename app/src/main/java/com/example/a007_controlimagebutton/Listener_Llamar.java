package com.example.a007_controlimagebutton;

import android.view.View;
import android.widget.TextView;

public class Listener_Llamar implements View.OnClickListener {
    private MainActivity contextMain;
    private TextView textView;

    public Listener_Llamar(MainActivity contextMain) {
        this.contextMain = contextMain;
    }

    @Override
    public void onClick(View v) {
        textView = contextMain.findViewById(R.id.textView);
        textView.setText("Llamando");
    }
}
