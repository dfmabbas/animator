package com.github.okabbas.FabAnimator.anim

import android.animation.ValueAnimator
import android.support.design.widget.FloatingActionButton
import android.view.animation.AccelerateInterpolator


internal class AnimAnimator(private val duration: Long) {
    internal fun playJumpAnim(fab: FloatingActionButton): ValueAnimator {
        val scale = fab.scaleX

        val valueAnimator = ValueAnimator.ofFloat(scale, scale + 0.2F
                , scale + 0.1F, scale)

        valueAnimator.addUpdateListener {
            fab.scaleX = it.animatedValue as Float
            fab.scaleY = it.animatedValue as Float
        }

        valueAnimator.repeatCount = ValueAnimator.INFINITE
        valueAnimator.repeatMode = ValueAnimator.REVERSE
        valueAnimator.interpolator = AccelerateInterpolator(3F)
        valueAnimator.duration = duration

        return valueAnimator
    }

    internal fun playBlinkerAnim(fab: FloatingActionButton): ValueAnimator {
        val valueAnimator = ValueAnimator.ofFloat(fab.alpha, fab.alpha - 1F, fab.alpha)
        valueAnimator.addUpdateListener {
            fab.alpha = it.animatedValue as Float
        }

        valueAnimator.repeatCount = ValueAnimator.INFINITE
        valueAnimator.repeatMode = ValueAnimator.REVERSE
        valueAnimator.interpolator = AccelerateInterpolator(2F)
        valueAnimator.duration = duration

        return valueAnimator
    }

    //developing
    internal fun playtest1(fab: FloatingActionButton): ValueAnimator {
        val scale = fab.scaleX

        val valueAnimator = ValueAnimator.ofFloat(scale, scale + 0.2F)

        valueAnimator.addUpdateListener {
            fab.scaleX = it.animatedValue as Float
            fab.scaleY = it.animatedValue as Float
        }

        valueAnimator.repeatCount = ValueAnimator.INFINITE
        valueAnimator.repeatMode = ValueAnimator.REVERSE
        valueAnimator.interpolator = AccelerateInterpolator(3F)
        valueAnimator.duration = duration

        return valueAnimator
    }

    //developing
    internal fun playtest2(fab: FloatingActionButton): ValueAnimator {
        val valueAnimator = ValueAnimator.ofFloat(fab.scaleX, fab.scaleX + 0.10F,
                fab.scaleX - 0.10F, fab.scaleX + 0.07F, fab.scaleX - 0.07F)

        valueAnimator.addUpdateListener {
            fab.scaleX = it.animatedValue as Float
            fab.scaleY = it.animatedValue as Float
        }

        valueAnimator.repeatCount = ValueAnimator.INFINITE
        valueAnimator.repeatMode = ValueAnimator.REVERSE
        valueAnimator.interpolator = AccelerateInterpolator(3F)
        valueAnimator.duration = duration

        return valueAnimator
    }

    fun stopAnimation(fab: FloatingActionButton) {
        fab.clearAnimation()
    }
}