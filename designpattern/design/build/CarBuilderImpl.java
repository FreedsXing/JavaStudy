package design.build;

public class CarBuilderImpl implements CarBuilder{
	
	Car carTmp;
	 
	void CarBuildImpl(){
		carTmp = new Car();
	}
	

	@Override
	public Car build() {
		Car car = new Car();
		car.setColor(carTmp.getColor());
		car.setWheels(carTmp.getWheels());
		return car;
	}

	@Override
	public CarBuilder setWheels( int wheels) {
		carTmp.setWheels(wheels);
		return this;
	}

	@Override
	public CarBuilder setColor(String colors) {
		carTmp.setColor(colors);
		return this;
	}

}
