package com.mainpackage.livedata;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;


public class MainActivity extends AppCompatActivity {

    MainActivityViewModel mainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        Button btn = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView);

        mainActivityViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);


        // Using Live Data to get the counter
        LiveData<Integer> count = mainActivityViewModel.getInitialCounter();
        count.observe(this, integer -> textView.setText(String.format(getString(R.string.you_clicked_me_d_times), integer)));


        btn.setOnClickListener(v -> {

            // Getting the Current Count
            mainActivityViewModel.getCounter();
        });


    }

}