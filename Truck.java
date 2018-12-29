package laba2;
import java.awt.Color;
import java.awt.Graphics;
public class Truck extends Vehicle{
	/// <summary>         
    /// Ўирина отрисовки          
    /// </summary>         
    protected int dumptruckWidth = 100;

    /// <summary>         
    /// Ўирина отрисовки          
    /// </summary>         
    protected int dumptruckHeight = 60;
	
	
    public Truck(int maxSpeed, float weight, Color mainColor)
    {
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setMainColor(mainColor);
    }

	@Override
	public void MoveTransport(Direction direction) {
		float step = maxSpeed * 100 / weight; switch (direction)
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

	@Override
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
    }
}
