package annotation;

import annotation.IFruitColorAnnotation.Color;


public class AnotationUser {
	
	private String mFruitName;
	
	@IFruitColorAnnotation(getHeight = 3, getColor = Color.yellow)
	private Color mFruitColor;
	
	@IFruitNameAnnotation(getFruitName = "orange") // 若只写值“orange”，则默认的方法名要是value().
	private void anotationFruitName(){
		
	}
	
}
