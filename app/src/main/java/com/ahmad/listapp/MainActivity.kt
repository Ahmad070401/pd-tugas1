package com.ahmad.listapp

import adapter.KulinerAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.ahmad.listapp.databinding.ActivityMainBinding
import com.ahmad.listapp.model.DaftarKuliner

class MainActivity : AppCompatActivity() {


    private val binding : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val dataDummy = arrayListOf(
        DaftarKuliner(
            R.drawable.karedok,
            "Karedok",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcasa",
        "9.0",
        ), DaftarKuliner(
            R.drawable.satelilit,
            "Sate Lilit",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.rendang,
            "Rendang",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.pempek,
            "Pempek",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.seruit,
            "Seruit",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.karedok,
            "Gulai Belacan",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.karedok,
            "Mie Aceh",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.karedok,
            "Soto Banjar",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.gudeg,
            "Gudeg",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ), DaftarKuliner(
            R.drawable.juhu,
            "Juhu Singkang",
        "dlknsadaskdandlkasndcasnckasncaskndcaskcas",
        "9.0",
        ),

    )
    lateinit var kulinerAdapter: KulinerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        kulinerAdapter= KulinerAdapter(this)
        binding.rvList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter=kulinerAdapter
        }
        kulinerAdapter.setData(dataDummy)
    }

    override fun onRestart() {
        super.onRestart()
        setContentView(binding.root)
    }
}