package com.blogspot.buildsmartlife.common_utils

import android.app.Activity

interface Navigator {
    fun navigator(activity: Activity)
    interface Provider {
        fun getActivities(activities: Activities): Navigator
    }
}