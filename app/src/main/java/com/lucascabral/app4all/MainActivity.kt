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
            Colors.WHITE.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.White
                )
            )
            Colors.BLACK.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Black
                )
            )
            Colors.BLUE.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Blue
                )
            )
            Colors.GREEN.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Green
                )
            )
            Colors.PINK.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Pink
                )
            )
            Colors.RED.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Red
                )
            )
            Colors.PURPLE.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Purple
                )
            )
            Colors.YELLOW.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Yellow
                )
            )
            Colors.GREY.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Grey
                )
            )
            Colors.LILAC.lastChar -> mainConstraintLayout.setBackgroundColor(
                ContextCompat.getColor(
                    this,
                    R.color.Lilac
                )
            )
        }

        if (lastChar == Colors.BLACK.lastChar) {
            mainTitleTextView.setTextColor(ContextCompat.getColor(this, R.color.White))
        } else {
            mainTitleTextView.setTextColor(ContextCompat.getColor(this, R.color.Black))
        }
    }
}