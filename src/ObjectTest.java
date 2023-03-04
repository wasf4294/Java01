class Tv{
    String color;   // 색상
    boolean power;  // 전원상태 (on/off)
    int channel;    // 채널

    // 메서드

    void power()    {power = !power;}
    void channelUp()    {++channel;}
    void channelDown()  {--channel;}
}

class MainTest{
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println(t1.channel); //객체는 만들어졌으나 변수에 값이 없음. 0이 출력됨.

        t1.channel = 5;         //인스턴스 t1의 정수형인스턴스변수 channel 에 5를 넣는다.
        System.out.println(t1.channel); //5가 출력.
        t1.channelUp();         //메서드 실행 1 증가
        System.out.println(t1.channel); //6이 출력.


        System.out.println(t2.channel);     //0 출력
        t2.channel = 3;     //변수에 3입력
        System.out.println(t2.channel);     //3 출력
        t2.channelDown();
        System.out.println(t2.channel);     //2 출력
    }
}
