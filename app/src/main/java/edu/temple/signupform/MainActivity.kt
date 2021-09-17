package edu.temple.signupform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.form_activity)

        val saveButton = findViewById<Button>(R.id.button)
        val name = findViewById<TextView>(R.id.name)
        val email = findViewById<TextView>(R.id.email)
        val password = findViewById<TextView>(R.id.password)
        val confirm = findViewById<TextView>(R.id.confirm)

        saveButton.setOnClickListener {
            if(name.text.trim().isEmpty()) { //Check for name
                name.error = "Name must be provided"

            }
            else if(email.text.trim().isEmpty()){ //Check for email
                email.error = "Email must be provided"
            }
            else if(password.text.trim().isEmpty()){ //Check for password
                password.error = "Password must be provided"
            }
            else if(confirm.text.trim().isEmpty()){ //Check for password confirmation
                confirm.error = "Re-enter password"
            }
            else if(password.text.trim().toString()!=(confirm.text.trim().toString())) { //Check if password and confirm are equal 
                confirm.error = "Passwords do not match"
            }
            else { //End message
                Toast.makeText(this, "Welcome ${name.text} to the SignUpFormApp", Toast.LENGTH_SHORT).show()
            }
        }
    }
}