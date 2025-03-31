package com.example.tank2d.presentation.controller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.tank2d.R;

public class MenuGame extends AppCompatActivity {
    Button btnExit, btnSetting,btnPlayWithFriend, btnPlayWithAI;
    ImageButton btnHelp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_game);

        btnExit = findViewById(R.id.btnExit);
        btnSetting = findViewById(R.id.btnSetting);
        btnPlayWithAI = findViewById(R.id.btnPlayWithAI);
        btnPlayWithFriend = findViewById(R.id.btnPlayWithFriend);
        btnHelp = findViewById(R.id.btnHelp);

        btnExit.setOnClickListener(v -> finish());

        btnSetting.setOnClickListener(v -> {
            // Add intent to Setting Activity
        });

        btnPlayWithAI.setOnClickListener(v -> {
            // Add intent to Game Activity with AI
        });

        btnPlayWithFriend.setOnClickListener(v -> {
            // Add intent to Multiplayer Game Activity
        });

        btnHelp.setOnClickListener(v -> {
            // Add intent to Help Activity
        });
    }
}