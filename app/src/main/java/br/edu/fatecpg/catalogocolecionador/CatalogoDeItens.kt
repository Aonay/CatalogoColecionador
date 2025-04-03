package br.edu.fatecpg.catalogocolecionador

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.catalogocolecionador.adapter.ItemAdapter
import br.edu.fatecpg.catalogocolecionador.dao.ItemDao

class CatalogoDeItens : AppCompatActivity(R.layout.activity_catalogo_de_itens) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val dao = ItemDao()
        val itens = dao.getitens()
        Log.i("items",itens.toString())

        val rvItens = findViewById<RecyclerView>(R.id.rv_itens)
        rvItens.layoutManager = LinearLayoutManager(this)
        rvItens.adapter = ItemAdapter(itens)

    }
}