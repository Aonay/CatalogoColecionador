package br.edu.fatecpg.catalogocolecionador.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.edu.fatecpg.catalogocolecionador.model.Item
import br.edu.fatecpg.catalogocolecionador.R

class ItemAdapter (private val items:List<Item>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val txvNome = itemView.findViewById<TextView>(R.id.txv_item_nome)
        val txvValor = itemView.findViewById<TextView>(R.id.txv_item_valor)
        val edtImagem = itemView.findViewById<TextView>(R.id.edt_urlImagem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_produto, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.txvNome.text = item.nome
        holder.txvValor.text = item.valor.toString()
        holder.edtImagem.text = item.url
    }

    override fun getItemCount(): Int {
        return items.size
    }
}