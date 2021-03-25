package br.com.fiap.nac01.rm86288_rm84575_rm86484

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imgDisplay : ImageView
    var posicao = 0

    val imgs = intArrayOf(
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgDisplay = findViewById(R.id.imgGaleria01)

    }

    fun proximaFoto(view: View) {

        var img = imgDisplay.resources.

        val aa = view.img

        img.id;

        imgDisplay.setImageResource(imgs[posicao])
    }

    fun fotoAnterior(view: View) {

        posicao = posicao - 1
        imgDisplay.setImageResource(imgs[posicao])
    }

}