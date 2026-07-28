package com.app.calculadora

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnPermissaoTela = findViewById<Button>(R.id.btnPermissaoTela)
        val btnPermissaoLeitura = findViewById<Button>(R.id.btnPermissaoLeitura)

        // Botão para permitir desenhar por cima do Uber
        btnPermissaoTela.setOnClickListener {
            val intent = Intent(
                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:$packageName")
            )
            startActivity(intent)
        }

        // Botão para abrir as configurações de Acessibilidade
        btnPermissaoLeitura.setOnClickListener {
            val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
            startActivity(intent)
        }
    }
}
