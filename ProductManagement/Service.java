
public class Service {
	
	@Autowired
	Repo repo;
	
	
	
	public void save(Product product) {
		repo.save(product);
	}
	
	public List<Product> getProducts(){
		return repo.findAll();
	}
	
	
	
	public Product getProduct(int id) {
		return repo.findById(id).get();
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}

}
