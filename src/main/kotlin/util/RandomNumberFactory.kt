package util

object RandomNumberFactory {

    private const val FROM_NUMBER: Int = 0
    private const val UNTIL_NUMBER: Int = 9
    fun create(): Int {
        return (FROM_NUMBER..UNTIL_NUMBER).random()
    }


}
