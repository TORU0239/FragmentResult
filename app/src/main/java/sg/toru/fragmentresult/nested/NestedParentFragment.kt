package sg.toru.fragmentresult.nested

import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentResultListener
import sg.toru.fragmentresult.R


class NestedParentFragment : Fragment(R.layout.fragment_nested_parent) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        childFragmentManager.setFragmentResultListener(
            "NESTED_REQUEST_KEY",
            this,
            FragmentResultListener { _, result ->
                textFromChild.text = result.getString("typed")
            }
        )
    }

    private lateinit var textFromChild:TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textFromChild = view.findViewById(R.id.txt_from_child)
    }
}