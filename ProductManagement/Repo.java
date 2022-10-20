import org.springframework.data.jpa.repository.JpaRepository;
import com.training.springboot.model.Product;

public interface Repo extends JpaRepository<Product, Integer> {
	
}