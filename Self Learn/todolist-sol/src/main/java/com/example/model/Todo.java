package com.example.model;

// 1. Model - Menerapkan SRP (Single Responsibility Principle)
// Kelas ini hanya bertanggung jawab untuk merepresentasikan data Todo
public class Todo {
   private int id;
   private String title;
   private String description;
   private boolean completed;

   public Todo() {
   }

   public Todo(String title, String description) {
      this.title = title;
      this.description = description;
      this.completed = false;
   }

   public Todo(int id, String title, String description, boolean completed) {
      this.id = id;
      this.title = title;
      this.description = description;
      this.completed = completed;
   }

   // Getters and Setters
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean isCompleted() {
      return completed;
   }

   public void setCompleted(boolean completed) {
      this.completed = completed;
   }

   @Override
   public String toString() {
      return id + ". " + title + (completed ? " [V]" : " [ ]") +
            "\n   " + description;
   }
}