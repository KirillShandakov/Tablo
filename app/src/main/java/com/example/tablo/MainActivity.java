package com.example.tablo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer goalCSKA = 0;
    private Integer goalSpartak = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }
    public void goalCSKA(View view) {
        goalCSKA++;
        TextView mapNView = findViewById(R.id.viewgoalCSKA);
        mapNView.setText(goalCSKA.toString());

    }
    public void goalSpartak(View view) {
        goalSpartak++;
        TextView mapVView = findViewById(R.id.viewgoalSpartak);
        mapVView.setText(goalSpartak.toString());

    }
    public void restart(View view) {
        goalCSKA = 0;
        goalSpartak = 0;
        TextView mapNView = findViewById(R.id.viewgoalCSKA);
        mapNView.setText(goalCSKA.toString());
        TextView mapVView = findViewById(R.id.viewgoalSpartak);
        mapVView.setText(goalSpartak.toString());
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("CSKA", goalCSKA);
        outState.putInt("Spartak", goalSpartak);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        goalCSKA = savedInstanceState.getInt("CSKA");
        goalSpartak = savedInstanceState.getInt("Spartak");
    }
}
