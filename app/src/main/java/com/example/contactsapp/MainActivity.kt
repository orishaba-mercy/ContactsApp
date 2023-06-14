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

        var name1 =ContactsData("kantu joy ","0789678990","joykant@gmail.com","https://images.unsplash.com/photo-1527203561188-dae1bc1a417f?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjB8fHByb2ZpbGUlMjBwaWN0dXJlJTIwYmxhY2slMjBwZXJzb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
        var name2 =ContactsData(" Hope Amutu","0789567896","hopeline@gmail.com","https://images.unsplash.com/photo-1591727884968-cc11135a19b3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fHByb2ZpbGUlMjBwaWN0dXJlJTIwYmxhY2slMjBwZXJzb258ZW58MHx8MHx8fDA%3D&auto=format&fit=crop&w=500&q=60")
        var name3=ContactsData("Linet Kamara ","0078967989","klinet@gmail.com","https://media.istockphoto.com/id/1386479313/photo/happy-millennial-afro-american-business-woman-posing-isolated-on-white.webp?b=1&s=170667a&w=0&k=20&c=ahypUC_KTc95VOsBkzLFZiCQ0VJwewfrSV43BOrLETM=")
        var name4=ContactsData(" Bridget Nakakande","0789678945","nakakande@gmail.com","https://media.istockphoto.com/id/1381221247/photo/beautiful-afro-girl-with-curly-hairstyle.webp?b=1&s=170667a&w=0&k=20&c=0x91osZOkL8EfhTEEGNa2EeCGN2gdMTNULOsUFW_0i4=")
        var name5 =ContactsData("Cithia Namputu","07896789","cythiana@gmail.com","https://media.istockphoto.com/id/1311634222/photo/portrait-of-successful-black-male-modern-day-student-holding-smartphone.webp?b=1&s=170667a&w=0&k=20&c=qdZ9RCZsdzSqmeBrluO_S-sC8Y7lUBre80UvjwTCRxE=")
        var names = listOf(name1,name2,name3,name4,name5)
        val contactAdapter=ContactRVAdapter(names)
        binding.rvAdapter.layoutManager =LinearLayoutManager(this)
        binding.rvAdapter.adapter= contactAdapter

    }
}