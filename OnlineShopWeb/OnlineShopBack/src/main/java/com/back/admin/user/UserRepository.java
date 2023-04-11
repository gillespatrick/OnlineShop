
package com.back.admin.user;

import com.onlineshopcommon.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gilles
 */
public interface UserRepository extends CrudRepository<User, Integer> {
    
    
}
