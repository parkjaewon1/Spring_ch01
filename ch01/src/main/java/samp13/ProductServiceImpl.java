package samp13;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ProductServiceImpl implements ProductService{
	@Autowired // setter method가 필요 없음 // 생성된 객체와 연결
	private ProductDao pd;
	public Product getProduct() {
		return pd.getProduct("볼펜");
	}
}