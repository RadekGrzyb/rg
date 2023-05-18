public class zad18 {
    public static void main(String[] args){
        double akcje=600, cena=21.77,x,y,z,pro=0.02;
        x=cena*akcje;
        System.out.println("Kwota zaplacona za same akcje: " + x);
        z=x*pro;
        System.out.println("Cena prowizji: " + z);
        y=x+z;
        System.out.println("Łączna cena: " + y);

    }
}
