package laba2;
import java.awt.Color;
import java.awt.Graphics;
public class DumpTruck extends Truck{
	/// <summary>         
    /// Дополнительный цвет         
    /// </summary>         
    private Color dopColor;
    public Color getDopColor() {
    	return dopColor;
    }
    private void setDopColor(Color dopColor) {
    	this.dopColor = dopColor;
    }
    
    /// <summary>         
    /// Признак наличия body        
    /// </summary>         
    private boolean body;
    public boolean getBody() {
    	return body;
    }
    private void setBody(boolean body) {
    	this.body = body;
    }
    /// <summary>         
    /// Конструктор         
    /// </summary>         
    /// <param name="maxSpeed">Максимальная скорость</param>         
    /// <param name="weight">Вес автомобиля</param>         
    /// <param name="mainColor">Основной цвет кузова</param>       
    /// <param name="dopColor">Дополнительный цвет</param>         
    public DumpTruck(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean body)   
    {
    	super(maxSpeed, weight, mainColor);
        setDopColor(dopColor);
        setBody(body);
    } 

    /// <summary>        
    /// Отрисовка      
    /// </summary>      
    /// <param name="g"></param>     
    public void DrawDumpTruck(Graphics g)
    {  	  
    	g.setColor(dopColor); 
        if (body)
        {
        	g.fillRect( (int)_startPosX + 10, (int)_startPosY + 20, 120, 50);
        }
        super.DrawDumpTruck(g);

    }
}

