

public class Linked_List {
    private class Element{
        public Object info;
        public Element next;

    }
    private Element head;
    private int length;


    public Linked_List(){

        head = null;
        this.length = 0;

    }

    public void insertAT(Object info,int pos){
        if(is_empty()){

            Element elem = new Element();
            elem.info = info;

            head = elem;
            elem.next = null;
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

        Element x = head;
        if(pos<length){
            for(int i=0;i<pos;i++){
                x = next(x);
            }
        }else{
            throw new IndexOutOfBoundsException();
        }
        return x.info;
    }

    private Element next(Element l){return l.next;}

    private void add(Object info,int pos ){
        length++;

        Element l = new Element();
        l.info = info;
        l.next=null;

        Element x = head;

        if(pos==0){
            l.next = head;
            head = l;
        }else{
            for(int i =0;i<pos-1;i++){
                x = next(x);
            }

            l.next = x.next;
            x.next = l;
        }

    }


    public boolean is_empty(){
        return this.length == 0;
    }
    public int Length(){return this.length;}
}
