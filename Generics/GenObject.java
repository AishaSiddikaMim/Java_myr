public class GenObject {
    private Object a;

    public void setObj(Object a) {
        this.a = a;
    }

    public Object getObj() {
        return this.a;
    }

    public static void main(String[] args) {
        GenObject genObject = new GenObject();
        genObject.setObj("Hello");
        String s = (String) genObject.getObj();
        System.out.println(s);

        genObject.setObj(10);
        Integer i = (Integer) genObject.getObj();
        System.out.println(i);
    }
}


