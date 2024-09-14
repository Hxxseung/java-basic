package oop1.ex.Rectangle;

public class Rectangle {
    int width;
    int height;

    int calculateArea(){                //static int로 하면 정적변수로 인해 여기서 설정한 값으로만 진행되기 때문에 일반적인 int형을 사용해저야함.
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * ( width + height );
    }

    boolean isSquare(){
        return this.width == this.height;
    }
}
