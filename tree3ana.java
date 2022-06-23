package tree3;

public class tree3ana {

	public static void main(String[] args) {
		tree3uygulama agac=new tree3uygulama();
		agac.d=agac.ekle(agac.d,5);
		agac.d=agac.ekle(agac.d,3);
		agac.d=agac.ekle(agac.d,6);
		agac.d=agac.ekle(agac.d,2);
		agac.d=agac.ekle(agac.d,4);
		agac.d=agac.ekle(agac.d,7);
		agac.d=agac.ekle(agac.d,0);
		agac.d=agac.ekle(agac.d,-1);
		agac.inorder(agac.d);

	}

}
