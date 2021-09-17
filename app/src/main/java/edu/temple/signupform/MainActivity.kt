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
                Toast.makeText(this, "Error: Name must be provided", Toast.LENGTH_SHORT).show()
            }
            else if(email.text.trim().isEmpty()){ //Check for email
                Toast.makeText(this, "Error: Email must be provided", Toast.LENGTH_SHORT).show()
            }
            else if(password.text.trim().isEmpty()){ //Check for password
                Toast.makeText(this, "Error: Password must be provided", Toast.LENGTH_SHORT).show()
            }
            else if(confirm.text.trim().isEmpty()){ //Check for password confirmation
                Toast.makeText(this, "Error: Re-enter password", Toast.LENGTH_SHORT).show()
            }
            else if(password.text.trim().toString()!=(confirm.text.trim().toString())) { //Check if password and confirm are equal
                Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
            }
            else { //End message
                Toast.makeText(this, "Welcome ${name.text}to the SignUpFormApp", Toast.LENGTH_SHORT).show()
            }
        }
    }
}