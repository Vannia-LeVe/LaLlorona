/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itoson.lallorona.entities;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import java.util.List;



/**
 *
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
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
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
    //@SerializedName("account-number")
    private int accountNumber;
    private String currency;
    //@SerializedName("account-holder")
    private AccountHolder accountHolder;
    private List<Transaction> transactions;
    
    
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
