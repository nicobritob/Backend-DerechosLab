package com.generation.be.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data
public class CorrectChoices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "correct_choices_id")
    private Long id;

    @Column(name ="correct_choices_text")
    private String correctChoicesText;

    //Relación uno es a uno con la tabla Question
    @JsonIgnore
    @OneToOne
    @JoinColumn(name="question_id")
    private Question question;

}