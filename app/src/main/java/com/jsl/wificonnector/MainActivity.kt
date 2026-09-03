package com.jsl.wificonnector

import android.net.wifi.WifiNetworkSuggestion
import android.net.wifi.WifiManager
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_main)
  findViewById<Button>(R.id.btnConnect).setOnClickListener {
   val wifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
   val s1 = WifiNetworkSuggestion.Builder().setSsid("JSL-OPERACAO").setWpa2Passphrase("@operacao@JSL").build()
   val s2 = WifiNetworkSuggestion.Builder().setSsid("CONNECT").setWpa2Passphrase("31544000").build()
   wifiManager.addNetworkSuggestions(listOf(s1,s2))
   Toast.makeText(this, "Redes adicionadas. Confirme a conexão quando solicitado pelo Android.", Toast.LENGTH_LONG).show()
  }
 }
}
