package com.rbrooks.indefinitepagerindicator

import android.content.Context
import android.util.AttributeSet

class IndefinitePagerIndicatorRtL @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : IndefinitePagerIndicator(context, attrs, defStyle) {

    override var supportRtl: Boolean = true

    override fun isRtl(): Boolean = true

}