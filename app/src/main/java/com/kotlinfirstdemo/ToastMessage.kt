package com.kotlinfirstdemo

import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.support.design.widget.Snackbar
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.muddzdev.styleabletoastlibrary.StyleableToast

object ToastMessage {


    fun toasterMsgShot(context: Context, msg: String) {
        StyleableToast.Builder(context)
                .duration(Toast.LENGTH_SHORT)
                .icon(R.drawable.ic_autorenew_black_24dp)
                .spinIcon()
                .text(msg)
                .textColor(Color.WHITE)
                .backgroundColor(Color.parseColor("#184c6d"))
                .build()
                .show()
    }

    fun toastMsgShot(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }

    fun toastMsgLong(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    fun toastMsgLongPassMin6(context: Context) {
        Toast.makeText(context, "Password should be minimum of 6 digits.", Toast.LENGTH_LONG).show()
    }

    fun toastMsgNoInternet(context: Context) {
        Toast.makeText(context, "No Internet Connection", Toast.LENGTH_LONG)
                .show()
    }

    fun toastMsgFailed(context: Context) {
        Toast.makeText(context, "Failed! try again", Toast.LENGTH_LONG).show()
    }

    fun snackBarMsgIndefinite(mLayout: View, msg: String) {
        val snackbar = Snackbar.make(mLayout, msg, Snackbar.LENGTH_INDEFINITE)

        val snackbarView = snackbar.view
        val textView = snackbarView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
        textView.maxLines = 5

        snackbar.setAction("OK") { }
        snackbar.show()

    }

    fun snackBarMsgIndefinite(activity: Activity, msg: String) {
        val mLayout = activity.findViewById<View>(android.R.id.content)
        val snackbar = Snackbar.make(mLayout, msg, Snackbar.LENGTH_INDEFINITE)
        val snackBarView = snackbar.view
        val textView = snackBarView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
        textView.maxLines = 5

        snackbar.setAction("OK") { }
        snackbar.show()
    }

    fun snackBarMsgIndefiniteNoInternet(activity: Activity) {
        val mLayout = activity.findViewById<View>(android.R.id.content)

        val snackbar = Snackbar.make(mLayout, "No Internet Connection", Snackbar.LENGTH_INDEFINITE)

        val snackBarView = snackbar.view
        val textView = snackBarView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
        textView.maxLines = 5

        snackbar.setAction("OK") { }
        snackbar.show()

    }

    fun snackBarMsg(activity: Activity, msg: String) {
        val mLayout = activity.findViewById<View>(android.R.id.content)
        val snackbar = Snackbar.make(mLayout, msg, Snackbar.LENGTH_LONG)
        val snackbarView = snackbar.view
        val textView = snackbarView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
        textView.maxLines = 5

        snackbar.show()
    }

    fun snackBarMsgIndefiniteNeedLogin(activity: Activity) {
        val mLayout = activity.findViewById<View>(android.R.id.content)

        val snackbar = Snackbar.make(mLayout, "You need to login to view this.", Snackbar.LENGTH_INDEFINITE)

        val snackbarView = snackbar.view
        val textView = snackbarView.findViewById<View>(android.support.design.R.id.snackbar_text) as TextView
        textView.maxLines = 5

        snackbar.setAction("OK") { }
        snackbar.show()
    }

}
