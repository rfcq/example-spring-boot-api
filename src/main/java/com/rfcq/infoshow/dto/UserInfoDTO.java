package com.rfcq.infoshow.dto;

import jakarta.persistence.*;

import javax.management.relation.Role;
import java.util.List;

@Entity
@Table(name = "UserInfo")
public class UserInfoDTO {

    public UserInfoDTO(String name, String surname, String username, String birthDate, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.birthDate = birthDate;
        this.email = email;
        this.phoneNumber = phoneNumber;
//        this.role = role;
    }

    public UserInfoDTO() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name="username")
    private String username;

    @Column(name="birth_date")
    private String birthDate;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private String phoneNumber;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
