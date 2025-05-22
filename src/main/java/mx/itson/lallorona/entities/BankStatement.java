/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.lallorona.entities;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;



/**
 * This class contains all the information about te moves made on the differents acounts like the currency, acount number and list of transactions
 * @author Vanny
 */
public class BankStatement {

    /**
     * @return the accountHolder
     */
    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    /**
     * @param accountHolder the accountHolder to set
     */
    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    /**
     * @return the transactions
     */
    public List<Transaction> getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    /**
     * @return the product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @param product the product to set
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * @return the accountNumber
     */
    public Long getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the account
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * @param currency the account to set
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

 
    private String product;
    @SerializedName("account-number")
    private Long accountNumber;
    private String currency;
    @SerializedName("account-holder")
    private AccountHolder accountHolder;
    private List<Transaction> transactions;
    
    
    /**
     * BankStatement convert the json text to an object call BankStatement
     * @param json receives a String in JSON format as a parameter and returns an object of type BankStatement
     * @return returns the BankStatement object, either with the correct data
     */
    public static BankStatement deserialized(String json){
    
    BankStatement a= new BankStatement();
    try { 
         Gson gson = new Gson();
          a= gson.fromJson(json, BankStatement.class);
    }catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    return a;
   
    }
}
