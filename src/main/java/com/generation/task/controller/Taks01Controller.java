package com.generation.task.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task01")
public class Taks01Controller {

    @GetMapping("/welloworld")
    public String WelloWorld() {
        return "Hello World!!";
    }

    @GetMapping("/bsn")
    public String BsmGeneration() {
        return "Mentalidade de Crescimento (Growth Mindset)\n" +
                "Responsabilidade Pessoal (Personal Responsibility)\n" +
                "Orientação ao Futuro (Future Orientation)\n" +
                "Comunicação (Communication)\n" +
                "Trabalho em Equipe (Teamwork)\n" +
                "Pensamento Crítico (Critical Thinking)\n" +
                "Resolução de Problemas (Problem Solving)\n" +
                "Orientação para Resultados (Results Orientation)\n" +
                "Gerenciamento de Tempo (Time Management)\n" +
                "Adaptabilidade (Adaptability)\n" +
                "Autoconfiança (Self-Confidence)\n" +
                "Ética e Integridade (Ethics and Integrity)";
    }

    @GetMapping("/semanaObj")
    public String semanaObj() {
        return "Meus objetivos da semana consiste em aprimorar meus conhecimentos nas BSN'S: " +
                "Comunicação (Communication)\n" +
                "Trabalho em Equipe (Teamwork)\n" +
                "Pensamento Crítico (Critical Thinking)\n";
    }

}
