package com.example.demo.security;

import com.google.common.collect.Sets;
import static com.example.demo.security.ApplicationUserPermission.*;
import java.util.Set;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(STUDENT_READ, STUDENT_WRITE, COURSE_READ, COURSE_WRITE));

    private Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }
}
