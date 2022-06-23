package tree3;



public class tree3uygulama {
	node d;
	

  
	int getYukseklik(node d){
        if(d==null){
            return 0;
        }
        return d.yukseklik;
    }
    int getBalance(node d){
         if(d==null){
             return 0;
         }
         return getYukseklik(d.sol)-getYukseklik(d.sag);
     }
    node solaDondur(node p){
        node pr=p.sag;
       node prl=pr.sol;

         //sola döndürme
         p.sag=prl;
         pr.sol=p;

         //yükseklikleri güncelle
         p.yukseklik=Math.max(getYukseklik(p.sol),getYukseklik(p.sag))+1;
         pr.yukseklik=Math.max(getYukseklik(pr.sol),getYukseklik(pr.sag))+1;

         return pr;
     }
    node sagaDondur(node p){
        node pl=p.sol;
       node plr=pl.sag;

         //sola döndürme
         p.sol=plr;
         pl.sag=p;

         //yükseklikleri güncelle
         p.yukseklik=Math.max(getYukseklik(p.sol),getYukseklik(p.sag))+1;
         pl.yukseklik=Math.max(getYukseklik(pl.sol),getYukseklik(pl.sag))+1;

         return pl;
     }
    node ekle(node d,int deger) {
    	 if(d==null){
    		
             return (new node(deger));
         }
    	  if(deger<d.veri){
              d.sol=ekle(d.sol, deger);
          }
          else{
              d.sag=ekle(d.sag,deger);
          }
    	  d.yukseklik=Math.max(getYukseklik(d.sol),getYukseklik(d.sag))+1;
    	  //balance faktörü hesapla
          int bf=getBalance(d);
    	
          if(bf>1 && deger<d.sol.veri){
              return sagaDondur(d);

          }
          //RR durumu
          if(bf<-1  && deger > d.sag.veri){
              return solaDondur(d);
          }
          //LR dengesizliði
          if(bf>1   && deger > d.sol.veri){
              d.sol=solaDondur(d.sol);
              return sagaDondur(d);
          }

          //RL dengesizliði

          if(bf < -1  && deger < d.sag.veri){
              d.sag=sagaDondur(d.sag);
              return solaDondur(d);
          }
          return d;
        		  
    }
    void inorder(node d) {
    	if(d!=null) {
    	
    	inorder(d.sol);
    	System.out.print(d.veri + " ");
    	inorder(d.sag);
    	}
    }

}
