package com.blogspot.buildsmartlife.androidmultimodule.navigation

import com.blogspot.buildsmartlife.common_utils.Activities
import com.blogspot.buildsmartlife.common_utils.Navigator
import com.blogspot.buildsmartlife.news_presentation.GotoNewsActivity
import com.blogspot.buildsmartlife.search_presentation.GotoSearchActivity

class DefaultNavigator : Navigator.Provider {

    override fun getActivities(activities: Activities): Navigator {
        return when (activities) {
            Activities.NewsActivities -> {
                GotoNewsActivity
            }

            Activities.SearchActivities -> {
                GotoSearchActivity
            }
        }
    }
}
