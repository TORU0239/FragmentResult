package sg.toru.fragmentresult

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResultListener

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setFragmentResultListener("requestKey"){ resultKey, bundle ->
            Toast.makeText(context, "result Key: $resultKey", Toast.LENGTH_SHORT).show()
        }
    }

    private lateinit var edNameField:EditText
    private lateinit var btnSendData:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edNameField = view.findViewById(R.id.edNameField)
        btnSendData = view.findViewById(R.id.btnSendDataFromA)
        btnSendData.setOnClickListener {

        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}