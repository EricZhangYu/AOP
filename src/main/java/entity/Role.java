package entity;

import java.util.Date;

public class Role {
    private Integer id;
    private String roleCode;
    private String roleName;
    private String createsBy;
    private Date creationDate;

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleCode='" + roleCode + '\'' +
                ", roleName='" + roleName + '\'' +
                ", createsBy='" + createsBy + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getCreatesBy() {
        return createsBy;
    }

    public void setCreatesBy(String createsBy) {
        this.createsBy = createsBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
