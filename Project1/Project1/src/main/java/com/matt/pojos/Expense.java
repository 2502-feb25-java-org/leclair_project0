package com.matt.pojos;

public class Expense 
{
	private double amount;
	private boolean submitted; //false for not submitted, true for submitted
	private boolean resolved; //true for resolved, false for not resolved
	private String type;
	private String description;
	private String receipt;
	
	public Expense() {} //no args constructor
	
	public Expense(double amount, boolean submitted, boolean resolved, String description, String receipt) 
	{
		super();
		this.amount = amount;
		this.submitted = submitted;
		this.resolved = resolved;
		this.description = description;
		this.receipt = receipt;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isSubmitted() {
		return submitted;
	}
	public void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}
	public boolean isResolved() {
		return resolved;
	}
	public void setResolved(boolean resolved) {
		this.resolved = resolved;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getReceipt() {
		return receipt;
	}
	public void setReceipt(String receipt) {
		this.receipt = receipt;
	}
	@Override
	public String toString() {
		return "Expense [amount=" + amount + ", submitted=" + submitted + ", resolved=" + resolved + ", description="
				+ description + ", receipt=" + receipt + "]";
	}
}
