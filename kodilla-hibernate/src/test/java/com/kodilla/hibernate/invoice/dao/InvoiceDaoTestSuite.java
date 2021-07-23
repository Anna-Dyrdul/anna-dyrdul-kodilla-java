package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product1");
        Product product2 = new Product("product2");
        //Product product3 = new Product("product3");

        Item item1 = new Item(new BigDecimal(12.20), 3,new BigDecimal(13), product1);
        Item item2 = new Item(new BigDecimal(26.40), 3,new BigDecimal(123), product1);
        Item item3 = new Item(new BigDecimal(64.60), 3,new BigDecimal(635), product2);

        Invoice invoice = new Invoice("48742");

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int invoiceDaoId = invoice.getId();
        //itemDao.save(item1);
        int itemDao1ID = item1.getId();
        //itemDao.save(item2);
        int  itemDao2ID = item2.getId();
        //itemDao.save(item3);
        int itemDao3ID = item3.getId();
        //productDao.save(product1);
        int productDao1Id = product1.getId();
        //productDao.save(product2);
        int productDao2Id = product2.getId();

        //Then
        assertNotEquals(0, invoiceDaoId);
        assertNotEquals(0, itemDao1ID);
        assertNotEquals(0, itemDao2ID);
        assertNotEquals(0, itemDao3ID);
        assertNotEquals(0, productDao1Id);
        assertNotEquals(0, productDao2Id);

        //CleanUp
        try {
            invoiceDao.deleteById(invoiceDaoId);
            /*itemDao.deleteById(itemDao1ID);
            itemDao.deleteById(itemDao2ID);
            itemDao.deleteById(itemDao3ID);
            productDao.deleteById(productDao1Id);
            productDao.deleteById(productDao2Id);*/
        } catch (Exception e) {
            //do nothing
        }
    }
}
