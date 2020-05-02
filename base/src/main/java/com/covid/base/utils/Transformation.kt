package com.covid.base.utils

import io.reactivex.rxjava3.core.ObservableTransformer

/**
 * [Transformer] class provides implementation how a use case will be performed in terms of
 * threading , e.g for actual API calls the extend class needs to provide asynchronous transformer
 * which performs calls on a background thread, and on the other side for testing we will use the main
 * thread to perform the test on the use case using different transformer.
 */
abstract class Transformer<T>: ObservableTransformer<T,T>