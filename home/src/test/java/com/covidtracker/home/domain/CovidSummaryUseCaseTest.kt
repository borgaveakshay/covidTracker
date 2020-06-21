package com.covidtracker.home.domain

import com.covid.test_base.TestTransformation
import com.covidtracker.home.data.CovidSummaryRepository
import com.covidtracker.home.testData.TestUtils
import io.reactivex.rxjava3.core.Observable
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class CovidSummaryUseCaseTest {
    private val repository = mock(CovidSummaryRepository::class.java)

    @Test
    fun when_covid_summary_fetched_successfully() {
        // GIVEN
        givenSuccessfulCovidSummary()
        // WHEN
        val observer = CovidSummaryUseCase(TestTransformation(), repository).observable()
        // THEN
        observer.test().assertNoErrors()
            .assertComplete()
            .assertValue {
                it.countries?.size == 3
            }
    }

    @Test
    fun when_covid_summary_fetched_unsuccessfully() {
        // GIVEN
        val exception = Exception()
        givenUnSuccessfulCovidSummary(exception)
        // WHEN
        val observer = CovidSummaryUseCase(TestTransformation(), repository).observable()
        // THEN
        observer.test()
            .assertNotComplete()
            .assertError(exception)
    }

    private fun givenSuccessfulCovidSummary() {
        `when`(repository.getSummary()).thenReturn(Observable.just(TestUtils.getCovidSummary()))
    }

    private fun givenUnSuccessfulCovidSummary(exception: Exception) {
        `when`(repository.getSummary()).thenReturn(Observable.error(exception))
    }
}