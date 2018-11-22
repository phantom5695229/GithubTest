package svnCarTest;

public class CarDaoImpl implements ICarDao{
	private Car[] cars;
	private int index;

	public CarDaoImpl() {
		cars = new Car[10];
	}
	public CarDaoImpl(int size) {
		cars = new Car[size];
	}

	@Override
	public boolean save(Car car) {
		if(index < cars.length){
			cars[index++] = car;
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String carId) {
		for(int i = 0 ; i < index ; i++){
			if(cars[i].getCarId().equals(carId)){
				for(int j = i ; j <index -1 ; j++){
					cars[j] = cars[j+1];
					
				}
				index--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Car quryById(String carId) {
		for(int i = 0; i < index; i++){
			if(cars[i].getCarId().equals(carId)){
				return cars[i];
			}
		}
		return null;
	}

	@Override
	public Car[] quryByType(String type) {
		int count = 0;
		for (int i = 0 ; i < index ; i++) {
			if (type.equals(cars[i].getType())) {
				count++;
			}
		}
		if (0 == count) {
			return null;
		}
		
		Car[] cs = new Car[count];
		int pos = 0;
		for (int i = 0 ; i < index ; i++) {
			if (type.equals(cars[i].getType())) {
				cs[pos++] = cars[i];
			}
		}
		return cs;
	}

	@Override
	public Car[] quryByBrand(String brand) {
		int count = 0 ;
		for(int j = 0 ; j < index ; j++){
			if(cars[j].getBrind().equals(brand)){
				count++;
			}
		}if( 0== count){
		return null;
		}
		Car[] cs = new Car[count];
		for(int i = 0  ; i < index ; i++){
			if(cars[i].getBrind().equals(brand)){
				cs[--count] = cars[i];
			}
		}return cs;
	}

	@Override
	public Car[] quryAll() {
		Car[] cs = new Car[index];
		System.arraycopy(cars, 0, cs, 0, index);
		return cs;
	}

}
