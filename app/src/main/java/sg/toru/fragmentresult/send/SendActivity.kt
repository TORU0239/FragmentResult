package sg.toru.fragmentresult.send

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sg.toru.fragmentresult.R

class SendActivity : AppCompatActivity(R.layout.activity_send) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState == null) {
            initSendFragment()
        }
    }

    private fun initSendFragment() {
        supportFragmentManager.beginTransaction()
            .add(R.id.container, SendMainFragment::class.java, null)
            .commit()
    }
}