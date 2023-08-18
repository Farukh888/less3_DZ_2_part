package com.example.less3_dz_2_part;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rv_btn;
    private ArrayList<String> names = new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv_btn = findViewById(R.id.rv_button);
        loadData();
        BtnAdapter adapter = new BtnAdapter(names);
        rv_btn.setAdapter(adapter);

    }

    private void loadData() {
        names.add("DSADD");
        names.add("DADF");
        names.add("DAFD");
        names.add("ADFD");
        names.add("AFDF");
        names.add("AFFD");
        names.add("FAD");
        names.add("AAA");
        names.add("Dfdaff");
        names.add("ghhghhh");
        names.add("NAI");
        names.add("NEI");
        names.add("oooooooooooooo");
    }
}