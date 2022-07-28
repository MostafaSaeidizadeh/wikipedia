package ir.duniject.wikipeddia.Activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import ir.duniject.wikipeddia.Data.ItemPost
import ir.duniject.wikipeddia.Fragments.SEND_DATA_TO_SECOND_ACTIVITY
import ir.duniject.wikipeddia.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        val datapost = intent.getParcelableExtra<ItemPost>(SEND_DATA_TO_SECOND_ACTIVITY)
        if (datapost != null){
             datashow(datapost)
        }

    }

    private fun datashow(itemPost: ItemPost) {
        Glide
            .with(this)
            .load(itemPost.imgUrl)
            .into(binding.imgDatail)
        binding.txtDatailTitle.text = itemPost.txtTitle
        binding.txtDatailSubtitle.text = itemPost.txtSubtitle
        binding.txtDatailText.text = itemPost.txtDetail
        binding.imgDatail.setOnClickListener {
            val url = "https://de.wikipedia.org/wiki/Wikipedia:Hauptseite"
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse(url))
            startActivity(intent)
        }
    }
}