package wrapperclass;

public class WrapperClassExample {
  private   int i = 10;
    private   float f = 10.0f;
    private double d = 10.25d;
    private char ch = 's';
    private boolean bl = true;
    private byte b = 22;
    private short s = 36;
    private long l = 123456987;

  public int getI() {
    return i;
  }

  public float getF() {
    return f;
  }

  public double getD() {
    return d;
  }

  public char getCh() {
    return ch;
  }

  public boolean isBl() {
    return bl;
  }

  public byte getB() {
    return b;
  }

  public short getS() {
    return s;
  }

  public long getL() {
    return l;
  }

  private Integer ainteger = new Integer (i);
    private Float   aFloat   = new Float(f);
    private Double  aDouble  = new Double(d);
    private Character character = new Character(ch);
    private Boolean   aBoolean  = new Boolean(bl);
    private Byte      aByte  = new Byte(b);
    private Short     aShort = new Short(s);
    private Long      aLong  = new Long(l);
    void display(){
      System.out.println(i);
      System.out.println(ainteger);
      System.out.println("this is a boxing");

    }


//    public static void main(String[] args) {
//     //Integer i = 10;
//     // Integer j = new Integer(10);
//      Byte b= 120;
//      System.out.println("the value of :" + b  );

    }

