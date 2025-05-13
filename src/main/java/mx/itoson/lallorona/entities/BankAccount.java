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
public class BankAccount {

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

    /**
     * @return the ccountHolder
     */
    public AccountHolder getCcountHolder() {
        return ccountHolder;
    }

    /**
     * @param ccountHolder the ccountHolder to set
     */
    public void setCcountHolder(AccountHolder ccountHolder) {
        this.ccountHolder = ccountHolder;
    }
    private String product;
    //@SerializedName("account-number")
    private int accountNumber;
    private String currency;
    //@SerializedName("account-holder")
    private AccountHolder ccountHolder;
    private List<Transactions> transactions;
    
    
    public static BankAccount deserialized(String json){
    
    BankAccount a= new BankAccount();
    try { 
         Gson gson = new Gson();
          a= gson.fromJson(json, BankAccount.class);
    }catch (Exception ex){
            System.out.println("Error: " + ex.getMessage());
        }
    return a;
   
    }
}
