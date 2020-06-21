package com.covidtracker.home.data.repository

import com.covidtracker.home.data.CovidSummaryRepository
import com.covidtracker.home.presentation.CovidSummary
import io.reactivex.rxjava3.core.Observable

class CovidSummaryRepositoryImpl : CovidSummaryRepository {

    override fun getSummary(): Observable<CovidSummary> {
        TODO("Not yet implemented")
    }
}