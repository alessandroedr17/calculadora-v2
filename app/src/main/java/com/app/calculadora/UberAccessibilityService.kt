package com.app.calculadora

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.widget.Toast

class UberAccessibilityService : AccessibilityService() {

    // Essa função é chamada toda vez que a tela do celular muda
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // Vamos colocar a matemática de ler KM e Valor aqui na próxima etapa!
    }

    override fun onInterrupt() {
        // Caso o serviço seja interrompido pelo sistema
    }

    // Essa função avisa quando o motorista liga a chavinha lá nas configurações
    override fun onServiceConnected() {
        super.onServiceConnected()
        Toast.makeText(this, "Olhos da Calculadora Ativados!", Toast.LENGTH_LONG).show()
    }
}
