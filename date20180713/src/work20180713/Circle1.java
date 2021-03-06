package work20180713;

/*练习1（基础）：
（1）编写一个圆类Circle，该类拥有：
①一个成员变量
Radius（私有，浮点型）；  // 存放圆的半径；
②两个构造方法
Circle( )                 // 将半径设为0
Circle(double  r )         //创建Circle对象时将半径初始化为r
③ 三个成员方法
double getArea( )       //获取圆的面积
double getPerimeter( )   //获取圆的周长
void  show( )          //将圆的半径、周长、面积输出到屏幕
（2）编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
①一个成员变量
double hight（私有，浮点型）；  // 圆柱体的高；
②构造方法
Cylinder (double r, double  h )           //创建Circle对象时将半径初始化为r
③ 成员方法
double getVolume( )             //获取圆柱体的体积
void  showVolume( )             //将圆柱体的体积输出到屏幕
编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并显示圆半径、圆面积、圆周长，圆柱体的体积。
*/
public class Circle1 {
	//一个成员变量
	private double radius;

	
	//两个构造方法
	
	public Circle1(double r) {
		super();
		this.radius = r;
	}


	public Circle1() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//三个成员方法
	
	public double getArea() {
		double area  = radius*radius*Math.PI;
		return area;
	}
	
	public double getPerimeter()
	{
		double per = 2*Math.PI*radius;
		return per;
	}
	public void show()
	{
		System.out.println("半径:"+getRadius());
		System.out.println("圆的面积:"+getArea());
		System.out.println("圆的周长:"+getPerimeter());
	}
	
	
	
}
