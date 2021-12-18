package com.example.affirmations

import android.content.Context
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock


@RunWith(AndroidJUnit4::class)
class AffirmationsAdapterTests {

    // since unit test runs on the jvm & not on an actual device
    //mock() from the mockito library creates a fake or mocked instance of context,
    // which is the present state of the application, it is not needed here,
    // but is useful in test that require Context

    private val context = mock(Context::class.java)

    @Test
    fun adapter_size(){
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }

}