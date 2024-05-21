class C {
  int p34;
  int p30;
  int p12;
  int p36;
  int p39;
  long p4;
  long p23;
  long p1;
  int[] p38 = {3, 3, 2, 3, 0};
  int[] p13 = {-2, 1, -3, 1, 2};
  int[] p32 = {1, 3, 3, 2};
  static int p10;
  static int p26;
  static int p29;
  static int p33;
  static int p21;
  public C() {
    p34 = 6;
    p30 = 9;
    p12 = 6;
    p36 = 3;
    p39 = 6;
    p4 = 4L;
    p23 = 6L;
    p1 = 2L;
  }
  public void p19() {
    System.out.println("метод p19 в классе C");
    System.out.println(p39 << 2);
  }
  public void p31() {
    System.out.println("метод p31 в классе C");
    System.out.println(p12 + 1);
  }
  public void p14() {
    System.out.println("метод p14 в классе C");
    System.out.println(p30 - 5);
  }
  public void p8() {
    System.out.println("метод p8 в классе C");
    System.out.println(p32[2]);
  }
  public void p18() {
    System.out.println("метод p18 в классе C");
    System.out.println(p36--);
  }
  public void p3() {
    System.out.println("метод p3 в классе C");
    System.out.println(++p12);
  }
  public static void p15() {
    System.out.println("метод p15 в классе C");
    System.out.println(p33);
  }
  public static void p28() {
    System.out.println("метод p28 в классе C");
    System.out.println((p33 + 3));
  }
  public static void p11() {
    System.out.println("метод p11 в классе C");
    System.out.println(p21);
  }
  public static void p25() {
    System.out.println("метод p25 в классе C");
    System.out.println((p21 + 1));
  }
  public void p37(C r) {
    r.p19();
  }
  public void p37(A r) {
    r.p31();
  }
}
