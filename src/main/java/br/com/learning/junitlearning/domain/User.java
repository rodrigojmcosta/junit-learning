package br.com.learning.junitlearning.domain;

import lombok.*;

import javax.persistence.*;

@Data //Equals And HashCode, Getter, Setter, ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;
}
