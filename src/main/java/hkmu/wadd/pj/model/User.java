package hkmu.wadd.pj.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "users")
public class User implements UserDetails{
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    //@Column(unique = true)
    @Column(name="full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserRole> roles = new ArrayList<>();

    public User() {}

    public User(String username, String password, String fullName, String email, String phone, String[] roles) {
        this.username = username;
        this.password = "{noop}" + password;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        for (String role : roles) {
            this.roles.add(new UserRole(this, role));
        }
    }

    //public Long getId() { return id; }
    //public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public List<UserRole> getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles.clear();
        for (String role : roles) {
            this.roles.add(new UserRole(this, role));
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}

