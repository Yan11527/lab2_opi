class A extends C {
  public A() {
    p12 = 6;
    p36 = 7;
    p39 = 5;
    p23 = 6L;
  }
  public void p31() {
    System.out.println("метод p31 в классе A");
    System.out.println(p34 >> 2);
  }
  public void p18() {
    System.out.println("метод p18 в классе A");
    System.out.println(p30 + 5);
  }
  public void p3() {
    System.out.println("метод p3 в классе A");
    System.out.println(p32[1] - p32[2]);
  }
  public static void p15() {
    System.out.println("метод p15 в классе A");
    System.out.println((p10 + 3));
  }
  public static void p28() {
    System.out.println("метод p28 в классе A");
    System.out.println(++p10);
  }
  public static void p11() {
    System.out.println("метод p11 в классе A");
    System.out.println(p26);
  }
  public static void p25() {
    System.out.println("метод p25 в классе A");
    System.out.println((p26 + 5));
  }
  public void p37(C r) {
    r.p14();
  }
  public void p37(A r) {
    r.p8();
  }
}
