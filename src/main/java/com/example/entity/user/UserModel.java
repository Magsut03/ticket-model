package com.example.entity.user;


import com.example.entity.base.BaseModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class UserModel extends BaseModel {
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;


}
