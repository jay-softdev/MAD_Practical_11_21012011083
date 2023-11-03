package com.example.mad_practical_11_21012011083
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView


class ContactAdapter(context: Context, private val array: ArrayList<Contact>) : ArrayAdapter<Contact>(context, 0, array) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.data_items, parent, false)

        val contact = getItem(position) // Access the Contact object from the adapter

        view.findViewById<TextView>(R.id.name1).text = contact?.name
        view.findViewById<TextView>(R.id.no1).text = contact?.phoneno
        view.findViewById<TextView>(R.id.email1).text = contact?.emailid
        view.findViewById<TextView>(R.id.address1).text = contact?.address

        val button1: Button = view.findViewById(R.id.button1)

        button1.setOnClickListener {
            // Start the MapsActivity when button1 is clicked
            val intent = Intent(context, MapsActivity::class.java)
            context.startActivity(intent)
        }

        return view
    }
}