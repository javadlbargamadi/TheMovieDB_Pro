package com.example.themoviedbpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.themoviedbpro.base.BaseActivity

class SavedActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved)
    }
}
