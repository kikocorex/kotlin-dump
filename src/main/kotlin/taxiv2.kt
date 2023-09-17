class Taxi(val taxiNumber: String, val baseFare: Double, val perKilometerRate: Double) {
    private var isBooked: Boolean = false

    operator fun invoke() {
        if (!isBooked) {
            println("Taxi $taxiNumber has been booked.")
            isBooked = true
        } else {
            println("Taxi $taxiNumber is already booked.")
        }
    }

    // Calculate the fare
    inline fun calculateFare(distance: Double, fareCalculator: (Double) -> Double): Double {
        return fareCalculator(distance)
    }
}

fun main() {
    val taxi1 = Taxi("T123", 40.0, 13.0) //crt obj of taxi1
    val taxi2 = Taxi("T456", 40.0, 15.0) //crt obj of taxi2

    taxi1() // Book taxi1
    taxi2() // Book taxi2

    val distanceInKilometers = 7.5 //test

    val fare1 = taxi1.calculateFare(distanceInKilometers) { distance ->
        taxi1.baseFare + (distance * taxi1.perKilometerRate)
    }

    val fare2 = taxi2.calculateFare(distanceInKilometers) { distance ->
        taxi2.baseFare + (distance * taxi2.perKilometerRate)
    }

    println("Taxi Fare for $distanceInKilometers kilometers for Taxi ${taxi1.taxiNumber}: ₱$fare1")
    println("Taxi Fare for $distanceInKilometers kilometers for Taxi ${taxi2.taxiNumber}: ₱$fare2")
}
