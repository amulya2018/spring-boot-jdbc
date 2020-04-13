package com.example.demo;

public class Accnt {

		double id;
		String name;
		double balance;
		double pin;
		
		public double getId() {
			return id;
		}
		public void setId(double id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public double getPin() {
			return pin;
		}
		public void setPin(double pin) {
			this.pin = pin;
		}
		@Override
		public String toString() {
			return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", pin=" + pin + "]";
		}
	}
