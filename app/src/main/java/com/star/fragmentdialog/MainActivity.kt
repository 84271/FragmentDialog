package com.star.fragmentdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatDialogFragment

class MainActivity : AppCompatActivity() {

    lateinit var btnAlert_Dialog : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAlert_Dialog = findViewById(R.id.btnAlert_Dialog)

        btnAlert_Dialog.setOnClickListener {
            val alertDialog1 = AlertDialog.Builder(this)
            alertDialog1.setTitle("Select Color")
            alertDialog1.setMessage("Select a color that you want to set as fragment background")
            alertDialog1.setPositiveButton("Red") { _, _ ->
                Toast.makeText(this, "Red clicked", Toast.LENGTH_SHORT).show()
            }
            alertDialog1.setPositiveButton("Blue") { _, _ ->
                Toast.makeText(this, "Blue clicked", Toast.LENGTH_SHORT).show()
            }
            alertDialog1.setPositiveButton("Green") { _, _ ->
                Toast.makeText(this, "Green clicked", Toast.LENGTH_SHORT).show()
            }
            alertDialog1.show()
            }
        }

    }
