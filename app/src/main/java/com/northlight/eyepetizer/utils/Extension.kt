package com.northlight.eyepetizer.utils

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.view.Gravity
import android.widget.Toast

/**
 * author : 祝天康
 * tips   :
 * date   : 2017/12/6 10:52
 */
//fun Context.showToast(message: String){
//    Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
//}

inline fun <reified T : Activity> Activity.newIntent() {
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}

fun Context.showToast(message: String): Toast {
    val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
    toast.setGravity(Gravity.CENTER, 0, 0)
    toast.show()
    return toast
}