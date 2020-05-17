package sg.toru.fragmentresult.send

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.fragment.app.setFragmentResultListener
import sg.toru.fragmentresult.R

class SendResultFragment : Fragment(R.layout.fragment_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("requestKey"){ _, bundle ->
            Toast.makeText(context, "content: ${bundle.getString("name")}", Toast.LENGTH_SHORT).show()
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = SendResultFragment()
    }
}