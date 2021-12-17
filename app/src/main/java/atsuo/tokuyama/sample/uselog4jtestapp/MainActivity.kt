package atsuo.tokuyama.sample.uselog4jtestapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        atsuo.tokuyama.sample.uselog4jlib.print()
    }
}