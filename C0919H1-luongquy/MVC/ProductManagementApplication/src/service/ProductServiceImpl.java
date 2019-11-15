package service;

import model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Pen", 10000, "pen", "ThienLong"));
        products.put(2, new Product(2, "Book", 20000, "book", "ThieuNhi"));
    }

//    public static List<Product> getProductsFromDB() throws SQLException {
//        DBConnection db = new DBConnection();
//
//        ResultSet result = db.executeSQL("SELECT * FROM product");
//
//        List<Product> products = new ArrayList<>();
//
//        while (result.next()) {
//            Product product = new Product();
//            product.setName( result.getString("name") );
//            product.setPrice( result.getInt("price") );
//            product.setDescription(result.getString("description"));
//            product.setManufacturer(result.getString("manufacturer"));
//            products.add(product);
//        }
//
//        return products;
//    }

    @Override
    public List<Product> fillAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
        products.put(id, product);
    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }
}
