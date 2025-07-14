public class AccessSpecifiers {
    protected void hi(){
        System.out.println("hi from access specifier class");
    }

    public static void main(String[] args){
        Mass obj = new Mass();
        obj.hi();
    }
}

    class Mass {
    protected void hi(){
        System.out.println("hi from Mass class");
    }
}