package com.eduardo.androidtestinglab

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {
    private lateinit var resourceComparer: ResourceComparer
    private lateinit var context: Context

    @Before
    fun setup(){
        resourceComparer = ResourceComparer()
        context = ApplicationProvider.getApplicationContext()
    }

    @After
    fun closing(){
        // can be use for release some resource or get back to original
    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        //val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "AndroidTestingLab")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        //val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "Hello")
        assertThat(result).isFalse()
    }
}