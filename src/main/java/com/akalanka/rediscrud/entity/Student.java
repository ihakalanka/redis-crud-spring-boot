package com.akalanka.rediscrud.entity;

import lombok.*;
import org.springframework.data.redis.core.RedisHash;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@RedisHash("Student")
public class Student {
    private String id;
    private String name;
    private String address;
    private String email;
}
