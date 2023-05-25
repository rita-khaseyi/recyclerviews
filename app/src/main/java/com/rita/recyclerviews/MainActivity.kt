import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rita.recyclerviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayFibonacciSequence()
    }

    private fun displayFibonacciSequence() {
        val fibonacciList = generateFibonacciSequence(100)

        binding.RvNames.layoutManager = LinearLayoutManager(this)

        val namesAdapter = NamesRvAdapter(fibonacciList)
        binding.RvNames.adapter = namesAdapter
    }

    private fun generateFibonacciSequence(count: Int): List<Long> {
        val fibonacciList = mutableListOf(0L, 1L)

        var i = 2
        while (i < count) {
            val nextNumber = fibonacciList[i - 1] + fibonacciList[i - 2]
            if (nextNumber > 100) {
                break
            }
            fibonacciList.add(nextNumber)
            i++
        }

        return fibonacciList
    }
}





//package com.rita.recyclerviews
//
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import androidx.recyclerview.widget.LinearLayoutManager
//import com.rita.recyclerviews.databinding.ActivityMainBinding
//
//class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding=ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//    }
//
//    override fun onResume() {
//        super.onResume()
//        displayNamesList()
//    }
//
//
//fun displayNamesList(){
//    var names= listOf("mary","rita","wendy","kevine","zipporah","alice","esther",
//        "keith","wendy","maina","aaliyah","trishia","arlette")
//
//    binding.RvNames.layoutManager=LinearLayoutManager(this)
//    val namesAdapter=NamesRvAdapter(names)
//    binding.RvNames.adapter=namesAdapter
//
//
//
//}}
