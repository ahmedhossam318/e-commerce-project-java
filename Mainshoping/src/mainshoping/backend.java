/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainshoping;



import java.util.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author omare
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.Map;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author omare
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




/////Person clas\\\\\

abstract class person implements Serializable{
    
        // attribute
    private int id ; 
    private String first_name;
    private String last_name;
    private String e_mail;
    private String gender;
    private String birthday;
    private String reterval_code;
    private String password;
    private  String continent;
    
    //_____________________
    // constructors 
    
    public person()
    {}
    public person(int id, String first_name, String last_name, String e_mail, String gender, String birthday, String reterval_code, String password, String continent) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.e_mail = e_mail;
        this.gender = gender;
        this.birthday = birthday;
        this.reterval_code = reterval_code;
        this.password = password;
        this.continent = continent;
    }
   
    //___________________________________
    // get methods

    public String getContinent() {
        return continent;
    }

    public int getId() {
        return id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getE_mail() {
        return e_mail;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getReterval_code() {
        return reterval_code;
    }

    public String getPassword() {
        return password;
    }
    
    //__________________________________________
    // setters  methods 
    public void setId(int id) {
        this.id = id;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

   
    public void setReterval_code(String reterval_code) {
        this.reterval_code = reterval_code;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    // End class person 
}


///admin class\\\

class admin extends person implements Serializable
{
    // attrebute 
    TreeMap<Integer, customer> users;
    TreeMap<Integer, category> categories;
    TreeMap<Integer, cart> unreadingcarts;
    TreeMap<Integer, cart> readingcarts;

    //____________________________
    // constractors 
    
    admin()
    {
        users= new TreeMap<>();
        categories= new TreeMap<>();
        unreadingcarts= new TreeMap<>();
        readingcarts= new TreeMap<>();
    }
        

    public admin(int id ,String first_name, String last_name, String e_mail, String gender, String birthday, 
             String reterval_code, String password, String continent)
    {

            super(id,first_name, last_name, e_mail, gender, birthday,reterval_code, password, continent);
             users= new TreeMap<>();
             categories= new TreeMap<>();
             unreadingcarts= new TreeMap<>();
             readingcarts= new TreeMap<>();
     }
        
    // ______________________________
    // methods getters     
    
    public int get_users_count(){
        return this.users.size();
    }
    
    public customer get_customer_byID(int id)
    {       if(users.containsKey(id))
               return users.get(id);
            return null;       
    }

    public TreeMap<Integer, customer> getUsers() {
        return users;
    }

    public TreeMap<Integer, category> getCategories() {
        return categories;
    }

    public TreeMap<Integer, cart> getUnreadingcarts() {
        return unreadingcarts;
    }

    public TreeMap<Integer, cart> getReadingcarts() {
        return readingcarts;
    }

    //____________________________________________
    // methods implemention for class
    
    public boolean adminlogin(String password, String email)
    {
        return (super.getPassword().equals(password) 
                && super.getE_mail().equals(email));  
    }
    public void add_new_user(person user)
    {
        customer cust=(customer)user;
        users.put(cust.getId(), cust);
    }
    
    public boolean search(String password, String email)
    {
        for (Map.Entry<Integer, customer> entry : users.entrySet()) { 
            customer value = entry.getValue();
            if (value.getPassword().equals(password) && value.getE_mail().equals(email))
                return true ;
        }
        return false;
    }
    public void add_new_category(int id,category newcategory){
        this.categories.put(id, newcategory);
    }
    
    public void delete_category(int id){
            this.categories.remove(id);
    }
    public void delete_user(int id){
        this.users.remove(id);
    }
    
    public void get_un_or_reading_carts ()
    {
         for (Map.Entry<Integer, customer> cust : users.entrySet()) 
             {
               this.unreadingcarts.putAll(cust.getValue().getUnreadingcarts());               
               this.readingcarts.putAll(cust.getValue().getReadingcarts());
             }      
    }

    public void edit_Category(category cat, int id)
    {
        this.categories.remove(id);
        this.categories.put(id, cat);
    }
    
    public void search(int id_cat, int id_item , item it )
    {
        this.categories.get(id_cat).add_new_item(id_item, it);
    }
    
    //_______________________________________
    //End class admin 

}




///customer class\\\

class customer extends person implements Serializable
{
    
    private String ccn; //credit card number 
    private String ssd;
    Map<Integer, cart > carts ;
    Map<Integer, cart> unreadingcarts;    
    Map<Integer, cart> readingcarts;
    static int count=0;

    //___________________________________
    // constructors 


    customer(String first_name, String last_name, String e_mail,
            String gender, String birthday, String ssd, String reterval_code,
            String password,String continent,int id,String ccn )
    {
        super(id, first_name,  last_name,  e_mail,
                gender,  birthday,  reterval_code,
                password, continent );
        this.ccn=ccn;
        this.ssd =ssd;
        carts = new TreeMap<>();
        Map<Integer, cart> unreadingcart= new TreeMap<>();
        Map<Integer, cart> readingcarts= new TreeMap<>();
    };


    customer (customer cust)
    {
        super(cust.getId(),cust.getFirst_name(),cust.getLast_name()
                ,cust.getE_mail(),
                cust.getGender(),cust.getBirthday(),
                cust.getReterval_code(),cust.getPassword(),
                cust.getContinent());
        this.ccn = cust.ccn;
        this.ssd= cust.ssd;
        this.carts = cust.carts;


    }
    //______________________________________
    // getters methods 
    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }


    public String getCcn() {
        return ccn;
    }
    //________________________________
    // setters methods
    
    public void setCarts(Map<Integer, cart> carts) {
        this.carts = carts;
    }

    public void setUnreadingcarts(Map<Integer, cart> unreadingcarts) {
        this.unreadingcarts = unreadingcarts;
    }

    public void setReadingcarts(Map<Integer, cart> readingcarts) {
        this.readingcarts = readingcarts;
    }

    public void setCcn(String ccn) {
        this.ccn = ccn;
    }
    public Map<Integer, cart> getCarts() {
        return carts;
    }

    public Map<Integer, cart> getUnreadingcarts() {
        return unreadingcarts;
    }

    public Map<Integer, cart> getReadingcarts() {
        return readingcarts;
    }
    
    //_________________________________________________
    // methods implemention
    
    
    public void update_info(customer cust)
    {
        this.ccn = cust.ccn; 
        this.ssd = cust.ssd;
        super.setFirst_name(cust.getFirst_name());
        super.setLast_name(cust.getLast_name());
        super.setBirthday(cust.getBirthday());
        super.setE_mail(cust.getE_mail());
        super.setPassword(cust.getPassword());
        super.setGender(cust.getGender());
        super.setReterval_code(cust.getReterval_code());
        super.setContinent(cust.getContinent());
    }
    
    public boolean check_ccn(String ccn)
    {
        return (ccn.length()==12);    
    }
    
    public void unreading_cart ()
    {   
        for (Map.Entry<Integer, cart> CART : carts.entrySet()) {
            cart value = CART.getValue();
            if (value.getStatus().equals(0))
            {
               this.unreadingcarts.put(CART.getKey(), value);            
            }
            else
            {
                this.readingcarts.put(CART.getKey(), value);
            }        
        }
     
    }
    
    
    public void getCartwithID(int id , cart ct)
    {
        carts.put(id, ct);
    }
    // end class of customer 

}

//______________________________________________
///category class\\\



class category implements Serializable
{
    
// attribute of class categoty 
    
    private int id;
    private String name;
    private int count_item;
    TreeMap <Integer,item>Items;

    // methods of class category 

    // constructors 

    public category(int id, String name, int count_item) {
 
        Items=new TreeMap<>();
        this.id = id;
        this.name = name;
        this.count_item = count_item;
    }

    
    // get methods 
    // _____________________________
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TreeMap<Integer, item> getItems() {
        return Items;
    }

    public int getCount_item() {
        return count_item;
    }

    
    //_______________________
    // methods setters 
    
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount_item(int count_item) {
        this.count_item = count_item;
    }

    public void setItems(TreeMap<Integer, item> Items) {
        this.Items = Items;
    }
    
    
    
    // ____________________________________
    // methods implemention for class 
    public void add_new_item(int id,item item){
        
            Items.put(id, item);
    }
    
    public int check_item_in_stock(int id,item item){
            if (Items.containsKey(id))
            {      
                return (Items.get(id).getCount());
                      
            }
            
            return 0;
    }
    
    
    void add_sale_for_item(int id,int sale_price)
    {
            if (Items.containsKey(id))
                 Items.get(id).setSale_price(sale_price);                   
            
    }

    
    
    void edit_item_in_category(int id , item item2)
    {
        if (Items.containsKey(id))
            {
                  for (Map.Entry<Integer, item> item1 : Items.entrySet()) {
                      if (item1.getKey() == id )
                      {
                          ///must be edited
                          item1.setValue(item2);
                      }
            }
            }
    }
    
    //_______________________________
    // End of class category 
     
}


///cart class\\\

class cart implements Serializable{
    
    // class of attribute 
    public int id;
    public TreeMap<Integer,item>items;
    public int total_price;
    public int total_period;
    public String status;

    
    // constrctor 

    public cart(int id, int total_price, int total_period, String status) 
    {
        items=new TreeMap<>();
        this.id = id;
        this.total_price = total_price;
        this.total_period = total_period;
        this.status = status;
    }
    public cart(int id) 
    {
        items=new TreeMap<>();
        this.id = id;
        if(items.size()==0)
        {
            this.total_price = 0;
            this.total_period = 0;
            this.status = "unread";
            
        }
        else 
        {
            this.total_price = getTotal_price();
            this.setTotal_period(this.largest_period());
            this.status = this.getStatus();
        
        }
    }   

    //___________________________________
    // methods class implemention 

    public void time_clac(customer cust)
    {
        
        String continent =cust.getContinent();
        for (Map.Entry<Integer, item> entry : items.entrySet()) {           
            item value = entry.getValue();
            value.period_time(continent, value.getCount());
            
        }
    }
    
    public int largest_period()
    {
        int mx = 0  ; 
        
        for (Map.Entry<Integer, item> entry : items.entrySet())
                if (entry.getValue().getPeriod() > mx)
                     mx=entry.getValue().getPeriod();  
        
        return mx;
    }
    
    
    public void remove_item(int id){
    items.remove(id);
    }
    
    public void remove_cart()
    {
    items.clear();
    }
    public  void add_item_to_cart(int id,item Item)
    {
        items.put(id, Item);
    }   

    public int calc_total_cart()
    {
        int total=0;
        for (Map.Entry<Integer, item> item : items.entrySet()) {
                    total+=item.getValue().getPrice();
	}
    
    return total;
    }
    //____________________________________
    // set methods 
    
    public void setId(int id) {
        this.id = id;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public void setTotal_price(int total_price) {
        this.total_price = total_price;
    }

    public void setTotal_period(int total_period) {
        this.total_period = total_period;
    }
    
    public void setItems(TreeMap<Integer, item> items) {
        this.items = items;
    }
    
    //___________________________________________
    // get methods      
    public TreeMap<Integer, item> getItems() {
        return items;
    }  

    public int getId() {
        return id;
    }

    public int getTotal_price() {
        return total_price;
    }

    public int getTotal_period() {
        return total_period;
    }

    public String getStatus() {
        return status;
    }

}


///item clss\\\

class item implements Serializable{
    
    // attribute of class  
    private int id;
    private String name;
    private int count;
    private String category;
    private int price;
    private int sale_price;
    private Map<Integer,String> feedback;
    private boolean statues_order;
    private int period;
    private String continent ;
    


    // class of methods 

    // constructors 
    
    public item(int id, String name , int count, String category, int price, 
        int sale_price, boolean statues_order,  String continent) 
    {
        this.id = id;
        this.name = name;
        this.count = count;
        this.category = category;
        this.price = price;
        this.sale_price = sale_price;
        this.feedback = new TreeMap<>();   
        this.statues_order = statues_order;
        //this.period = //estamite will be added
        this.continent = continent ; 
    }

    //____________________________________
    // getters methods 
    
 
    public int getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public Map<Integer, String> getFeedback() {
        return feedback;
    }

    public boolean isStatues_order() {
        return statues_order;
    }

    public int getPeriod() {
        return period;
    }

    public String getContinent() {
        return continent;
    }

    public String getCategory() {
        return category;
    }

    public int getSale_price() {
        return sale_price;
    }

    
    //_________________________________
    
    
    
    // setters methods
    public void setPrice(int price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSale_price(int sale_price) {
        this.sale_price = sale_price;
    }

    public void setFeedback(Map<Integer, String> feedback) {
        this.feedback = feedback;
    }

    public void setStatues_order(boolean statues_order) {
        this.statues_order = statues_order;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
    
    //___________________________________________
    
    // implemention methods 
    
    public  boolean check_item_in_stock(int count_of_item){
        return (count>=count_of_item);
    }
    public void add_feedback_to_items(int id,String Feedback)
    { 
         this.feedback.put(id, Feedback);          
    }
    
    public boolean check_sale_exist(){return (sale_price > 0);}
    
    
    public int calc_price_after_sale(){
        return(price-sale_price);
    }
    
    // it's estimate time method 
    public int period_time (String cont, int count_user)
    {
        String con[] = {"north america" , "australia","south america","antarctica","Asia","europe","Africa"};
         if (cont.equals(con[0]))
           return ((handling_time(count_user)*24*60) + ((16*60)+52));
       else if (cont.equals(con[1]))
           return ((handling_time(count_user)*24*60) + ((12*60)+56));
       else if (cont.equals(con[2]))
            return ((handling_time(count_user)*24*60) + ((12*60)+10));
       else if (cont.equals(con[3]))
           return ((handling_time(count_user)*24*60) + ((11*60)+21));
       else if (cont.equals(con[4]))
           return ((handling_time(count_user)*24*60) + ((10*60)+25));
       else if (cont.equals(con[5]))
         return ((handling_time(count_user)*24*60) + ((9*60)+2));
       
       return 0 ;
    }
    
    
    public int handling_time(int count_user)
    {
     
        if (!check_item_in_stock(count_user))
        {
        
       String con[] = {"north america" , "australia","south america","antarctica","Asia","europe"};
        if (continent.equals(con[0]))
           return 10;
       else if (continent.equals(con[1]))
           return 9;
       else if (continent.equals(con[2]))
           return 8;
       else if (continent.equals(con[3]))
           return 7;
       else if (continent.equals(con[4]))
           return 6;
       else if (continent.equals(con[5]))
           return 5;      
       }
       return 0;
    }
    //___________________________________
    // end class item 

  }

