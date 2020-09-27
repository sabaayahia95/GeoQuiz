package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        true_button.setOnClickListener {
            val toast = Toast.makeText(
                    this, R.string.correct_toast,
                    Toast.LENGTH_SHORT
            );
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }

        false_button.setOnClickListener {
            val toast = Toast.makeText(
                    this, R.string.incorrect_toast,
                    Toast.LENGTH_SHORT
            );
            toast.setGravity(Gravity.TOP, 0, 0);
            toast.show();
        }
    }
}