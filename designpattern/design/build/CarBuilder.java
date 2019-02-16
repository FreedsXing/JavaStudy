package design.build;

public interface CarBuilder {

	Car build();
	CarBuilder setWheels(int wheels);
	CarBuilder setColor(String colors);
}
