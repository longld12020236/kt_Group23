mport java.util.ArrayList;
import java.util.Scanner;


public class Camera {

	ArrayList listXedivao;
	ArrayList listXedira;
	ArrayList listXevipham;
	int soxevipham;
	int soxevaoham;
	
	public Camera(){
		listXedivao = new ArrayList();
		listXedira = new ArrayList();
		listXevipham = new ArrayList();
		soxevaoham = 0;
		soxevipham = 0;
	}
	
	public void nhap_soxevaoham(){
		Scanner inp = new Scanner(System.in);
        System.out.print("Nhap so xe di vao ham: ");
        this.soxevaoham = inp.nextInt();
	}
	
	public void nhap_listXedivao(){
		Scanner inp = new Scanner(System.in);
        System.out.print("Nhap cac bien so xe di vao ham: \n");
        for(int i=0;i<soxevaoham;i++){
        	System.out.print("Bien so xe thu "+ (i+1) + " :");
        	String s = inp.nextLine();
        	listXedivao.add(s);
        }
	}
	
	public void nhap_listXedira(){
		Scanner inp = new Scanner(System.in);
        System.out.print("Nhap cac bien so xe di ra khoi ham: \n");
        for(int i=0;i<soxevaoham;i++){
        	System.out.print("Bien so xe thu "+ (i+1)+ " :");
        	String s = inp.nextLine();
        	listXedira.add(s);
        }
	}
	
	public void soxevipham(){
		String xedira;
		String xedivao;
		while(!listXedivao.isEmpty()&&!listXedira.isEmpty()){
			xedivao = (String)listXedivao.get(0);
			xedira = (String)listXedira.get(0);
			if(xedivao.equals(xedira)){

				listXedivao.remove(xedira);
				listXedira.remove(xedira);
				
			}else{
				soxevipham++;
				listXevipham.add(xedira);
				listXedivao.remove(xedira);
				listXedira.remove(xedira);
			}
		}
	}
	
	public static void main(String[] args) {
		Camera c = new Camera();
		c.nhap_soxevaoham();
		c.nhap_listXedivao();
		c.nhap_listXedira();
		c.soxevipham();
		
		System.out.print("So xe vi pham la: "+c.soxevipham + ",  ");
		System.out.print("Cac xe vi pham la: "+c.listXevipham.toString());
	}

}
