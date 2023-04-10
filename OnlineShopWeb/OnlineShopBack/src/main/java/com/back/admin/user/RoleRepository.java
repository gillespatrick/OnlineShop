
package com.back.admin.user;

import com.onlineshopcommon.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gilles
 */

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {
    
}
