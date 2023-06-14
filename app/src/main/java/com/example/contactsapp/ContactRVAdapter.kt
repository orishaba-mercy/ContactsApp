package com.example.contactsapp

import android.content.Intent
import android.provider.ContactsContract.Contacts
import android.view.Gravity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactsapp.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import java.time.Instant

class ContactRVAdapter (var contactList: List<ContactsData>):RecyclerView.Adapter<ContactRVAdapter.ContactViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int): ContactViewHolder{
       val binding=ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
      val currentContact =contactList.get(position)
        val binding=holder.binding
        binding.ivimage.tag=currentContact.image
        binding.tvName.text=currentContact.name
        binding.tvPhoneNumber.text =currentContact.phoneNumber
        binding.tvEmail.text=currentContact.email

        binding.btnbutton.setOnClickListener {
            val intent = Intent(holder.itemView.context, MainActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }
        Picasso
            .get()
            .load(currentContact.image)
            .centerCrop(Gravity.CENTER)
            .resize(80,80)
            .into(binding.ivimage)

    }
    override fun getItemCount(): Int {
        return contactList.size
    }
    class ContactViewHolder(var binding: ContactListItemBinding):RecyclerView.ViewHolder(binding.root)}

