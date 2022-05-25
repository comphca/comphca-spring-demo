package com.comphca.pojo;

import lombok.*;
import org.springframework.stereotype.Service;

/**
 * @Created by comphca
 * @Date 2022/5/25 0:32
 * @Description TODO
 */
@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private String name;
    private Integer age;
}
