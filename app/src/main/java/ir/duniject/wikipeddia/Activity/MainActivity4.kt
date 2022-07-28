package ir.duniject.wikipeddia.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ir.duniject.wikipeddia.R
import ir.duniject.wikipeddia.databinding.ActivityMain4Binding

class MainActivity4 : AppCompatActivity() {
    lateinit var binding: ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)


       // binding.chipAndroid.setOnClickListener {
          //  Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show()
       // }


        //binding.chipWeb.setOnClickListener {
           // Toast.makeText(this, "Web", Toast.LENGTH_SHORT).show()
       // }


       // binding.chipMachinekearning.setOnClickListener {
          //  Toast.makeText(this, "Machinlernig", Toast.LENGTH_SHORT).show()
       // }
        //binding.chipAndroid.setOnCheckedChangeListener { buttonView, isChecked ->
           // if (isChecked){
           //     Toast.makeText(this, "chip is cheked", Toast.LENGTH_SHORT).show()
          //  }
          //  else{
          //      Toast.makeText(this, "chip is not cheked", Toast.LENGTH_SHORT).show()
         //   }
       // }

        binding.chipGroupmain.setOnCheckedChangeListener { group, checkedId ->

        }
    }
}