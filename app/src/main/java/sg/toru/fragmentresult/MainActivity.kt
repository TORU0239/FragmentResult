package sg.toru.fragmentresult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null) {
            startMainFragment()
        }
    }

    private fun startMainFragment() {
        supportFragmentManager.beginTransaction()
                .add(R.id.container, MainFragment::class.java, null)
                .commit()
    }
}