package com.example.ac02

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class TelaPosLogin : AppCompatActivity() {
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_pos_login)
         val toolbar = findViewById<Toolbar>(R.id.toolbar)
         this.setSupportActionBar(toolbar)
            this.supportActionBar?.let {
                it.setTitle("HBStore")
            }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.pos_login_bar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.adicionar){
            //Aqui e a acao do Click
            val telaDeCadastro = Intent(this, Cadastro::class.java)
            startActivity(telaDeCadastro)
            return true
        }
        else if(item.itemId == R.id.deslogar){
            Toast.makeText(this, "Você foi Deslogado", Toast.LENGTH_SHORT).show()
            val voltarInicio = Intent(this, MainActivity::class.java)
            startActivity(voltarInicio)
            return true
        }
        else if(item.itemId == R.id.sair){
            this.finishAffinity()
        }
        return super.onOptionsItemSelected(item)
    }


}