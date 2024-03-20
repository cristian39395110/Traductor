package com.softmaky.traductor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.softmaky.traductor.databinding.ActivityMainBinding;

public class TraductorActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private TracuctorViewModel mv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        mv= ViewModelProvider.AndroidViewModelFactory.getInstance(getApplication()).create(TracuctorViewModel.class);

        mv.getMutableTraduce().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s)
            {
                binding.tvIdioma.setText(s);
            }
        });
    }
}