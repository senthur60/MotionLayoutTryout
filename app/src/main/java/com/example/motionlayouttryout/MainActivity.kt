package com.example.motionlayouttryout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.constraintlayout.widget.ConstraintSet
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*val motionLayout = MotionLayout(this)
        val constraint = ConstraintSet.Constraint()
        constraint.transform.apply {
            rotationX =90f
        }
        val constraintSet = ConstraintSet()
        constraintSet.customAttributeSet
        val motionScene = MotionScene(motionLayout)
        motionScene.setConstraintSet(constraintSet)
        val transition = MotionScene.Transition()
        motionLayout.definedTransitions.ad
        motionLayout.setConstraintSet()*/
    }
}
