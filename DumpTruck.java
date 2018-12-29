package laba1; 

import java.awt.Color;
import java.awt.Graphics;
import java.util.Set;

public class DumpTruck {
	/// <summary>
    /// ����� ���������� ��������� 
    /// </summary>
    private float _startPosX;
    /// <summary>
    /// ������ ���������� ��������� 
    /// </summary>
    private float _startPosY;
    /// <summary>
    /// ������ ���� ���������
    /// </summary>
    private int _pictureWidth;
    //������ ���� ���������
    private int _pictureHeight;
    /// <summary>
    /// ������ ��������� 
    /// </summary>
    private int dumptruckWidth = 100;
    /// <summary>
    /// ������ ��������� 
    /// </summary>
    private  int dumptruckHeight = 60;
    /// <summary>
    /// ������������ ��������
    /// </summary>
    private int maxSpeed;
    public int getMaxSpeed() {
    	return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
    	this.maxSpeed = maxSpeed;
    } 
    /// <summary>
    /// ��� 
    /// </summary>
    private float weight;
    public float getWeight() {
    	return weight;
    }
    public void setWeight(float weight) {
    	this.weight = weight;
    } 
    /// <summary>
    /// /// �������� ���� ������
    /// </summary>
    private Color mainColor;
    public Color getMainColor() {
    	return mainColor;
    }
    public void setMainColor(Color mainColor) {
    	this.mainColor = mainColor;
    }
    /// <summary>
    /// �������������� ����
    /// </summary>
    private Color dopColor;
    public Color getDopColor() {
    	return dopColor;
    }
    public void setDopColor(Color dopColor) {
    	this.dopColor = dopColor;
    }
    /// <summary>
    /// �����������
    /// </summary>
    /// <param name="maxSpeed">������������ ��������</param>
    /// <param name="weight">��� ����������</param>
    /// <param name="mainColor">�������� ���� ������</param>
    /// <param name="dopColor">�������������� ����</param>        
            
    public DumpTruck(int maxSpeed, float weight, Color mainColor, Color dopColor)
    {
        setMaxSpeed(maxSpeed);
        setWeight(weight);
        setMainColor(mainColor);
        setDopColor(dopColor);
    } 
    /// <summary>
    /// ��������� ������� 
    /// </summary>
    /// <param name="x">���������� X</param>
    /// <param name="y">���������� Y</param>
    /// <param name="width">������ ��������</param>
    /// <param name="height">������ ��������</param>      
    public void SetPosition(int x, int y, int width, int height)
    {
        _startPosX = x;
        _startPosY = y;
        _pictureWidth = width;
        _pictureHeight = height;
    }

  /// <summary>
    /// ��������� ����������� ����������
    /// </summary>
    /// <param name="direction">�����������</param>
    public void MoveTransport(Direction direction)
    {
        float step = maxSpeed * 100 / weight;
        switch (direction)
        {
            // ������                
            case Right:
                if (_startPosX + step < _pictureWidth - dumptruckWidth)
                {
                    _startPosX += step;
                }
                break;
            //�����                
            case Left:
                if (_startPosX - step > 0)
                {
                    _startPosX -= step;
                }
                break;
            //�����                
            case Up:
                if (_startPosY - step > 0)
                {
                    _startPosY -= step;
                }
                break;
            //����             
            case Down:
                if (_startPosY + step < _pictureHeight - dumptruckHeight)
                {
                    _startPosY += step;
                }
                break;
        }
    } 

  /// <summary>
    /// ��������� 
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
