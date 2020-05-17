package sg.toru.fragmentresult.nested

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import sg.toru.fragmentresult.R

class NestedActivity : AppCompatActivity(R.layout.activity_nested) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(savedInstanceState == null) {
            supportFragmentManager.commit {
                add(R.id.container_nested, NestedParentFragment::class.java, null)
            }
        }
    }
}