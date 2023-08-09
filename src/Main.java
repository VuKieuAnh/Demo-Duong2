public class Main {
    public static void main(String[] args) {
        GiamDoc gd = new GiamDoc();
        ThuKy duong = new ThuKy("Duong", gd);
        ThuKy duong2 = new ThuKy("Hien", gd);
        duong2.thucThi();
    }
}
