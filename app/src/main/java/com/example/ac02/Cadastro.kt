package com.example.ac02

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Cadastro : AppCompatActivity() {

    private lateinit var usuario: EditText
    private lateinit var email: EditText
    private lateinit var senha: EditText
    private lateinit var confirmaSenha: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        usuario = findViewById(R.id.usuario_text)
        email = findViewById(R.id.email_text_cadastro)
        senha = findViewById(R.id.password_text_cadastro)
        confirmaSenha = findViewById(R.id.conf_password_text_cadastro)



    }

    fun validaDadosCadastro(): Boolean {
        if (usuario.text == null || email.text == null || senha.text == null || confirmaSenha.text == null) {
            return false
        }
        return true
    }

    fun voltaTelaInicial(view: View){
        if(validaDadosCadastro()) {
            Toast.makeText(this, "Você foi cadastrado", Toast.LENGTH_SHORT).show()
            val voltarInicio = Intent(this, MainActivity::class.java)
            startActivity(voltarInicio)
        }
    }







}