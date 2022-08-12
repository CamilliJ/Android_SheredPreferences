package com.example.shared

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun validaLogin(view: View){
        var login = findViewById<EditText>(R.id.etLogin)
        var senha = findViewById<EditText>(R.id.etSenha)

        if(login.text.toString() == "AlunoCotemig" && senha.text.toString() == "987654"){
            val i = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }else{
            login.setText("")
            senha.setText("")
            login.requestFocus()


            val builder = AlertDialog.Builder(this)
            builder.setTitle("Alerta")
            builder.setMessage("Você digitou dados invalidos!")
            builder.setNeutralButton("OK"){dialog, which ->
                Toast.makeText(this,"Insira novos dados", Toast.LENGTH_SHORT).show()
            }
            val dialog: AlertDialog = builder.create()
            dialog.show()
        }

    }
}