package sg.toru.fragmentresult.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import sg.toru.fragmentresult.R
import sg.toru.fragmentresult.send.SendActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private lateinit var btnParentChild:Button
    private lateinit var btnSending:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        btnSending = findViewById(R.id.btnMultipleFragment)
        btnParentChild = findViewById(R.id.btnNestedFragment)

        btnSending.setOnClickListener {
            startActivity(Intent(this@MainActivity, SendActivity::class.java))
        }

        btnParentChild.setOnClickListener {

        }
    }
}