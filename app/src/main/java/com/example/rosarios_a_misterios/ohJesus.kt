package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.commit

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ohJesus.newInstance] factory method to
 * create an instance of this fragment.
 */
class ohJesus : Fragment(R.layout.fragment_oh_jesus) {
    private var numMisterio=1
    private var numAvemaria=1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btn6)

        boton.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, MisterioDoloroso2.newInstance())
            }

        }
    }

    companion object {
        private const val NUM_MISTERIO="numMisterio"
        private const val NUM_AVEMARIAS="numAvemaria"
        fun newInstance() =
            ohJesus().apply {
                arguments= bundleOf(NUM_MISTERIO to numMisterio,NUM_AVEMARIAS to numAvemaria)
            }
    }
}