

public abstract class deodorant {
private String brand,name,fragrance,gender,category;
private double quantity;
private double cost;


public String getName() { return name;}
public String getBrand() { return brand;}
public String getFragrance() { return fragrance;}
public String getGender() { return gender;}
public String getCategory() { return category;}
public void setName(String newName)
{name=newName;}

public void setBrand(String newBrand)
{brand=newBrand;}
public void setFragrance(String newFragrance)
{fragrance=newFragrance;}
public void setGender(String newGender)
{gender=newGender;}
public void setCategory(String newCategory)
{category=newCategory;}


public double getCost(){ return cost;}
public void setCost(double newCost)
{
	cost=newCost;
}
public double getQuantity(){ return quantity;}
public void setQuantity(double newQuantity)
{
	quantity=newQuantity;
}

public void describeDeo() {
	System.out.println("Name : "+getName()+"\nBrand : "+getBrand()+"\nFragrance : "+getFragrance()+"\nFor : "+getGender()+"\nCategory : "+getCategory()+"\nQuantity : "+getQuantity()+"oz"+"\nCost : "+getCost()+"$");
}

}

