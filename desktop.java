package oopsAssignments;

public class desktop implements HardWare,SoftWare {
public void hardwareResources() {
	System.out.println("Hardware");
}
public void desktopMode()
{
	System.out.println("desktop mode");
}
public void softwareResource()
{
	System.out.println("software resource");
}
public static void main(String[] args) {
	desktop obj=new desktop();
	obj.desktopMode();
	obj.hardwareResources();
	obj.softwareResource();
}
}
