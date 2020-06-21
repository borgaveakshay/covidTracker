package com.covidtracker.home.data

import com.covidtracker.home.presentation.CovidSummary
import io.reactivex.rxjava3.core.Observable

interface CovidSummaryRepository {

    fun getSummary(): Observable<CovidSummary>

}