package com.itheima;

import com.itheima.dao.ItemsDao;
import com.itheima.pojo.Items;
//import org.junit.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-mybatis.xml")
public class ItemsDaoTest {
/*    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        ItemsDao itemsDao = (ItemsDao) context.getBean("itemsDao  ");

        System.out.println("商品列表:"+itemsDao.findAll());

        Items items = new Items();
        items.setName("商品名称");
        items.setPrice(16666f);
        items.setCreatetime(new Date());
        itemsDao.save(items);

    }*/

    @Autowired
    private ItemsDao itemsDao;

    @Test
    public void test01(){
        List<Items> all = itemsDao.findAll();
        System.out.println(all);
    }
}
