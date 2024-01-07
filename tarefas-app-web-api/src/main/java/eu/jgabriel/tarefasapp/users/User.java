package eu.jgabriel.tarefasapp.users;

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
    @Basic
    @Column(name = "role")
    private int role;

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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
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
