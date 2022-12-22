package ATM;

import lombok.Setter;

public class Handler1 extends Handler {

    @Override
    public void process(int price) {
        System.out.println(price / 1 + " * 1");
        Handler next = getNext();
        if (next != null) {
            getNext().process(price % 1);
        }
    }
}
