package annotation;

import annotation.IFruitColorAnnotation.Color;


public class AnotationUser {
	
	private String mFruitName;
	
	@IFruitColorAnnotation(getHeight = 1, getColor = Color.yellow)
	private Color mFruitColor;
	
	@IFruitNameAnnotation(getFruitName = "asd")
	private void anotationTest(){
		
	}
	
}
