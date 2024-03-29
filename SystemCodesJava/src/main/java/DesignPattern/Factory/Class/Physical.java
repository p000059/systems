package DesignPattern.Factory.Class;

import DesignPattern.Factory.Interface.Category;
import DesignPattern.Factory.Interface.Product;

public class Physical implements Category{

	@Override
	public Product newProduct() {
		
		return new PhysicalProduct();
	}

}
