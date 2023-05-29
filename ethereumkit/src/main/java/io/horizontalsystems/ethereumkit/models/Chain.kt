package io.horizontalsystems.ethereumkit.models

open class Chain(
    val id: Int,
    val coinType: Int,
    val gasLimit: Long,
    val syncInterval: Long,
    val isEIP1559Supported: Boolean
) {
    object Ethereum : Chain(1, 60, 2_000_000, 15, true)
    object BinanceSmartChain : Chain(56, 60, 10_000_000, 15, false)
    object Polygon : Chain(137, 60, 10_000_000, 15, true)
    object Optimism : Chain(10, 60, 10_000_000, 15, false)
    object ArbitrumOne : Chain(42161, 60, 10_000_000, 15, false)
    object Avalanche : Chain(43114, 60, 10_000_000, 15, true)
    object Gnosis : Chain(100, 60, 10_000_000, 15, true)
    object Fantom : Chain(250, 60, 10_000_000, 15, false)
    object EthereumGoerli : Chain(5, 1, 10_000_000, 15, true)

    val isMainNet = coinType != 1
    val name: String
        get() = javaClass.simpleName

    companion object {
        fun values() = arrayOf(
            Ethereum,
            BinanceSmartChain,
            Polygon,
            Optimism,
            ArbitrumOne,
            Avalanche,
            Gnosis,
            Fantom,
            EthereumGoerli
        )
    }
}
