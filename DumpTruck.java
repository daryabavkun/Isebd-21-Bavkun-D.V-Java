
package laba2;
import java.awt.Color;
import java.awt.Graphics;
public class DumpTruck extends Truck{
	/// <summary>         
    /// Äîïîëíèòåëüíûé öâåò         
    /// </summary>         
    private void setDopColor(Color dopColor) {
    	this.dopColor = dopColor;
    }
    
    /// <summary>         
    /// Ïðèçíàê íàëè÷èÿ body        
    /// </summary>         
    private boolean body;
    public boolean getBody() {
    	return body;
    }
    private void setBody(boolean body) {
    	this.body = body;
    }
    /// <summary>         
    /// Êîíñòðóêòîð         
    /// </summary>         
    /// <param name="maxSpeed">Ìàêñèìàëüíàÿ ñêîðîñòü</param>         
    /// <param name="weight">Âåñ àâòîìîáèëÿ</param>         
    /// <param name="mainColor">Îñíîâíîé öâåò êóçîâà</param>       
    /// <param name="dopColor">Äîïîëíèòåëüíûé öâåò</param>         
    public DumpTruck(int maxSpeed, float weight, Color mainColor, Color dopColor, boolean body)   
    {
    	super(maxSpeed, weight, mainColor);
        setDopColor(dopColor);
        setBody(body);
    } 

    /// <summary>        
    /// Îòðèñîâêà      
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
    public void setDopColor(Color dopColor) {
    	this.dopColor = dopColor;
    }
    /// <summary>
    /// Êîíñòðóêòîð
    /// </summary>
    /// <param name="maxSpeed">Ìàêñèìàëüíàÿ ñêîðîñòü</param>
    /// <param name="weight">Âåñ àâòîìîáèëÿ</param>
    /// <param name="mainColor">Îñíîâíîé öâåò êóçîâà</param>
    /// <param name="dopColor">Äîïîëíèòåëüíûé öâåò</param>        
            
    public DumpTruck(int maxSpeed, float weight, Color mainColor, Color dopColor)
    {
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setMainColor(mainColor);
        setDopColor(dopColor);
    } 
    /// <summary>
    /// Óñòàíîâêà ïîçèöèè 
    /// </summary>
    /// <param name="x">Êîîðäèíàòà X</param>
    /// <param name="y">Êîîðäèíàòà Y</param>
    /// <param name="width">Øèðèíà êàðòèíêè</param>
    /// <param name="height">Âûñîòà êàðòèíêè</param>      
    public void SetPosition(int x, int y, int width, int height)
    {
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }

  /// <summary>
    /// Èçìåíåíèå íàïðàâëåíèÿ ïåðìåùåíèÿ
    /// </summary>
    /// <param name="direction">Íàïðàâëåíèå</param>
    public void MoveTransport(Direction direction)
    {
        float step = maxSpeed * 100 / weight;
        switch (direction)
        {
            // âïðàâî                
            case Right:
                if (_startPosX + step < _pictureWidth - dumptruckWidth)
                {
                    _startPosX += step;
                }
                break;
            //âëåâî                
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            //ââåðõ                
            case Up:
                if (_startPosY - step > 0)
                {
                    _startPosY -= step;
                }
                break;
            //âíèç             
            case Down:
                if (_startPosY + step < _pictureHeight - dumptruckHeight)
                {
                    _startPosY += step;
                }
                break;
        }
    } 

  /// <summary>
    /// Îòðèñîâêà 
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
