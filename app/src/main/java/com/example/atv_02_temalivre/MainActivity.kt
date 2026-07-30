package com.example.atv_02_temalivre

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Conectando os componentes usando os IDs EXATOS do seu XML
        val txtTitulo = findViewById<TextView>(R.id.txtTittle)
        val editNomeConstelacao = findViewById<EditText>(R.id.edtxt)
        val btnEnviar = findViewById<Button>(R.id.btn_enviar)

        // Lógica do clique do botão
        btnEnviar.setOnClickListener { val nomeConstelacao = editNomeConstelacao.text.toString().trim()

            if (nomeConstelacao.isEmpty()) {
                Toast.makeText(this, "Por favor, digite o nome de uma trilha!", Toast.LENGTH_SHORT).show()
            }
            else {
                // Altera o texto do seu TextView
                txtTitulo.text = "Constelação mais visivel: $nomeConstelacao!"

                // Mostra o Toast de sucesso
                Toast.makeText(this, "Constelação '$nomeConstelacao' Encontrada com sucesso", Toast.LENGTH_LONG).show()

                // Limpa o campo de texto
                editNomeConstelacao.text.clear()
            }
        }
    }
}