package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import com.app.core.PetsToy;

import enums.Brand;
import enums.Material;

public class Utils{
	public static Brand validBrand(String brand)
	{
	Brand validBrand = Brand.valueOf(brand.toUpperCase());
	return validBrand;
	}
	
	public static Material validMaterial(String material)
	{
	Material validMaterial = Material.valueOf(material.toUpperCase());
	return validMaterial;
	}
	
	public static LocalDate parseListingdate(String listingDate)
	{
		LocalDate validListingDate = LocalDate.parse(listingDate);
		return validListingDate;
	}
	
	
public static PetsToy validateToy(String name, String[] species, String brand,String material,int stock,String  stockListingDate,double price )
{
	Brand validBrand = validBrand(brand);
	Material validMaterial = validMaterial( material);
	LocalDate validListingDate = parseListingdate(stockListingDate);
	return new PetsToy (name, validBrand,species,validMaterial,stock, validListingDate,price);
}

public static void updateStock(int id,String listingdate, Integer newStock, HashMap <Integer,PetsToy> toysMap)
{	LocalDate validListingDate =  parseListingdate(listingdate);
	toysMap.get(id).setStock(newStock);	
	toysMap.get(id).setStockListingDate(validListingDate);
}

public static void addDiscount( HashMap <Integer,PetsToy> toysMap)
{
	ArrayList<PetsToy> toysArray = new ArrayList<PetsToy>(toysMap.values());
	for(PetsToy t : toysArray)
	{
		//it was stated "which are 1 years old" but i am building the code for "which are more than one year old for practical reasons. we can replace "isAfter" by "equals" if we want it as it is.
	if((LocalDate.now().minusYears(1)).isAfter((t).getStockUpdateDate()))
			{
					t.setDiscount(25);
			}
			
	}
	
	
}

public static void removeToys(HashMap <Integer,PetsToy> toysMap)
{
	ArrayList<PetsToy> toysArray = new ArrayList<PetsToy>(toysMap.values());
	Iterator <PetsToy> itr = ((List<PetsToy>) toysMap).iterator();
	while(itr.hasNext())
	{
		if((LocalDate.now().minusMonths(9)).isAfter(((PetsToy) itr).getStockListingDate()))
		{
			itr.remove();
		}
	}	
}

//public static HashMap populateToysMap()
//{
//	HashMap <Integer,PetsToy> populatedToysMap;
//	populatedToysMap.put(1, new PetsToy("Squeaqy Ball", Brand.FUTUREKART, "cats", "Dogs" ,Material.PLASTIC, 23,2023-10-10 ,299 ) );
//}
}