package com.example.ac02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var usuario: EditText
    private lateinit var senha: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         usuario = findViewById<EditText>(R.id.email_text)
         senha = findViewById<EditText>(R.id.password_text)
    }

    fun mudaTela(view: View){
        if(validaDados()){
        val segundaTela = Intent(this, TelaPosLogin::class.java)
        startActivity(segundaTela)
        }
        if(validaDados() == false){
            alerta()
        }
    }

    fun validaDados() : Boolean {
        if(usuario.text.toString() != "aluno"){
            return false
        }
        if(senha.text.toString() != "impacta"){
            return false
        }
        return true
    }

    fun alerta () {
        val construtor = AlertDialog.Builder(this)
        construtor.setTitle("Erro")
        construtor.setMessage("Usuario ou senha Incorretos")
        construtor.setPositiveButton("Tentar Novamente") { dialog, whitch ->
            Toast.makeText(this, "Tentar Novamente", Toast.LENGTH_SHORT).show()
        }
        construtor.show()
    }



































}



