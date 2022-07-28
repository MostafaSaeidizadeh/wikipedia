package ir.duniject.wikipeddia.Activity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.SurfaceControl
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import cn.pedant.SweetAlert.SweetAlertDialog
import com.google.android.material.snackbar.Snackbar
import ir.duniject.wikipeddia.Fragments.FragmentExplore
import ir.duniject.wikipeddia.Fragments.Fragmentphotographer
import ir.duniject.wikipeddia.Fragments.Fragmentprofile
import ir.duniject.wikipeddia.Fragments.Fragmenttrend
import ir.duniject.wikipeddia.R
import ir.duniject.wikipeddia.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this,
            binding.drawerlayoutMain, binding.ToolBarMain, R.string.openDrawer, R.string.closeDrawer
        )
        binding.drawerlayoutMain.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()



        binding.navigationviewMain.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.menu_writer -> {
                    Toast.makeText(this, "menu write clicked...", Toast.LENGTH_SHORT).show()
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)


                    val dialog = SweetAlertDialog(this, SweetAlertDialog.SUCCESS_TYPE)
                    dialog.titleText = "alert"
                    dialog.confirmText = "confirm"
                    dialog.cancelText = "cancel"
                    dialog.contentText = "wann be a writer"

                    dialog.setCancelClickListener {
                        dialog.dismiss()
                    }

                    dialog.setConfirmClickListener {
                        val url = "https://www.varzesh3.com"
                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                        startActivity(intent)
                        dialog.dismiss()
                    }

                    dialog.show()
                }

                R.id.menu_photographer -> {


                    val transaction = supportFragmentManager.beginTransaction()
                    transaction.add(R.id.fragment_main_container, Fragmentphotographer())
                    transaction.addToBackStack(null)
                    transaction.commit()

                    binding.navigationviewMain.menu.getItem(1).isChecked = true

                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)


                }
                R.id.menu_video_maker -> {
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                    val snackbar = Snackbar.make(binding.root, "No Internet", Snackbar.LENGTH_LONG)
                        .setAction("Retry") {
                            Toast.makeText(this, "cheking internet", Toast.LENGTH_SHORT).show()
                        }
                        .setActionTextColor(
                            ContextCompat.getColor(
                                this,
                                android.R.color.holo_red_dark
                            )
                        )

                        .setBackgroundTint(ContextCompat.getColor(this, R.color.blue))
                        .show()

                }

                R.id.menu_trnslator -> {

                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)

                    val intent = Intent(this, MainActivity3::class.java)
                        startActivity(intent)


                }
                //---------------------
                R.id.menu_open_wikipedia -> {
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                    openwebsite("https://www.wikimedia.org/")
                }
                R.id.open_wikimadia -> {
                    binding.drawerlayoutMain.closeDrawer(GravityCompat.START)
                }
            }
            true
        }

        FirstRun()
        binding.bottomnavigationMain.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_explore -> {
                    replaceFragment(FragmentExplore())

                }

                R.id.menu_trend -> {
                    replaceFragment(Fragmenttrend())

                }

                R.id.menu_profile -> {
                    replaceFragment(Fragmentprofile())

                }
            }
            binding.navigationviewMain.menu.getItem(1).isChecked = false
            true
        }



        binding.bottomnavigationMain.setOnItemReselectedListener { }
    }

    private fun openwebsite(Url: String) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse(Url))
        startActivity(intent)


    }

    fun replaceFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_main_container, fragment)
        transaction.commit()

    }

    fun FirstRun() {
        replaceFragment(FragmentExplore())
        binding.bottomnavigationMain.selectedItemId = R.id.menu_explore
    }

    override fun onBackPressed() {
        super.onBackPressed()
        binding.navigationviewMain.menu.getItem(1).isChecked = false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_exit ->{
            onBackPressed()
        }
        }

        return true
    }

}