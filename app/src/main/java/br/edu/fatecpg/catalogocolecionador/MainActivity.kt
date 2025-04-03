package br.edu.fatecpg.catalogocolecionador

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import br.edu.fatecpg.catalogocolecionador.dao.ItemDao
import br.edu.fatecpg.catalogocolecionador.model.Item

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val edtNome = findViewById<EditText>(R.id.edt_nome)
        val edtValor = findViewById<EditText>(R.id.edt_valor)
        val edtUrl = findViewById<EditText>(R.id.edt_urlImagem)
        val btn_Cadastrar = findViewById<Button>(R.id.btn_cadastrar)
        val txvVerLista = findViewById<TextView>(R.id.txv_verlista)
        val dao = ItemDao()

        txvVerLista.setOnClickListener {
            val intent = Intent(this,CatalogoDeItens::class.java)
            startActivity(intent)
        }

        btn_Cadastrar.setOnClickListener {
            val nome = edtNome.text.toString()
            val valor = edtValor.text.toString().toDouble()
            val urlImagem = edtUrl.text.toString()

            val item = Item(
                nome = nome,
                valor = valor,
                url = urlImagem
            )
            dao.additem(item)
        }


    }
}