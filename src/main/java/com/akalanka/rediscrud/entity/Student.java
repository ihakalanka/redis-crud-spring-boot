package com.akalanka.rediscrud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@RedisHash("Student")
public class Student {
    @Id
    private long id;
    private String name;
    private String address;
    private String email;
}
