package com.blogspot.buildsmartlife.androidmultimodule

import com.blogspot.buildsmartlife.androidmultimodule.navigation.DefaultNavigator
import com.blogspot.buildsmartlife.common_utils.Navigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object MainModule {
    @Provides
    @Singleton
    fun provideProvider(): Navigator.Provider {
        return DefaultNavigator()
    }
}