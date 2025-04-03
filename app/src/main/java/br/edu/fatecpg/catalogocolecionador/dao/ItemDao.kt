package br.edu.fatecpg.catalogocolecionador.dao

import br.edu.fatecpg.catalogocolecionador.model.Item

class ItemDao {
    companion object {
        private val itens = mutableListOf<Item>()

    }
    fun additem(item:Item){
        itens.add(item)
    }
    fun getitens():List<Item>{
        return itens
    }
}