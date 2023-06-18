package com.back.admin.user;

import com.onlineshopcommon.entity.Role;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author gilles
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class RoleRepoTest {
    
/*
    @Autowired
    private RoleRepository repo;

    @Test
    public void testCreateFirstRole() {
        Role roleAdmin = new Role("Admin", "Manage everything");
        Role saveRole = repo.save(roleAdmin);
        assertThat(saveRole.getId()).isGreaterThan(0);
    }
    

    @Test
    public void testRestRole() {
        Role sale = new Role("SalePerson", "Manage product price, customer, shipping,orders, sales report");
        Role edit = new Role("Editor", "Manage categories, brands,article, menus");
        Role shipper = new Role("Shipper", " view products, view orders, update order status");
        Role assist = new Role("Assistant", "manage question, and reviews ");
        repo.saveAll(List.of(sale, assist, edit, shipper));
    }

*/

}
