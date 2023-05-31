package com.example.contactsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume(){
        super.onResume()
        displayContacts()

    }
    fun displayContacts(){

        var name1 =ContactsData("kantu joy ","0789678990","joykant@gmail.com","")
        var name2 =ContactsData(" Hope Amutu","0789567896","hopeline@gmail.com","")
        var name3=ContactsData("Linet Kamara ","0078967989","klinet@gmail.com","")
        var name4=ContactsData(" Bridget Nakakande","0789678945","nakakande@gmail.com","")
        var name5 =ContactsData("Cithia Namputu","07896789","cythiana@gmail.com","")
        var names = listOf(name1,name2,name3,name4,name5)
        val contactAdapter=ContactRVAdapter(names)
        binding.rvAdapter.layoutManager =LinearLayoutManager(this)
        binding.rvAdapter.adapter= contactAdapter

    }
}