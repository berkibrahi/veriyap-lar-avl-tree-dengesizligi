package tree3;

public class node {
	int veri;
	int yukseklik;
	node sol;
	node sag;
	
	public node(int veri, int yukseklik, node sol, node sag) {
		super();
		this.veri = veri;
		this.yukseklik = yukseklik;
		this.sol = sol;
		this.sag = sag;
	}

	public node(int data) {
		
		this.veri= data;
		yukseklik = 1;
		sag=null;
		sol=null;
		
	

}
}