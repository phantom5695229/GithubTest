package cmWithInterFace;

public interface ICarDao {
	boolean save(Car car);
	boolean delete(String num);
	Car queryByNum(String num);
	Car[] queryByType(String type);
	Car[] queryByBrand(String brand);
	Car[] queryAll();

}
