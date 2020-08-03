package ch.poole.android.radiobuttonregression;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.text.Layout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = findViewById(R.id.layout);
        long start = System.currentTimeMillis();
        for (int i=0; i< 20; i++) {
            final AppCompatRadioButton radioButton = new AppCompatRadioButton(this);
            layout.addView(radioButton);
        }
        TextView text = findViewById(R.id.title);
        text.setText("Took " + (System.currentTimeMillis() - start) + "ms");
    }
}