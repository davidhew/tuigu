package com.tuigu

class StockAllIndicators {
	String stockCode;
	Date openDate;
	BigDecimal maDiff
	BigDecimal priceVelocity
	BigDecimal priceAcceleration
	BigDecimal priceCubic
	BigDecimal rsi
	BigDecimal fastK
	BigDecimal fastD
	BigDecimal adx
	BigDecimal minAdx
	BigDecimal residualMinAdx
	BigDecimal maxAdx
	BigDecimal residualMaxAdx
	BigDecimal deltaAdx
	BigDecimal accelAdx
	BigDecimal intensity
	BigDecimal deltaIntensity
	BigDecimal reactiv
	BigDecimal deltaReactiv
	BigDecimal minReactiv
	BigDecimal maxReactiv
	BigDecimal aroonIndicator
	BigDecimal cmo
	BigDecimal vhf
	BigDecimal close2Close
	BigDecimal nDayHigh
	BigDecimal nDayLow
	BigDecimal closeMinusMa
	BigDecimal linearDeviation
	BigDecimal quadraticDeviation
	BigDecimal cubicDeviation
	BigDecimal detrendRSI
	BigDecimal absPriceChange
	BigDecimal priceVarianceRatio
	BigDecimal minPriceVariance
	BigDecimal maxPriceVariance
	BigDecimal changeVarianceRatio
	BigDecimal minChangeVariance
	BigDecimal maxChangeVariance
	BigDecimal atrRatio
	BigDecimal deltaPriceVariance
	BigDecimal deltaChangeVariance
	BigDecimal deltaAtrRatio
	BigDecimal bollingerWidth
	BigDecimal deltaBollinger
	BigDecimal nDayNarrower
	BigDecimal nDayWider
	BigDecimal bollingerBands
	BigDecimal chaikinvolatility
	BigDecimal clv
	BigDecimal priceSkewness
	BigDecimal deltaPriceSkewness
	BigDecimal changeSkewness
	BigDecimal deltaChangeSkewness
	BigDecimal priceKurtosis
	BigDecimal deltaPriceKurtosis
	BigDecimal changeKurtosis
	BigDecimal deltaChangeKurtosis
	BigDecimal volumeMomentum
	BigDecimal deltaVolumeMomentum
	BigDecimal volumeWeightedMA
	BigDecimal diffVolumeWeightedMA
	BigDecimal priceVolumeFit
	BigDecimal diffPriceVolumeFit
	BigDecimal deltaPriceVolumeFit
	BigDecimal balanceVolume
	BigDecimal deltaBalanceVolume
	BigDecimal positiveVolume
	BigDecimal deltaPositiveVolume
	BigDecimal negativeVolume
	BigDecimal deltaNegativeVolume
	BigDecimal productPriceVolume
	BigDecimal deltaProductPriceVolume
	BigDecimal sumPriceVolume
	BigDecimal deltaSumPriceVolume
	BigDecimal chaikinad
	BigDecimal cmf
	BigDecimal mfi
	BigDecimal priceEntropy
	BigDecimal volumeEntropy
	BigDecimal priceMutual
	BigDecimal volumeMutual
	static mapping = {
		maDiff sqlType: "decimal(9,6)"
		priceVelocity sqlType: "decimal(9,6)"
		priceAcceleration sqlType: "decimal(9,6)"
		priceCubic sqlType: "decimal(9,6)"
		rsi sqlType: "decimal(9,6)"
		fastK sqlType: "decimal(9,6)"
		fastD sqlType: "decimal(9,6)"
		adx sqlType: "decimal(9,6)"
		minAdx sqlType: "decimal(9,6)"
		residualMinAdx sqlType: "decimal(9,6)"
		maxAdx sqlType: "decimal(9,6)"
		residualMaxAdx sqlType: "decimal(9,6)"
		deltaAdx sqlType: "decimal(9,6)"
		accelAdx sqlType: "decimal(9,6)"
		intensity sqlType: "decimal(9,6)"
		deltaIntensity sqlType: "decimal(9,6)"
		reactiv sqlType: "decimal(9,6)"
		deltaReactiv sqlType: "decimal(9,6)"
		minReactiv sqlType: "decimal(9,6)"
		maxReactiv sqlType: "decimal(9,6)"
		aroonIndicator sqlType: "decimal(9,6)"
		cmo sqlType: "decimal(9,6)"
		vhf sqlType: "decimal(9,6)"
		close2Close sqlType: "decimal(9,6)"
		nDayHigh sqlType: "decimal(9,6)"
		nDayLow sqlType: "decimal(9,6)"
		closeMinusMa sqlType: "decimal(9,6)"
		linearDeviation sqlType: "decimal(9,6)"
		quadraticDeviation sqlType: "decimal(9,6)"
		cubicDeviation sqlType: "decimal(9,6)"
		detrendRSI sqlType: "decimal(9,6)"
		absPriceChange sqlType: "decimal(9,6)"
		priceVarianceRatio sqlType: "decimal(9,6)"
		minPriceVariance sqlType: "decimal(9,6)"
		maxPriceVariance sqlType: "decimal(9,6)"
		changeVarianceRatio sqlType: "decimal(9,6)"
		minChangeVariance sqlType: "decimal(9,6)"
		maxChangeVariance sqlType: "decimal(9,6)"
		atrRatio sqlType: "decimal(9,6)"
		deltaPriceVariance sqlType: "decimal(9,6)"
		deltaChangeVariance sqlType: "decimal(9,6)"
		deltaAtrRatio sqlType: "decimal(9,6)"
		bollingerWidth sqlType: "decimal(9,6)"
		deltaBollinger sqlType: "decimal(9,6)"
		nDayNarrower sqlType: "decimal(9,6)"
		nDayWider sqlType: "decimal(9,6)"
		bollingerBands sqlType: "decimal(9,6)"
		chaikinvolatility sqlType: "decimal(9,6)"
		clv sqlType: "decimal(9,6)"
		priceSkewness sqlType: "decimal(9,6)"
		deltaPriceSkewness sqlType: "decimal(9,6)"
		changeSkewness sqlType: "decimal(9,6)"
		deltaChangeSkewness sqlType: "decimal(9,6)"
		priceKurtosis sqlType: "decimal(9,6)"
		deltaPriceKurtosis sqlType: "decimal(9,6)"
		changeKurtosis sqlType: "decimal(9,6)"
		deltaChangeKurtosis sqlType: "decimal(9,6)"
		volumeMomentum sqlType: "decimal(9,6)"
		deltaVolumeMomentum sqlType: "decimal(9,6)"
		volumeWeightedMA sqlType: "decimal(9,6)"
		diffVolumeWeightedMA sqlType: "decimal(9,6)"
		priceVolumeFit sqlType: "decimal(9,6)"
		diffPriceVolumeFit sqlType: "decimal(9,6)"
		deltaPriceVolumeFit sqlType: "decimal(9,6)"
		balanceVolume sqlType: "decimal(9,6)"
		deltaBalanceVolume sqlType: "decimal(9,6)"
		positiveVolume sqlType: "decimal(9,6)"
		deltaPositiveVolume sqlType: "decimal(9,6)"
		negativeVolume sqlType: "decimal(9,6)"
		deltaNegativeVolume sqlType: "decimal(9,6)"
		productPriceVolume sqlType: "decimal(9,6)"
		deltaProductPriceVolume sqlType: "decimal(9,6)"
		sumPriceVolume sqlType: "decimal(9,6)"
		deltaSumPriceVolume sqlType: "decimal(9,6)"
		chaikinad sqlType: "decimal(9,6)"
		cmf sqlType: "decimal(9,6)"
		mfi sqlType: "decimal(9,6)"
		priceEntropy sqlType: "decimal(9,6)"
		volumeEntropy sqlType: "decimal(9,6)"
		priceMutual sqlType: "decimal(9,6)"
		volumeMutual sqlType: "decimal(9,6)"
	}
}
