package com.stockedge.lib

data class StockData(
    val metaData: Map<String, String>,
    val timeSeriesDaily: Map<String, Map<String, String>>
)