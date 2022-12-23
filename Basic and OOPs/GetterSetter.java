class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters

    public String getPassword(){
        //setPassword(randomPass);
        return this.password;
    }

    public void setPassword(String pass){ //private
        this.password=pass;
    }

}


public class GetterSetter {
    public static void main(String args[]){
        Account a1=new Account();
        a1.name="Muskan";
        a1.email="singhmuskan2109@gmail.com";
        a1.setPassword("Muskan@123"); //we can't call from here

        System.out.println(a1.getPassword());
    }
}
