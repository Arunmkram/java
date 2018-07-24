

import java.io.*;

public class exp9{
public static void main(String[] args) {
	double area,perimeter;

	try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter the radius of circle");
	double radius=Double.parseDouble(br.readLine());

	area=Math.PI*radius*radius;
	perimeter=2*Math.PI*radius;

	System.out.println("area of circle: "+area);
	System.out.println("perimeter of circle: "+perimeter);
	}

	catch(IOException e){
		System.out.println("error in input");
	}

}
}
