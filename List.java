package TPList;

public class List {
    private Object info;
    private List suiv;
    private int length;

    public List(){
        this.suiv = null;
        this.length = 0;
    }

    public void insertAT(Object info,int pos){
        if(est_vide()){
            List elem = new List();
            elem.info = info;
            this.suiv = elem;
            elem.suiv = null;
            length++;
        }else{
            if(pos<=length){
                add(info,pos);

            }else{
                throw new IndexOutOfBoundsException();
            }
        }
    }
    public Object acces(int pos){
        List x = this.suiv;
        if(pos<length){
            for(int i=0;i<pos;i++){
                x = next(x);
            }
        }else{
            throw new IndexOutOfBoundsException();
        }
        return x.info;
    }

    public List next(List l){return l.suiv;}

    private void add(Object info,int pos ){
        length++;
        List l = new List();
        l.info = info;
        l.suiv=null;

        List x = this.suiv;
        List y = x;

        if(pos==0){
            l.suiv = this.suiv;
            this.suiv = l;
        }else{
            for(int i =0;i<pos;i++){
                y = x;
                x = x.suiv;
            }
            l.suiv = y.suiv;
            y.suiv = l;
        }

    }


    public boolean est_vide(){
        return this.length == 0;
    }
    public int Length(){return this.length;}
}
