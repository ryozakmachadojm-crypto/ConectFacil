package com.conectfacil
import android.net.wifi.WifiManager
import android.net.wifi.WifiNetworkSuggestion
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity: AppCompatActivity(){override fun onCreate(savedInstanceState: Bundle?){super.onCreate(savedInstanceState);setContentView(R.layout.activity_main);findViewById<Button>(R.id.btnConnect).setOnClickListener{val wm=getSystemService(WIFI_SERVICE) as WifiManager;wm.addNetworkSuggestions(listOf(WifiNetworkSuggestion.Builder().setSsid("JSL-OPERACAO").setWpa2Passphrase("@operacao@JSL").build(),WifiNetworkSuggestion.Builder().setSsid("CONNECT").setWpa2Passphrase("31544000").build()));Toast.makeText(this,"Redes adicionadas",Toast.LENGTH_LONG).show()}}}