package dao;

import entity.Role;

import java.util.List;

public interface RoleDao {
    public List<Role> findAllRole() throws Exception;
}
