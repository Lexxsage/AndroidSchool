package com.example.task3

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.task3.databinding.ListLayBinding

class ListTileView @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
): FrameLayout(context, attributeSet, defStyleAttr, defStyleRes) {

    private val binding: ListLayBinding =
        ListLayBinding.inflate(LayoutInflater.from(context),  this,  true)

    init {
        context.theme.obtainStyledAttributes(attributeSet,
            R.styleable.ListTitleView,
            defStyleAttr,
            0
        ).run {
            try {
                binding.leading.setImageDrawable(
                    getDrawable(R.styleable.ListTitleView_image))
                binding.textView.text = getString(R.styleable.ListTitleView_android_text)
            } finally {
                recycle()
            }

        }
    }
}
