package com.example.export;

public class ConsoleExporter implements IExporter {
    public void export(String content) {
        System.out.println(content);
    }
}
