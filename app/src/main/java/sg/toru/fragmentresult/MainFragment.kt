package sg.toru.fragmentresult

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private lateinit var edNameField:EditText
    private lateinit var btnSendData:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        edNameField = view.findViewById(R.id.edNameField)
        btnSendData = view.findViewById(R.id.btnSendDataFromA)
        btnSendData.setOnClickListener {
            if(edNameField.editableText.isEmpty()) return@setOnClickListener

            setFragmentResult("requestKey", bundleOf("name" to edNameField.editableText.toString()))
            parentFragmentManager.commit {
                replace(R.id.container, SecondFragment::class.java, null)
                addToBackStack(null)
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }
}