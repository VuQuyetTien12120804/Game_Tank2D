package com.example.tank2d.presentation.controller;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tank2d.R;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // Khởi tạo các thành phần giao diện
        Switch switchMusic = findViewById(R.id.switchMusic);
        Switch switchMusicGun = findViewById(R.id.switchMusicGun);
        Button btnOk = findViewById(R.id.btnOk);

        // Xử lý sự kiện cho nút OK
        if (btnOk != null) {
            btnOk.setOnClickListener(v -> {
                // Lưu trạng thái của các switch (nếu cần)
                boolean isMusicOn = switchMusic != null && switchMusic.isChecked();
                boolean isMusicGunOn = switchMusicGun != null && switchMusicGun.isChecked();

                // Có thể lưu trạng thái vào SharedPreferences hoặc xử lý logic khác
                android.util.Log.d("SettingActivity", "Music: " + isMusicOn + ", Music Gun: " + isMusicGunOn);

                // Quay lại màn hình trước đó (MenuGame)
                finish();
            });
        }
    }
}