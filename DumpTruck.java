package laba1; 

import java.awt.Color;
import java.awt.Graphics;
import java.util.Set;

public class DumpTruck {
	/// <summary>
    /// Левая координата отрисовки 
    /// </summary>
    private float _startPosX;
    /// <summary>
    /// Правая кооридната отрисовки 
    /// </summary>
    private float _startPosY;
    /// <summary>
    /// Ширина окна отрисовки
    /// </summary>
    private int _pictureWidth;
    //Высота окна отрисовки
    private int _pictureHeight;
    /// <summary>
    /// Ширина отрисовки 
    /// </summary>
    private int dumptruckWidth = 100;
    /// <summary>
    /// Ширина отрисовки 
    /// </summary>
    private  int dumptruckHeight = 60;
    /// <summary>
    /// Максимальная скорость
    /// </summary>
    private int maxSpeed;
    public int getMaxSpeed() {
    	return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
    	this.maxSpeed = maxSpeed;
    } 
    /// <summary>
    /// Вес 
    /// </summary>
    private float weight;
    public float getWeight() {
    	return weight;
    }
    public void setWeight(float weight) {
    	this.weight = weight;
    } 
    /// <summary>
    /// /// Основной цвет кузова
    /// </summary>
    private Color mainColor;
    public Color getMainColor() {
    	return mainColor;
    }
    public void setMainColor(Color mainColor) {
    	this.mainColor = mainColor;
    }
    /// <summary>
    /// Дополнительный цвет
    /// </summary>
    private Color dopColor;
    public Color getDopColor() {
    	return dopColor;
    }
    public void setDopColor(Color dopColor) {
    	this.dopColor = dopColor;
    }
    /// <summary>
    /// Конструктор
    /// </summary>
    /// <param name="maxSpeed">Максимальная скорость</param>
    /// <param name="weight">Вес автомобиля</param>
    /// <param name="mainColor">Основной цвет кузова</param>
    /// <param name="dopColor">Дополнительный цвет</param>        
            
    public DumpTruck(int maxSpeed, float weight, Color mainColor, Color dopColor)
    {
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setMainColor(mainColor);
        setDopColor(dopColor);
    } 
    /// <summary>
    /// Установка позиции 
    /// </summary>
    /// <param name="x">Координата X</param>
    /// <param name="y">Координата Y</param>
    /// <param name="width">Ширина картинки</param>
    /// <param name="height">Высота картинки</param>      
    public void SetPosition(int x, int y, int width, int height)
    {
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }

  /// <summary>
    /// Изменение направления пермещения
    /// </summary>
    /// <param name="direction">Направление</param>
    public void MoveTransport(Direction direction)
    {
        float step = maxSpeed * 100 / weight;
        switch (direction)
        {
            // вправо                
            case Right:
                if (_startPosX + step < _pictureWidth - dumptruckWidth)
                {
                    _startPosX += step;
                }
                break;
            //влево                
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            //вверх                
            case Up:
                if (_startPosY - step > 0)
                {
                    _startPosY -= step;
                }
                break;
            //вниз             
            case Down:
                if (_startPosY + step < _pictureHeight - dumptruckHeight)
                {
                    _startPosY += step;
                }
                break;
        }
    } 

  /// <summary>
    /// Отрисовка 
    /// </summary>
    /// <param name="g"></param> 
    public void DrawDumpTruck(Graphics g)
    {
    	g.setColor(Color.BLACK);       
    	g.fillRect( (int)_startPosX + 10, (int)_startPosY + 70, 120, 15);
        g.fillOval( (int)_startPosX, (int)_startPosY+ 80, 30, 30);
        g.fillOval( (int)_startPosX + 60, (int)_startPosY + 80, 30, 30);
        g.fillOval( (int)_startPosX + 100, (int)_startPosY + 80, 30, 30);
      
        g.setColor(mainColor);
        g.fillRect( (int)_startPosX - 15, (int)_startPosY + 20, 30, 50);
        g.fillRect( (int)_startPosX - 30, (int)_startPosY + 50, 40, 30);
        
        g.setColor(dopColor);
        g.fillRect( (int)_startPosX + 20, (int)_startPosY + 20, 100, 50);
        g.fillRect( (int)_startPosX + 120, (int)_startPosY + 5, 10, 65);
        g.fillRect( (int)_startPosX + 20, (int)_startPosY + 5, 10, 65);
        g.fillRect( (int)_startPosX - 10, (int)_startPosY, 40, 10);
        g.fillRect( (int)_startPosX + 20, (int)_startPosY + 20, 100, 50);
    }
}
