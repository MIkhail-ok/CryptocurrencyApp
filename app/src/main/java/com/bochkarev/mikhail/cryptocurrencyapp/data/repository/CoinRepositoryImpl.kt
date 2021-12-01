package com.bochkarev.mikhail.cryptocurrencyapp.data.repository

import com.bochkarev.mikhail.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.bochkarev.mikhail.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.bochkarev.mikhail.cryptocurrencyapp.data.remote.dto.CoinDto
import com.bochkarev.mikhail.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
	private val api: CoinPaprikaApi
) : CoinRepository {

	override suspend fun getCoins(): List<CoinDto> {
		return api.getCoins()
	}

	override suspend fun getCoinById(coinId: String): CoinDetailDto {
		return api.getCoinById(coinId)
	}
}