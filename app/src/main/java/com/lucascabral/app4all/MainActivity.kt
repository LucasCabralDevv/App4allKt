package com.lucascabral.app4all

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainTimestampButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val id = view.id
        if (id == R.id.mainTimestampButton) {

            val timestampLong: Long = System.currentTimeMillis()
            val timestamp: String = timestampLong.toString()
            val timestampLastChar = timestamp.substring(timestamp.length - 1)

            setBackgroundColor(timestampLastChar)
        }
    }

    private fun setBackgroundColor(lastChar: String) {

        when (lastChar) {
            "0" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.White
                )
            )
            "1" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Black
                )
            )
            "2" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Blue
                )
            )
            "3" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Green
                )
            )
            "4" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Pink
                )
            )
            "5" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Red
                )
            )
            "6" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Purple
                )
            )
            "7" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Yellow
                )
            )
            "8" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Grey
                )
            )
            "9" -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Lilac
                )
            )
        }

        if (lastChar == "1") {
            mainTitleTextView.setTextColor(ContextCompat.getColor(this, R.color.White))
        } else {
            mainTitleTextView.setTextColor(ContextCompat.getColor(this, R.color.Black))
        }
    }
}