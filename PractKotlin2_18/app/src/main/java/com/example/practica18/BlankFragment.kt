package com.example.practica18

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton


class BlankFragment : Fragment() {
    internal interface OnFragmentSendDataListener {
        fun onSendData(data: String?)
    }

    private var fragmentSendDataListener: OnFragmentSendDataListener? = null
    override fun onAttach(context: Context) {
        super.onAttach(context)
        try {
            fragmentSendDataListener = context as OnFragmentSendDataListener
        } catch (e: ClassCastException) {
            throw ClassCastException(
                context.toString()
                        + " должен реализовывать интерфейс" +
                        "OnFragmentInteractionListener"
            )
        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_blank, container, false)


        val but1 = view.findViewById<ImageButton>(R.id.imageButton6)


        but1.setOnClickListener(){
            fragmentSendDataListener!!.onSendData("Сфинкс – бесшерстная кошка с поведением и характером собаки. Представители породы относятся к классу компаньонов.\n " +
                    "Поэтому нуждаются во внимании и совсем непохожи на независимых кошек, стремящихся держаться от человека на расстоянии.\n " +
                    "Животное ориентировано на взаимодействие, любит сидеть на коленях.")
        }

        val but2 = view.findViewById<ImageButton>(R.id.imageButton7)

        but2.setOnClickListener(){
            fragmentSendDataListener!!.onSendData("Этот дикий кот — самый медлительный и неповоротливый среди собратьев.\n" +
                    " Он не любит бегать и прыгать. Если все же приходится ускоряться, то зверь быстро устает.\n" +
                    "При этом манул — замечательный охотник. В этом ему помогает способность устраивать засады и\n " +
                    "оставаться неподвижным долгое время.")
        }
        return view
    }

}


