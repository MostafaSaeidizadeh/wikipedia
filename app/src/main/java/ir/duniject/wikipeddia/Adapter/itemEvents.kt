package ir.duniject.wikipeddia.Adapter

import ir.duniject.wikipeddia.Data.ItemPost

interface ItemEvents {
    fun onItemclicked(itemPost: ItemPost)
}