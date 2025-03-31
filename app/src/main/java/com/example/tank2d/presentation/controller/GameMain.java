package com.example.tank2d.presentation.controller;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tank2d.R;

public class GameMain extends AppCompatActivity {

    private TextView tvScore, tvGameArea;
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main);

        // Khởi tạo các thành phần giao diện
        tvScore = findViewById(R.id.tvScore);
        tvGameArea = findViewById(R.id.tvGameArea);
        Button btnUp = findViewById(R.id.btnUp);
        Button btnDown = findViewById(R.id.btnDown);
        Button btnLeft = findViewById(R.id.btnLeft);
        Button btnRight = findViewById(R.id.btnRight);
        Button btnShoot = findViewById(R.id.btnShoot);
        Button btnGameOver = findViewById(R.id.btnGameOver);
        Button btnGameWin = findViewById(R.id.btnGameWin);

        // Cập nhật điểm số ban đầu
        tvScore.setText("Score: " + score);

        // Xử lý các nút điều khiển
        if (btnUp != null) {
            btnUp.setOnClickListener(v -> updateGameArea("Moved Up"));
        }

        if (btnDown != null) {
            btnDown.setOnClickListener(v -> updateGameArea("Moved Down"));
        }

        if (btnLeft != null) {
            btnLeft.setOnClickListener(v -> updateGameArea("Moved Left"));
        }

        if (btnRight != null) {
            btnRight.setOnClickListener(v -> updateGameArea("Moved Right"));
        }

        if (btnShoot != null) {
            btnShoot.setOnClickListener(v -> {
                score += 10; // Tăng điểm khi bắn
                tvScore.setText("Score: " + score);
                updateGameArea("Shot Fired!");
            });
        }

        // Nút Game Over
        if (btnGameOver != null) {
            btnGameOver.setOnClickListener(v -> {
                Intent intent = new Intent(GameMain.this, GameOver.class);
                intent.putExtra("SCORE", score);
                startActivity(intent);
                finish();
            });
        }

        // Nút Game Win
        if (btnGameWin != null) {
            btnGameWin.setOnClickListener(v -> {
                Intent intent = new Intent(GameMain.this, GameWin.class);
                intent.putExtra("SCORE", score);
                startActivity(intent);
                finish();
            });
        }
    }

    private void updateGameArea(String action) {
        tvGameArea.setText("Game Area\n(Player Tank)\n" + action);
    }
}