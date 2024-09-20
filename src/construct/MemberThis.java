package construct;

public class MemberThis {
    public String nameField;

    public void initMember(String nameParameter){
        nameField = nameParameter; //nameField에는 매개변수로 없기 때문에 this가 생략되어 표시된다. (this를 넣어도 같은 결과가 나온다)
    }
}
