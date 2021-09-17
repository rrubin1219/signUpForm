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

        //

        saveButton.setOnClickListener {
            if(name.text.trim().isEmpty()) {
                Toast.makeText(this, "Error: Name must be provided", Toast.LENGTH_SHORT).show()
            }
            else if(email.text.trim().isEmpty()){
                Toast.makeText(this, "Error: Email must be provided", Toast.LENGTH_SHORT).show()
            }
            else if(password.text.trim().isEmpty()){
                Toast.makeText(this, "Error: Password must be provided", Toast.LENGTH_SHORT).show()
            }
            else if(confirm.text.trim().isEmpty()){
                Toast.makeText(this, "Error: Re-enter password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

/*package edu.temple.signupform

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
        val name = findViewById<TextView>(R.id.name).text.trim()
        val email = findViewById<TextView>(R.id.email).text.trim()
        val password = findViewById<TextView>(R.id.password).text.trim()
        val confirm = findViewById<TextView>(R.id.confirm).text.trim()

        //saveButton.setOnClickListener{v-> Toast.makeText(this, "Welcome ${name} to the SignUpFormApp", Toast.LENGTH_SHORT).show()}

        saveButton.setOnClickListener{
            if(name.isEmpty()){
                Toast.makeText(this, "Name must be inputted", Toast.LENGTH_LONG).show()
            }
            else if(email.isEmpty()){
                Toast.makeText(this, "Email must be inputted", Toast.LENGTH_LONG).show()
            }
            else if(password.isEmpty() || confirm.isEmpty()){
                Toast.makeText(this, "Password must be inputted", Toast.LENGTH_LONG).show()
            }
            else if(password != confirm){
                Toast.makeText(this, "Passwords must match", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Welcome ${name} to the SignUpFormApp", Toast.LENGTH_LONG).show()
            }
        }

    }
}*/