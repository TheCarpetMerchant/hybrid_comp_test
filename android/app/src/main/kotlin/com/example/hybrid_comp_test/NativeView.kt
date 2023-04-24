package com.example.hybrid_comp_test

import android.content.Context
import android.view.View
import android.widget.TextView
import androidx.core.text.HtmlCompat
import io.flutter.plugin.platform.PlatformView

class NativeView(
    context: Context,
) : PlatformView {
    private val textView: TextView

    override fun getView(): View {
        return textView
    }

    override fun dispose() {}

    init {
        textView = TextView(context)
        textView.text = HtmlCompat.fromHtml("<p>Text</p>", 0)
    }
}