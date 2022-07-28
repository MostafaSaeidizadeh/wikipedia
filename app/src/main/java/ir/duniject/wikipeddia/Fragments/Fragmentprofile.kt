package ir.duniject.wikipeddia.Fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.google.android.material.card.MaterialCardView
import ir.duniject.wikipeddia.R
import ir.duniject.wikipeddia.databinding.FragmentprofileBinding
import jp.wasabeef.glide.transformations.RoundedCornersTransformation

class Fragmentprofile : Fragment() {

    lateinit var binding: FragmentprofileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentprofileBinding.inflate(layoutInflater, container, false)
        return binding.root



    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
val glid = Glide
    .with(requireContext())
    .load(R.drawable.img_profile)
    .transform(RoundedCornersTransformation(32 , 8))
    .into(binding.imgMain)

        binding.fabMain.setOnClickListener {
            Toast.makeText(context, "Estartchat", Toast.LENGTH_SHORT).show()
        }



        //   val card = view.findViewById<MaterialCardView>(R.id.cardMain)
        // card.isChecked = true
        // card.setOnClickListener {
        //   card.isChecked = !card.isChecked
        // }

    }
}


