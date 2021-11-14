package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

//@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    InvoiceDao invoiceDao;

//    @Autowired
//    ProducttDao productDao;

    @Test
    void InvoiceDaoTestSave() {

           Product Banan = new Product("Banan");

          // productDao.save(Banan);


         //productDao.save(Banan);

            Item Product_Banan = new Item(new BigDecimal(40), 15, new BigDecimal(20));
            Product_Banan.setProduct(Banan);
            //itemDao.save(Product_Banan);


           // productDao.save(Banan);

            Invoice Artykuly_Spozywcze = new Invoice("Artykuly Spozywcze");
            Artykuly_Spozywcze.getItems().add(Product_Banan);
            Product_Banan.setInvoice(Artykuly_Spozywcze);
            invoiceDao.save(Artykuly_Spozywcze);
            int id= Artykuly_Spozywcze.getId();

            assertNotEquals(0,id);
            invoiceDao.deleteAll();
            //productDao.deleteAll();


    }
}
