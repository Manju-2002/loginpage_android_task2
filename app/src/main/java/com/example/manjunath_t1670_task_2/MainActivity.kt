package com.example.manjunath_t1670_task_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.manjunath_t1670_task_2.R.id.submitButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the views by their IDs with explicit types
        val btn: Button = findViewById(submitButton)
        val emailInput: EditText = findViewById(R.id.usernameInput)
        val passwordInput: EditText = findViewById(R.id.passwordInput)

        // Set up click listener for the button
        btn.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email == "edigamanju54@gmail.com" && password == "Manju@2002") {
            // Navigate to the dashboard activity
            val intent = Intent(this, dashboardactivity::class.java)
            startActivity(intent)
        }
    }
}
}