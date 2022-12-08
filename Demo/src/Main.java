import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> prdtLst=new ArrayList<Product>();
		prdtLst.add(new Product("Product1","Toy",2000));
		prdtLst.add(new Product("Product2","Appliance",20000));
		prdtLst.add(new Product("Product3","Mobile",25000));
		prdtLst.add(new Product("Product4","Toy",3000));
		
		List<Product> res=prdtLst.stream().filter(s->s.getCategory().contentEquals("Toy")).collect(Collectors.toList());
		res.stream().forEach(s->s.setPrice((int)(s.getPrice()*.9)));
		System.out.println(res);
	}

}
