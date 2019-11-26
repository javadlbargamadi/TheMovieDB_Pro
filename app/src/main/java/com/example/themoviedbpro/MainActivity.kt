package com.example.themoviedbpro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.themoviedbpro.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

//--------------------------------------------------------------------------------------------------

    /**
     * start search activity from main activity
     */
    private fun startSearchActivity() {
        intent = Intent(this, SearchActivity::class.java)
        startActivity(intent)
    }

//--------------------------------------------------------------------------------------------------

    /**
     * start saved activity from main activity
     */
    private fun startSavedActivity() {
        intent = Intent(this, SavedActivity::class.java)
        startActivity(intent)
    }

//--------------------------------------------------------------------------------------------------

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSaved.setOnClickListener { startSavedActivity() }
        btnSearch.setOnClickListener { startSearchActivity() }
    }
}
