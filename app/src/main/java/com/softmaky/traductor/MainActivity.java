package com.softmaky.traductor;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.softmaky.traductor.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private TracuctorViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(TracuctorViewModel.class);

        binding.btTraduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String palabraEspa = binding.etEspa.getText().toString();
               mv.traducido(palabraEspa);

            }
        });
    }
}