package com.bochkarev.mikhail.cryptocurrencyapp.di

import com.bochkarev.mikhail.cryptocurrencyapp.common.Constants
import com.bochkarev.mikhail.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.bochkarev.mikhail.cryptocurrencyapp.data.repository.CoinRepositoryImpl
import com.bochkarev.mikhail.cryptocurrencyapp.domain.repository.CoinRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

	@Provides
	@Singleton
	fun providesPaprikaApi(): CoinPaprikaApi {
		return Retrofit.Builder()
			.baseUrl(Constants.BASE_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.build()
			.create(CoinPaprikaApi::class.java)
	}

	@Provides
	@Singleton
	fun provideCoinRepository(api: CoinPaprikaApi): CoinRepository {
		return CoinRepositoryImpl(api)
	}

}