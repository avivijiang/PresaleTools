package com.yonyou.iuap.system.entity;

public class SystemPermission {
    private Long permissionId;

    private String permissionParent;

    private String permissionCode;

    private String permissionName;

    private String permissionDescription;

    public Long getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Long permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionParent() {
        return permissionParent;
    }

    public void setPermissionParent(String permissionParent) {
        this.permissionParent = permissionParent == null ? null : permissionParent.trim();
    }

    public String getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(String permissionCode) {
        this.permissionCode = permissionCode == null ? null : permissionCode.trim();
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName == null ? null : permissionName.trim();
    }

    public String getPermissionDescription() {
        return permissionDescription;
    }

    public void setPermissionDescription(String permissionDescription) {
        this.permissionDescription = permissionDescription == null ? null : permissionDescription.trim();
    }
}