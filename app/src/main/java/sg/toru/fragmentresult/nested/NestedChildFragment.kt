package sg.toru.fragmentresult.nested

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import sg.toru.fragmentresult.R


class NestedChildFragment : Fragment(R.layout.fragment_nested_child) {

    private lateinit var editText: EditText
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        editText = view.findViewById(R.id.ed_nested_typing)
        button = view.findViewById(R.id.btn_nested_send)

        button.setOnClickListener {
            if(editText.editableText.isEmpty()) return@setOnClickListener
            setFragmentResult("NESTED_REQUEST_KEY", bundleOf("typed" to editText.editableText.toString()))
        }
    }
}