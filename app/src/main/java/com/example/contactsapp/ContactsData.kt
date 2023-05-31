package com.example.contactsapp

import android.provider.ContactsContract.CommonDataKinds.Email

data class ContactsData(
    var name:String,
    var phoneNumber:String,
    var email: String,
    var image:String,

)
