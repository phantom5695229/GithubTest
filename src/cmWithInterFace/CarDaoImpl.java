package cmWithInterFace;

public class CarDaoImpl implements ICarDao{
	Car[] cars;
	int index;
	
	public CarDaoImpl(){
		cars = new Car[10];
	}
	public CarDaoImpl(int size){
		cars = new Car[size];
	}

	@Override
	public boolean save(Car car) {
		if (index < cars.length) {
			cars[index++] = car;
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String num) {
		for (int i = 0 ; i < index ; i++) {
			if (num.equals(cars[i].getNum())) {
				for (int j = i ; j < index - 1 ; j++) {
					cars[j] = cars[j+1];
				}
				index--;
				return true;
			}
		}
		return false;
	}

	@Override
	public Car queryByNum(String num) {
		for (int i = 0 ; i < index ; i++) {
			if (num.equals(cars[i].getNum())) {
				return cars[i];
			}
		}
		return null;
	}

	@Override
	public Car[] queryByType(String type) {
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
	public Car[] queryByBrand(String brand) {
		int count = 0 ;
		for (int i = 0 ; i < index ; i++) {
			if (brand.equals(cars[i].getBrand())) {
				count++;
			}
		}
		if (0 == count) {
			return null;
		}
		Car[] cs = new Car[count];
		int pos = 0;
		for (int i = 0 ; i < index ; i++) {
			if (brand.equals(cars[i].getBrand())) {
				cs[pos++] = cars[i];
			}
		}
		return cs;
	}

	@Override
	public Car[] queryAll() {
		Car[] cs = new Car[index];
		System.arraycopy(cars, 0, cs, 0, index);
		return cs;
	}

}
