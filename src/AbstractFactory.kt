import kotlin.reflect.typeOf

class AbstractFactory private constructor() {


    companion object{
        private var car: factory<Car>? = null
        private var aircraftFactory: factory<Aircraft>? = null


        fun getAircraftFactory(): factory<Aircraft>?{
            if(aircraft == null)
                aircraft = AircraftFactory()

            return aircraftFactory
        }



        fun getCarFactory(): factory<Car>?{
            if(car == null)
                car = CarFactory()

            return carFactory
        }


    }
}