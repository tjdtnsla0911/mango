package org.techtown.manggo_contents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        //스플래쉬 하면
        Handler().postDelayed({
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },3000)

    }
}