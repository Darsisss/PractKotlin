/*
* Необходимо создать приложение, которое по нажатию на кнопку будет запускать поток, обновляющий информацию
* об осях гироскопа устройства (найти что это такое и как получать данные), на котором запущено приложение.
* Приложение должно исключать возможность запуска нескольких потоков одновременно и включать возможность
* останавливать запущенный поток. Информация должна обновляться раз в 0.5 секунд
*/
package com.example.practice20

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var sensorManager: SensorManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun threadStarter():Runnable{
        val runnable:Runnable=Runnable{
            val textViewGyroscope:TextView=findViewById(R.id.textViewGyroscope)

            sensorManager=getSystemService(Context.SENSOR_SERVICE) as SensorManager
            val sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER)
            val sensorEventListener = object : SensorEventListener {
                override fun onAccuracyChanged(sensor: Sensor, accuracy: Int) {

                }
                override fun onSensorChanged(event: SensorEvent) {
                    val value = event?.values
                    textViewGyroscope.text="Ось X: ${value?.get(0)?.toInt()}" +
                            "\nОсь Y: ${value?.get(1)?.toInt()}" +
                            "\nОсь Z: ${value?.get(2)?.toInt()}"
                }
            }
            sensorManager.registerListener(sensorEventListener,sensor,SensorManager.SENSOR_DELAY_NORMAL)

        }
        return runnable
    }

    val thread=Thread(threadStarter())

    private var isOn:Boolean=true
    fun buttonThread_Click(view: View) {
        val buttonThread: Button = findViewById(R.id.buttonThread)

        if (isOn)
        {
            thread.start()
            buttonThread.setText(R.string.endThread)
            isOn=false
        }
        else
        {
            thread.interrupt()
            buttonThread.setText(R.string.startThread)
            isOn=true
        }
    }
}