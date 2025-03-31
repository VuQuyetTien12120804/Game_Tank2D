package com.example.tank2d.presentation.controller;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tank2d.R;

public class GameOver extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        // Lấy điểm số từ Intent (nếu có)
        int score = getIntent().getIntExtra("SCORE", 0);

        // Hiển thị điểm số
        TextView tvScore = findViewById(R.id.tvScore);
        tvScore.setText("Score: " + score);

        // Nút Play Again
        Button btnPlayAgain = findViewById(R.id.btnPlayAgain);
        if (btnPlayAgain != null) {
            btnPlayAgain.setOnClickListener(v -> {
                // Chuyển về màn hình chơi game (giả sử là GameActivity)
                Intent intent = new Intent(GameOver.this, MenuGame.class); // Thay GameActivity bằng activity chơi game của bạn
                startActivity(intent);
                finish();
            });
        }

        // Nút Exit
        Button btnExit = findViewById(R.id.btnExit);
        if (btnExit != null) {
            btnExit.setOnClickListener(v -> {
                // Quay về MenuGame
                Intent intent = new Intent(GameOver.this, MenuGame.class);
                startActivity(intent);
                finish();
            });
        }
    }
}