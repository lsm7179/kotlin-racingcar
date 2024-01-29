package controller

import domain.Car
import domain.GamingCars
import service.GameService

class GameController(val gameService: GameService) {

    fun gaming() {
        val gamingCars:GamingCars = gameService.createCar()

        gameService.tryMoving(gamingCars)

        gameService.winGame(gamingCars)
    }
}