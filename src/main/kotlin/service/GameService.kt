package service

import domain.Car
import domain.GamingCars

class GameService {
    fun createCar(): GamingCars {
        println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).")
        val names = readln()
        val carNames: List<String> = names.split(",")
        val Cars: List<Car> = carNames.map { name -> Car(name) }
        return GamingCars(Cars)
    }

    fun tryMoving(tryMovingCars: GamingCars) {
        println("시도할 회수는 몇회인가요?")
        val tryNumber: Int = readln().toInt()
        println()
        println("실행결과")
        for (i in 1..tryNumber) {
            tryMovingCars.movingForward()
            tryMovingCars.cars.forEach {
                println(it.name + " : " + calcDistanceView(it.distance))
            }
            println()
        }
    }

    private fun calcDistanceView(distance: Int): String {
        val distanceView = StringBuilder()
        for (i in 0..distance) {
            distanceView.append("-")
        }
        return distanceView.toString()
    }

    fun winGame(gamingCars: GamingCars) {
        val winnerCarsName = gamingCars.calcWinnerCars()
            .map(Car::name)
            .toList()
            .joinToString(", ")
        println(winnerCarsName + "가 최종 우승했습니다.")
    }
}
