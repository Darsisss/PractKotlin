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
            fragmentSendDataListener!!.onSendData("Птицы выведены в Армянской ССР на основе род-айлендов и нью-гемпширов.\n" +
                    "        Их скрещивали с закавказскими несушками (на долю местных кур пришлось 3/4 племенного ядра).\n" +
                    "        Селекционные работы заняли четверть века. Полученную породу по показателям продуктивности отнесли к мясо-яичному направлению")
        }

        val but2 = view.findViewById<ImageButton>(R.id.imageButton7)

        but2.setOnClickListener(){
            fragmentSendDataListener!!.onSendData("Китайские шелковые куры весьма популярны за пределами Поднебесной и считаются универсальной породой,\n" +
                    "        сочетающей возможности для декоративного разведения и получения высококачественного мяса.\n" +
                    "        Экзотическое происхождение придаёт им особое очарование.")
        }

        return view

    }

    fun erevan(view: View) {

        fragmentSendDataListener!!.onSendData("Эрик ")
    }




    fun china(view: View) {
        fragmentSendDataListener!!.onSendData("Эрик chort")
    }

    fun chort(view: View) {
        fragmentSendDataListener!!.onSendData("Эрик chort")
    }


}


