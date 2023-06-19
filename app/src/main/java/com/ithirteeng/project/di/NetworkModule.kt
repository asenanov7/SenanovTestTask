package com.ithirteeng.project.di

import com.ithirteeng.project.network.okhttp.setupOkHttpClient
import com.ithirteeng.project.network.provideLoggingInterceptor
import com.ithirteeng.project.network.provideNetworkConnectionInterceptor
import com.ithirteeng.project.network.provideRetrofit
import org.koin.dsl.module

val networkModule = module {
    factory { provideLoggingInterceptor() }
    factory { provideNetworkConnectionInterceptor(context = get()) }

    single { provideRetrofit(okHttpClient = get()) }

    single {
        setupOkHttpClient(
            loggingInterceptor = get(),
            networkConnectionInterceptor = get()
        )
    }

}