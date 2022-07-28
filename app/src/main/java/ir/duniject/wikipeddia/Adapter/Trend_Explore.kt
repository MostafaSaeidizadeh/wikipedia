package ir.duniject.wikipeddia.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import ir.duniject.wikipeddia.Data.ItemPost
import ir.duniject.wikipeddia.Fragments.Fragmenttrend
import ir.duniject.wikipeddia.databinding.ItemTerndBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class TrendExplore(private val data:ArrayList<ItemPost>, val itemEvents: ItemEvents):RecyclerView.Adapter<TrendExplore.ExploreViewHolder>() {

    lateinit var binding : ItemTerndBinding

    inner class ExploreViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        fun bindViews(itemPost: ItemPost){
            Glide
                .with(binding.root)
                .load(itemPost.imgUrl)
                .transform(RoundedCornersTransformation(24 , 8))
                .into(binding.imgTrendMain)
            binding.txtTrendTitle.text = itemPost.txtTitle
            binding.txtTrendSubtitel.text = itemPost.txtSubtitle
            binding.txtTrendInsight.text = itemPost.insight
            binding.txtTrendNumber.text = (adapterPosition +1).toString()

            itemView.setOnClickListener {
                itemEvents.onItemclicked(itemPost)

            }

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExploreViewHolder {
        binding = ItemTerndBinding.inflate(LayoutInflater.from(parent.context), parent , false)
        return ExploreViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ExploreViewHolder, position: Int) {
        holder.bindViews(data[position])
    }

    override fun getItemCount(): Int {
        return data.size

    }
}