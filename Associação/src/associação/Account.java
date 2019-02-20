/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package associação;

/**
 *
 * @author aluno
 */
public class Account {
    private Client client;
    private int id;
    private double limit;
    private double balance;
    
    // Getters and Setters: xD
    public  Client getClient(){
        return this.client;
    }
    public void setClient(Client client){
        this.client=client;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public double getLimit(){
        return this.limit;
    }
    public void setLimit(double limit){
        this.limit=limit;
    }
    public double getBalance(){
        return this.balance;
    }
    // Metodos
    public boolean deposit(double money){
        this.balance+=money;
        return true;
    }
    public boolean withdraw(double money){
        if(this.balance+this.limit>=money){
            this.balance-=money;
            return true;
        }
        return false;
    }
    public boolean transfer(double money, Account dest){
        if(this.balance+this.limit>=money){
            this.balance-=money;
            dest.balance+=money;
            return true;
        }
        return false;
    }
    
    
    
    
}
