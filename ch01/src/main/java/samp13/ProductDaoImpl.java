package samp13;
import org.springframework.stereotype.Component;
// @붙어 있는 것이 annotaion
@Component  // 객체(componet)로 만들어 줘라
public class ProductDaoImpl implements ProductDao {
	public Product getProduct(String name) {
		return new Product(name, 2000);
	}
}