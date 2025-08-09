interface Printable{
    void print();
    
    default void progress(){
        System.out.println("Printing in progress.... ");
    }
}

interface Scannable{
    void scan();
}


class MultiFunctionPrinter implements Printable , Scannable{
    @Override
    public void print(){
        System.out.println("Printing in done");
    }
    @Override 
    public void scan(){
        System.out.println("Scanning in done");
    }
}