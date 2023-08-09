public class ThuKy implements IDoSomething {
    private String name;
    private GiamDoc giamDoc;

    public ThuKy(String name, GiamDoc giamDoc) {
        this.name = name;
        this.giamDoc = giamDoc;
    }

    @Override
    public void thucThi() {
        if (name.equals("Duong"))
            giamDoc.thucThi();
        else throw new RuntimeException("Khong hop le");
    }
}
