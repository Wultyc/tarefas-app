package eu.jgabriel.tarefasapp.users;

import eu.jgabriel.tarefasapp.roles.Role;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
    @Basic
    @Id
    //@GeneratedValue
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "profile_picture")
    private String profilePicture;
    @ManyToOne
    @JoinColumn(name = "role")
    private Role role;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User users = (User) o;
        return id == users.id && role == users.role && Objects.equals(name, users.name) && Objects.equals(profilePicture, users.profilePicture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, profilePicture, role);
    }
}
