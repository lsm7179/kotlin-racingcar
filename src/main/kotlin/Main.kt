import controller.GameController
import service.GameService

fun main() {
    GameController(GameService()).gaming()
}